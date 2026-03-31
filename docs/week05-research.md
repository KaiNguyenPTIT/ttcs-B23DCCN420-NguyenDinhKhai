Tổng quan về JWT

1. Khái niệm

- JWT (JSON Web Token) là một chuỗi token dùng để truyền dữ liệu an toàn giữa client và server
- Dữ liệu trong JWT được ký bằng các phương pháp mã hóa
- Cụ thể thường dùng để: Xác thực (Authentication) và phân quyền (Authorization)

2. Cấu trúc (gồm 3 phần)

- Header: Chứa metadata
  - vd: thuật toán để ký (HS512)
- Payload: Chứa claims (dữ liệu) được truyền
  - vd: name, role, iss(người phát hành), exp(thời gian hết hạn),...
- Signature: Header + Payload + Secret key, để đảm bảo tính toàn vẹn và xác thực của token

3. Cách hoạt động (ví dụ cho trường hợp xác thực)

- Yêu cầu đăng nhập: người dùng gửi yêu cầu thông tìn xác thực (username, password,..) đến máy chủ
- Máy chủ tạo JWT: nếu thông tin xác thực đúng thì máy chủ sẽ tạo một token JWT được mã hóa
- Máy chủ trả về JWT: máy chủ gửi JWT về cho ứng dụng khách
- Yêu cầu tiếp theo với JWT: Đối với bất kỳ yêu cầu tiếp theo nào, client gửi JWT kèm theo yêu cầu. Máy chủ xác thực JWT trước khi cấp quyền truy cập vào các tài nguyên được bảo vệ
