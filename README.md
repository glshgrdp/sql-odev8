# Employee Tablosu - PostgreSQL Demo

Bu proje, PostgreSQL üzerinde oluşturulmuş `employee` tablosuna örnek veriler eklemeyi ve bu tablo üzerinde `UPDATE` ve `DELETE` işlemleri gerçekleştirmeyi içerir.

---

## 🔧 1. Tablo Oluşturma

```sql
CREATE TABLE employee (
    id INTEGER PRIMARY KEY,
    name VARCHAR(50),
    birthday DATE,
    email VARCHAR(100)
);
