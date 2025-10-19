# Library_Management

---
### Overview

The **Library Management System** is a simplified platform designed to manage library operations including book rentals, user memberships, deposits, and administrative controls. It supports multiple user roles and enforces realistic constraints such as rental limits, late fees, and account balance management.

---

### Roles

* **Library** – Represents the overall library entity managing resources and users.
* **Manager** – Handles book imports, author records, and user management.
* **User** – Can rent and return books, deposit balance, and upgrade membership.
* **Book** – Contains information such as title, availability, and linked authors.
* **Author** – Represents the creator(s) of one or more books.

---

### Constraints

* One **Library** can have **multiple Managers**.
* One **Book** can have **multiple Authors**.
* Each **User** has an account **balance** and can **deposit** money.
* Users must purchase a **membership plan** to rent books.
* **Membership Types:**

  | Type     | Price (VND) | Monthly Book Limit |
  | -------- | ----------- | ------------------ |
  | Ordinary | 0           | 5                  |
  | Advance  | 20,000      | 10                 |
  | Premium  | 100,000     | Unlimited          |
* **Rental Rules:**

  * Late return fee: **30,000 VND/day/book**
  * Users with insufficient balance are **temporarily banned** from renting.

---

### System Services

1. **Rent / Return Book** – Allows users to borrow and return library books.
2. **Deposit** – Enables users to add balance to their account.
3. **Import Data** – Bulk import for books, authors, and users.
4. **Browse Information** – Search and view details of authors, books, users, and unpaid loans.
5. **Upgrade Account** – Allows users to change their membership type.

