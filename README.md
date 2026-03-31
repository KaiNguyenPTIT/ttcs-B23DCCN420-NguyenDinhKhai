# Thực tập Cơ sở – Kế hoạch & Tiến độ 08 Tuần

---

## 1. Thông tin sinh viên

- **Họ tên: Nguyễn Đình Khải**
- **MSSV: B23DCCN420**
- **Lớp: D23CQCN14-B**
- **Email: nguyendinhkhai17102005@gmail.com**
- **GitHub username: KaiNguyenPTIT**
- **Link repository: https://github.com/KaiNguyenPTIT/ttcs-B23DCCN420-NguyenDinhKhai**

---

## 2. Định hướng & Mục tiêu

> Trả lời 3 câu hỏi này trước khi xác định kỹ năng:

**Tôi muốn làm vai trò gì sau khi ra trường?**

> Backend Developer

**Kỹ năng tôi còn thiếu / yếu trong vai trò đó là gì?**

> Xây dựng RESTful API chuẩn  
> Sử dụng JPA/Hibernate hiệu quả  
> Authentication & Authorization với JWT

**Tôi có thể học và thực hành được kỹ năng đó trong 8 tuần không?**

> Có, thông qua việc xây dựng backend cho hệ thống bán sản phẩm.

---

## 3. Đăng ký chủ đề thực tập

**Định hướng:**

- [x] Cải thiện / củng cố kỹ năng đang có _(7–8)_
- [x] Học kỹ năng mới / theo trend _(8–9)_
- [ ] Gắn với nghiên cứu / đề tài / dự án _(9–10)_

**1–3 kỹ năng chính muốn học / cải thiện:**

> _(Ví dụ: REST API với FastAPI, Docker & Docker Compose, CI/CD với GitHub Actions, ...)_

1. REST API với Spring Boot (học)
2. JPA/Hibernate (cải thiện)
3. Authentication & Authorization bằng JWT (học)

**Bài toán / nội dung áp dụng cụ thể:**

1. Xây dựng backend cho hệ thống bán sản phẩm (ví dụ web bán nước hoa) sử dụng REST API để cung cấp các API cho frontend
2. Dữ liệu được quản lý bằng JPA và Hibernate để thao tác với database
3. Hệ thống sử dụng JWT để xác thực người dùng khi đăng nhập và bảo vệ các API.

**Làm việc nhóm (nếu có): không**

> _(Họ tên, MSSV của thành viên nhóm)_

---

## 4. Kế hoạch thực hiện 08 tuần

> **Nguyên tắc:** Đọc → Hiểu → Thực hiện. Không bỏ qua bước nào.
>
> Mỗi tuần gồm **2 phần**:
>
> - **Tìm hiểu / Đọc:** Tài liệu, khái niệm, ví dụ tham khảo
> - **Thực hành:** Làm thử, ghi lại kết quả
>
> Kết quả đầu ra: file `.md` ghi chú, link code, screenshot, hoặc demo URL

---

### Tuần 1 – Khởi động & Tìm hiểu nền tảng

_Mục tiêu tuần: Nắm vững khái niệm cốt lõi trước khi thực hành_

**Tìm hiểu / Đọc:**
| Nội dung | Nguồn | Trạng thái | Ghi chú |
|---|---|---|---|
| Tổng quan Spring Boot | https://www.geeksforgeeks.org/advance-java/spring-boot/ | [x] | [week01-research.md](docs/week01-research.md) |
| Kiến trúc Spring Boot | https://www.geeksforgeeks.org/springboot/introduction-to-spring-boot/ | [x] | [week01-research.md](docs/week01-research.md) |

