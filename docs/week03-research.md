### Quan hệ giữa các entity trong JPA

| Mối Quan Hệ                           | Annotation (Bên Sở hữu)          | Annotation (Bên Đảo ngược, nếu hai chiều) | Cấu Trúc Bảng CSDL                                                            | Vai Trò Khóa Ngoại/Bảng Trung Gian    | Ví Dụ                                                                  |
| ------------------------------------- | -------------------------------- | ----------------------------------------- | ----------------------------------------------------------------------------- | ------------------------------------- | ---------------------------------------------------------------------- |
| One-to-One (1:1)                      | `@OneToOne` (với `@JoinColumn`)  | `@OneToOne` (với `mappedBy`)              | Một FK trong bảng của bên sở hữu trỏ đến PK của bên kia                       | Bên sở hữu chứa FK                    | 1 người dùng có 1 giỏ hàng                                             |
| One-to-Many (1:N) / Many-to-One (N:1) | `@ManyToOne` (với `@JoinColumn`) | `@OneToMany` (với `mappedBy`)             | Một FK trong bảng “nhiều” (Many side) trỏ đến PK của bảng “một” (One side)    | Bên “nhiều” (`@ManyToOne`) chứa FK    | 1 danh mục có nhiều sản phẩm, 1 người dùng có nhiều đơn hàng           |
| Many-to-Many (N:M)                    | `@ManyToMany` (với `@JoinTable`) | `@ManyToMany` (với `mappedBy`)            | Một bảng trung gian chứa hai FK, mỗi FK trỏ đến PK của một trong hai bảng gốc | Bên sở hữu định nghĩa bảng trung gian | 1 đơn hàng có nhiều sản phẩm và 1 sản phẩm có thể thuộc nhiều đơn hàng |

---

### REST API Best Practices

REST API là cách phổ biến để các hệ thống giao tiếp với nhau thông qua giao thức HTTP. Việc thiết kế REST API đúng chuẩn giúp hệ thống dễ mở rộng, dễ bảo trì và hoạt động hiệu quả hơn.

---

1. Sử dụng cấu trúc URI rõ ràng và nhất quán

- URI nên thể hiện mối quan hệ giữa các tài nguyên.
- Nên dùng danh từ (nouns) thay vì động từ.
- Sử dụng chữ thường (lowercase) để tránh lỗi.
- Dùng / để thể hiện quan hệ phân cấp và ? cho tham số truy vấn.
- Ví dụ:
  - GET /users/{userId}/orders/{orderId} // Nên dùng
  - GET /orders/{orderId}?userId=123 // Không nên dùng

---

2. Sử dụng đúng HTTP Methods

| Method  | Chức năng                            |
| ------- | ------------------------------------ |
| GET     | Lấy dữ liệu                          |
| POST    | Tạo tài nguyên mới                   |
| PUT     | Cập nhật hoặc thay thế tài nguyên    |
| DELETE  | Xóa tài nguyên                       |
| PATCH   | Cập nhật một phần tài nguyên         |
| OPTIONS | Kiểm tra các phương thức được hỗ trợ |

---

3. API nên Stateless

- REST API phải không lưu trạng thái của client trên server.
  - Mỗi request phải chứa đầy đủ thông tin cần thiết.
  - Server không lưu session giữa các request.
  - Điều này giúp hệ thống mở rộng và bảo mật tốt hơn.

4. Sử dụng Mã Phản hồi HTTP chuẩn một cách nhất quán

| Danh mục                       | Khoảng mã | Mô tả                                                        | Ví dụ                                                                             |
| ------------------------------ | --------- | ------------------------------------------------------------ | --------------------------------------------------------------------------------- |
| Thông tin (Informational)      | 1xx       | Cho biết yêu cầu đã được nhận và đang được xử lý.            | `100 Continue` <br> `101 Switching Protocols`                                     |
| Thành công (Successful)        | 2xx       | Cho biết yêu cầu đã được nhận, hiểu và chấp nhận thành công. | `200 OK` <br> `201 Created` <br> `204 No Content`                                 |
| Chuyển hướng (Redirection)     | 3xx       | Cho biết cần thực hiện thêm hành động để hoàn thành yêu cầu. | `301 Moved Permanently` <br> `302 Found` <br> `304 Not Modified`                  |
| Lỗi phía Client (Client Error) | 4xx       | Cho biết có lỗi xảy ra với yêu cầu từ phía người dùng.       | `400 Bad Request` <br> `401 Unauthorized` <br> `404 Not Found`                    |
| Lỗi phía Server (Server Error) | 5xx       | Cho biết máy chủ không thể xử lý một yêu cầu hợp lệ.         | `500 Internal Server Error` <br> `502 Bad Gateway` <br> `503 Service Unavailable` |

5. Versioning cho API

- Khi API thay đổi cần đảm bảo không làm hỏng ứng dụng đang sử dụng API.
- Các cách version phổ biến:
  - URI versioning: `/api/v1/users`
  - Header versioning: `X-API-Version: v1`
  - Content negotiation: `Accept: application/vnd.example.v1+json`

6. Đảm bảo Backward Compatibility

- API mới không nên phá vỡ API cũ.
- Cần có thời gian deprecate cho version cũ.
- Tài liệu API phải ghi rõ thay đổi giữa các phiên bản.

7. Rate Limiting

- Giới hạn số lượng request để:
  - Tránh DoS attack
  - Ngăn quá tải server
  - Đảm bảo công bằng giữa các client
- Ví dụ:
  - 100 request / phút
  - Cho phép một khách hàng chỉ thực hiện tối đa 2 yêu cầu cùng một lúc

8. Sử dụng Cache

- Cache giúp:
  - Giảm tải server
  - Tăng tốc độ phản hồi
- Một số header thường dùng:
  - Cache-Control: Quy định thời gian cache
  - ETag: Kiểm tra phiên bản tài nguyên
  - Last-Modified: Thời điểm dữ liệu cập nhật

9. Filtering, Sorting và Pagination

- Khi API trả về nhiều dữ liệu cần:
  - Filtering: `GET /products?category=electronics`
  - Sorting: `GET /products?sort=price`
  - Pagination: `GET /products?page=3&size=10`
- Điều này giúp cải thiện hiệu năng và trải nghiệm người dùng

10. Bảo mật API

- Một số nguyên tắc bảo mật:
  - Sử dụng HTTPS
  - Authentication: OAuth2, API Key, JWT
  - Kiểm tra dữ liệu đầu vào
  - Sử dụng security headers

11. Tài liệu API rõ ràng

- API nên có documentation đầy đủ gồm:
  - Ví dụ request/response
  - Mô tả endpoint
  - Hướng dẫn sử dụng
  - Một API tốt luôn đi kèm tài liệu dễ hiểu và đầy đủ
