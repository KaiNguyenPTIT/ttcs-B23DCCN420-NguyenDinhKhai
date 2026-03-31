1. Khái niệm

- Spring Security hoạt động dựa trên Filter của Servlet
- Mọi request đều đi qua chuỗi filter trước khi vào Controller: nếu request không hợp lệ thì phủ quyết ngay tại Filter và trả về cho client
- Mỗi filter xử lý 1 việc: xác thực (login), phân quyền, chống tấn công
- Thứ tự của Filter rất quan trọng

2. Kiến trúc

- Client -> DelegatingFilterProxy -> FilterChainProxy -> FilterSecurity -> Servlet -> Controller -> Service -> Resipotory
  - DelegatingFilterProxy: nối Servlet với Spring
  - FilterChainProxy là Filter quan trọng nhất, quản lý toàn bộ filter
  - SecurityFilterChain: chọn filter theo URL
