===================== Spring Boot====================

---------------------Tổng quan Spring Boot-----------

- Spring Boot là framework Java xây dựng trên nền Spring, giúp phát triển ứng dụng nhanh hơn nhờ auto-configuration, giảm code cấu hình và tích hợp server nhúng để chạy ứng dụng ngay. Nó hỗ trợ xây dựng web app, REST API, microservices, bảo mật và triển khai cloud.

- Lý do nên học Spring Boot:
  - Phát triển nhanh: Tạo ứng dụng sẵn sàng chạy với ít cấu hình.
  - Auto-Configuration: Giảm code lặp, tập trung vào business logic.
  - Phù hợp microservices: Dễ xây dựng hệ thống phân tán.
  - Tích hợp tốt: Kết nối dễ với database, security, messaging và cloud.
  - Được dùng rộng rãi: Phổ biến trong các hệ thống doanh nghiệp.

-----------------Kiến trúc Spring Boot--------------

- các Layer sau:
  - Client Layer: Là người dùng hoặc hệ thống bên ngoài gửi HTTPS request đến ứng dụng
  - Controller Layer: Nhận request từ client, xử lý ban đầu và gọi Service Layer để thực hiện logic
  - Service Layer: Chứa logic nghiệp vụ chính, xử lý dữ liệu và gọi Repository Layer khi cần truy cập database
  - Repository Layer: Thực hiện các thao tác CRUD với database thông qua Spring Data JPA.
  - Model Layer: Các entity/domain model đại diện cho bảng trong database.

- Luồng hoạt động: Client -> Controller -> Service -> Repository -> Database -> Response

=====================REST API=====================
--------------------------Kiến trúc REST API--------------------------

- REST API(Representational State Transfer API) là phương thức giao tiếp giữa client và server thông qua HTTP.- Các method thường dùng:
  GET: Lấy dữ liệu
  POST: Tạo dữ liệu
  PUT: Cập nhật toàn bộ dữ liệu
  PATCH: Cập nhật 1 phần dữ liệu
  DELETE: Xóa dữ liệu

- Ví dụ:
  GET /products
  POST /products
  PUT /products/{id}
  DELETE /products/{id}

------------------CRUD API với Spring BOOT----------

- Thực thành link:
