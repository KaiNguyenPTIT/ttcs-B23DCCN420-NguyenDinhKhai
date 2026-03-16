===================== Spring Boot====================  

---------------------Tổng quan Spring Boot-----------  

<<<<<<< HEAD
- Spring Boot là framework Java xây dựng trên nền Spring, giúp phát triển ứng dụng nhanh hơn nhờ auto-configuration, giảm code cấu hình và tích hợp server nhúng để chạy ứng dụng ngay. Nó hỗ trợ xây dựng web app, REST API, microservices, bảo mật và triển khai cloud  

- Lý do nên học Spring Boot:
  + Phát triển nhanh: Tạo ứng dụng sẵn sàng chạy với ít cấu hình
  + Auto-Configuration: Giảm code lặp, tập trung vào business logic
  + Phù hợp microservices: Dễ xây dựng hệ thống phân tán
  + Tích hợp tốt: Kết nối dễ với database, security, messaging và cloud
  + Được dùng rộng rãi: Phổ biến trong các hệ thống doanh nghiệp
=======
- Spring Boot là framework Java xây dựng trên nền Spring, giúp phát triển ứng dụng nhanh hơn nhờ auto-configuration, giảm code cấu hình và tích hợp server nhúng để chạy ứng dụng ngay. Nó hỗ trợ xây dựng web app, REST API, microservices, bảo mật và triển khai cloud

- Lý do nên học Spring Boot:
  - Phát triển nhanh: Tạo ứng dụng sẵn sàng chạy với ít cấu hình
  - Auto-Configuration: Giảm code lặp, tập trung vào business logic
  - Phù hợp microservices: Dễ xây dựng hệ thống phân tán
  - Tích hợp tốt: Kết nối dễ với database, security, messaging và cloud
  - Được dùng rộng rãi: Phổ biến trong các hệ thống doanh nghiệp
>>>>>>> e297b0e (cap nhat nhiem vu va tien do hoan thanh tuan 3)

-----------------Kiến trúc Spring Boot--------------

- các Layer sau:
<<<<<<< HEAD
  + Client Layer: Là người dùng hoặc hệ thống bên ngoài gửi HTTPS request đến ứng dụng
  + Controller Layer: Nhận request từ client, xử lý ban đầu và gọi Service Layer để thực hiện logic
  + Service Layer: Chứa logic nghiệp vụ chính, xử lý dữ liệu và gọi Repository Layer khi cần truy cập database
  + Repository Layer: Thực hiện các thao tác CRUD với database thông qua Spring Data JPA
  + Model Layer: Các entity/domain model đại diện cho bảng trong database
=======
  - Client Layer: Là người dùng hoặc hệ thống bên ngoài gửi HTTPS request đến ứng dụng
  - Controller Layer: Nhận request từ client, xử lý ban đầu và gọi Service Layer để thực hiện logic
  - Service Layer: Chứa logic nghiệp vụ chính, xử lý dữ liệu và gọi Repository Layer khi cần truy cập database
  - Repository Layer: Thực hiện các thao tác CRUD với database thông qua Spring Data JPA
  - Model Layer: Các entity/domain model đại diện cho bảng trong database
>>>>>>> e297b0e (cap nhat nhiem vu va tien do hoan thanh tuan 3)

- Luồng hoạt động: Client -> Controller -> Service -> Repository -> Database -> Response
