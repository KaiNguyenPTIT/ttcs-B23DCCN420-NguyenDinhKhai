=====================REST API=====================  
--------------------------Kiến trúc REST API--------------------------

- REST API(Representational State Transfer API) là phương thức giao tiếp giữa client và server thông qua HTTP
- Các method thường dùng:
  - GET: Lấy dữ liệu
  - POST: Tạo dữ liệu
  - PUT: Cập nhật toàn bộ dữ liệu
  - PATCH: Cập nhật 1 phần dữ liệu
  - DELETE: Xóa dữ liệu

- Ví dụ:
  - GET /products
  - POST /products
  - PUT /products/{id}
  - DELETE /products/{id}

------------------CRUD API với Spring BOOT----------

Một project chuẩn cơ bản sẽ có 4 lớp: Entity, Repository, Service, Controller

- Entity: lớp thực thể đại diện cho bảng trong csdl
  - Các Anotation thường dùng: @Entity, @Id,..
- Repository: Lớp làm việc trực với csdl xử lí các nhiệm vụ như thêm sửa xóa
  - @Repository và thường extends JpaRepository để dùng các hàm có sẵn như: save(), findAll(),..
- Service: Lớp xử lí logic nghiệp vụ, gọi repository để thao tác với csdl
  - @Service
- Controller: Lớp nhận request từ client và trả về gọi service trả về dữ liệu hoặc điều hướng
  - @RestController, @Controller

Cách hoạt động:
Client -> Controller -> Service -> Repository -> Database
