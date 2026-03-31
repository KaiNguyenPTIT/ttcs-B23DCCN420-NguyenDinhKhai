Exception Hanndling trong Spring Boot

1. Mục đích của Exception Handling trong REST

- Exception Handling dùng để xử lý lỗi trong REST API một cách rõ ràng và tách biệt logic.
- Ý tưởng chính:
  Code chính -> throw exception Exception handler -> xử lý lỗi và trả response

- Nhờ vậy:
  - Code sạch hơn
  - Dễ quản lý lỗi
  - API trả lỗi chuẩn hơn cho client.

2. Các cách xử lý Exception trong Spring REST

- @ExceptionHandler: Dùng để viết method xử lý exception
- Local Exception Handling (trong Controller): Handler nằm trong controller
- Global Exception Handling (@ControllerAdvice): Dùng để xử lý lỗi cho toàn bộ application
- @ResponseStatus trong Exception: Có thể gắn status trực tiếp vào class exception
- ResponseStatusException: Controller có thể throw exception trực tiếp
- HandlerExceptionResolver: Cách nâng cao hơn để tự viết cơ chế xử lý exception

Trong thực tế: @ExceptionHandler + @ControllerAdvice là cách được dùng phổ biến nhất

Luồng hoạt động: Request -> Controller -> Service -> throw Exception -> GlobalExceptionHandler -> Trả JSON ErrorResponse