**Thực hành:**
| Nhiệm vụ | Kết quả đầu ra | Trạng thái | Ghi chú |
|---|---|---|---|
| Tạo project Spring Boot bằng Spring Initializr | [Link kết quả đầu ra](https://docs.google.com/document/d/1sqEcDQpNJBBbvCJUXVmdpohDjKPPtrE7OGWhGO8riEQ/edit?usp=sharing) | [x] | |
| Tạo cấu trúc các layer (model, controller, service, repository) |[Cấu trúc](src/samples/demo/src/main/java/com/example/demo) | [x] | |

---

### Tuần 2 – Triển khai cơ bản _(Buổi trao đổi 1)_

_Mục tiêu tuần: Áp dụng được kiến thức tuần 1 vào thực tế_

**Tìm hiểu / Đọc:**
| Nội dung | Nguồn | Trạng thái | Ghi chú |
|---|---|---|---|
| Kiến trúc REST API | https://www.geeksforgeeks.org/node-js/rest-api-introduction/ | [x] | [week02-research.md](docs/week02-research.md) |
| CRUD API với Spring Boot | https://www.geeksforgeeks.org/java/spring-boot-crud-operations/ | [x] | [week02-research.md](docs/week02-research.md) |

**Thực hành:**
| Nhiệm vụ | Kết quả đầu ra | Trạng thái | Ghi chú |
|---|---|---|---|
| Tạo REST Controller đơn giản |[HelloController](src/samples/demo/src/main/java/com/example/demo/controller/HelloController.java) | [x] | |
| Tạo file entity cho User |[User](src/samples/demo/src/main/java/com/example/demo/model/User.java) | [x] | |
| Tạo CRUD API cho User | [UserController](src/samples/demo/src/main/java/com/example/demo/controller/UserController.java) | [x] | |
| Test API bằng Postman | [Link kết quả đầu ra](https://docs.google.com/document/d/1sqEcDQpNJBBbvCJUXVmdpohDjKPPtrE7OGWhGO8riEQ/edit?tab=t.6r58axjfbknw) | [x] | |

> **Chuẩn bị cho buổi trao đổi:**
>
> - Đã đọc / tìm hiểu được gì?
> - Đã thực hành được gì? (link / file)
> - Vướng mắc ở đâu? Đã thử giải quyết chưa?

---

### Tuần 3 – Mở rộng & Đào sâu

_Mục tiêu tuần: Hiểu sâu hơn, bắt đầu mở rộng sang tính năng / trường hợp phức tạp hơn_

**Tìm hiểu / Đọc:**
| Nội dung | Nguồn | Trạng thái | Ghi chú |
|---|---|---|---|
| Quan hệ giữa các entity trong JPA | https://tuyendung.evotek.vn/mo-hinh-hoa-cac-moi-quan-he-trong-jpa-one-to-one-one-to-many-many-to-many-java-spring-roadmap/ | [x] | [week03-research.md](docs/week03-research.md) |
| REST API Best Practices | https://restfulapi.net/rest-api-best-practices/ | [x] | [week03-research.md](docs/week03-research.md) |

**Thực hành:**
| Nhiệm vụ | Kết quả đầu ra | Trạng thái | Ghi chú |
|---|---|---|---|
| Tạo entity Product| [Product.java](src/samples/demo/src/main/java/com/example/demo/model/Product.java) | [x] | |
| Tạo entity Category | [Category.java](src/samples/demo/src/main/java/com/example/demo/model/Category.java) | [x] | |
| CRUD API cho Product | [ProductController.java](src/samples/demo/src/main/java/com/example/demo/controller/ProductController.java) | [x] | |
| Test API bằng Postman | [Link kết quả đầu ra](https://docs.google.com/document/d/1sqEcDQpNJBBbvCJUXVmdpohDjKPPtrE7OGWhGO8riEQ/edit?tab=t.o6kqzgoh0xd) | [x] | |

---

### Tuần 4 – Hoàn thiện giữa kỳ _(Buổi trao đổi 2)_

_Mục tiêu tuần: Có sản phẩm / kết quả giữa kỳ rõ ràng, có thể demo hoặc trình bày_

**Tìm hiểu / Đọc:**
| Nội dung | Nguồn | Trạng thái | Ghi chú |
|---|---|---|---|
| Exception Handling trong Spring Boot | https://www.baeldung.com/exception-handling-for-rest-with-spring | [x] | [week04-research.md](docs/week04-research.md) |

**Thực hành:**
| Nhiệm vụ | Kết quả đầu ra | Trạng thái | Ghi chú |
|---|---|---|---|
| CRUD CRUD API cho Category| [CategoryController.java](src/samples/demo/src/main/java/com/example/demo/controller/CategoryController.java) | [x] | |
| Handle Exception cho Category | [Link kết quả đầu ra](https://docs.google.com/document/d/1sqEcDQpNJBBbvCJUXVmdpohDjKPPtrE7OGWhGO8riEQ/edit?tab=t.abax02d4qtqy) | [x] | |
| Test API bằng Postman | [Link kết quả đầu ra](https://docs.google.com/document/d/1sqEcDQpNJBBbvCJUXVmdpohDjKPPtrE7OGWhGO8riEQ/edit?tab=t.abax02d4qtqy) | [x] | |

> **Tự đánh giá giữa kỳ:**
>
> - Đã hoàn thành được bao nhiêu % kế hoạch?
> - Kỹ năng nào đã hiểu chắc? Kỹ năng nào còn mơ hồ?
> - Điều chỉnh kế hoạch nửa sau nếu cần:

---

### Tuần 5 – Nâng cao / Tối ưu

_Mục tiêu tuần: Tìm hiểu thêm best practices, cải thiện chất lượng code / sản phẩm_

**Tìm hiểu / Đọc:**
| Nội dung | Nguồn | Trạng thái | Ghi chú |
|---|---|---|---|
| Tổng quan về JWT | https://www.geeksforgeeks.org/web-tech/json-web-token-jwt/ | [x] | [week5-research.md](docs/week05-research.md) |
| | | [ ] | |

**Thực hành:**
| Nhiệm vụ | Kết quả đầu ra | Trạng thái | Ghi chú |
|---|---|---|---|
| Tạo, ký và xác thực một JWT | [AuthenticationService.java](src/samples/demo/src/main/java/com/example/demo/service/AuthenticationService.java) | [x] | |
| Test bằng Postman | [Link kết quả đầu ra](https://docs.google.com/document/d/1sqEcDQpNJBBbvCJUXVmdpohDjKPPtrE7OGWhGO8riEQ/edit?tab=t.mourcfcmya8k) | [x] | |

---

### Tuần 6 – Kiểm thử & Đánh giá _(Buổi trao đổi 3)_

_Mục tiêu tuần: Kiểm thử, phát hiện và xử lý vấn đề, đánh giá lại những gì đã làm_

**Tìm hiểu / Đọc:**
| Nội dung | Nguồn | Trạng thái | Ghi chú |
|---|---|---|---|
| Spring Security Architecture | https://docs.spring.io/spring-security/reference/servlet/architecture.html | [x] | [week06-research.md](docs/week06-research.md) |

**Thực hành:**
| Nhiệm vụ | Kết quả đầu ra | Trạng thái | Ghi chú |
|---|---|---|---|
| Authenticatuon và Authorization JWT | [SecurityConfig.java](src/samples/demo/src/main/java/com/example/demo/configuration/SecurityConfig.java) | [x] | |
| Test Postman | [Link kết quả đầu ra](https://docs.google.com/document/d/1sqEcDQpNJBBbvCJUXVmdpohDjKPPtrE7OGWhGO8riEQ/edit?tab=t.wvsf5ksbjp4) | [x] | |

---

### Tuần 7 – Hoàn thiện cuối

_Mục tiêu tuần: Hoàn chỉnh sản phẩm, chuẩn bị tài liệu, dọn dẹp repo_

**Thực hành:**
| Nhiệm vụ | Kết quả đầu ra | Trạng thái | Ghi chú |
|---|---|---|---|
| Hoàn thiện `docs/` (ghi chú học tập) | | [ ] | |
| Hoàn thiện `src/project/` | | [ ] | |
| Viết README tổng kết | | [ ] | |

---

### Tuần 8 – Tổng kết _(Buổi trao đổi 4)_

_Mục tiêu tuần: Demo, báo cáo, phản ánh lại toàn bộ quá trình_

**Thực hành:**
| Nhiệm vụ | Kết quả đầu ra | Trạng thái | Ghi chú |
|---|---|---|---|
| Demo / báo cáo cuối kỳ | Demo URL / Report | [ ] | |

> **Phản ánh cuối kỳ:**
>
> - Kỹ năng nào tôi thực sự đã học và hiểu được?
> - Nếu làm lại, tôi sẽ thay đổi gì trong kế hoạch?
> - Kỹ năng này hữu ích như thế nào cho định hướng nghề nghiệp của tôi?

---

## 5. Checklist & Tổng kết

- [ ] Nộp kế hoạch trước **23/02/2026**
- [ ] Tham gia đủ **04 buổi trao đổi**
- [ ] Cập nhật `timeline-08tuan.md` **mỗi tuần**
- [ ] Có ghi chú tìm hiểu trong `docs/` (ít nhất 4 tuần)
- [ ] Sản phẩm cuối chạy được / demo được
- [ ] Có thể **giải thích** những gì đã làm mà không cần nhìn code

**Tự đánh giá mức độ hoàn thành:** ……%

**Điều tôi tự hào nhất trong đợt thực tập này:**

**Vướng mắc / nội dung cần giảng viên hỗ trợ thêm:**

**Link repository cuối cùng:**
