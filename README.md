# Item Management REST API (Spring Boot)

This is a simple Java Spring Boot backend application that provides a RESTful API
to manage a collection of items 

The project is created as part of a sample task for a Freelance Java Developer role.

---

## 🚀 Features

- Create a new item
- Fetch an item by ID
- In-memory data storage using ArrayList
- Input validation using Spring Validation
- RESTful API design
- Clean and simple architecture

---

## 🛠 Tech Stack

- Java 17
- Spring Boot
- Maven
- REST API
- Lombok
- In-memory storage (ArrayList)

---

## 📦 Item Model

Each item contains the following fields:
- `id` – Unique identifier
- `name` – Name of the item
- `description` – Item description
  

---

## 🔗 API Endpoints

### ➕ Add Item
**POST** `/items`

Request Body (JSON):
```json
{
  "name": "Laptop",
  "description": "Dell i5 Laptop",
  "price": 55000
}
