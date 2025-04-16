# 📚 Bookstore Management System

A simple Java-based **Object-Oriented Programming** project simulating an online bookstore, where admins can manage books and customers can browse and place orders.

## 🛠️ Features
- Admin login with capabilities to:
  - Add new books
  - Delete existing books
- Customer login to:
  - Browse available books
  - Purchase books
- Menu navigation for both admin and customer roles
- Book inventory and order tracking system

## 🧱 Project Structure
- Package: `Store`
- Contains 8 main classes:
  - `User` (Abstract class)
  - `Admin` & `Customer` (Inheritance + Polymorphism)
  - `Book`, `Inventory`, `Order` (Composition relationships)
  - `Menu` (Navigation interface)
  - `BookStoreTest` (Main class)

## 💡 Highlights
- Object-Oriented Concepts:
  - Inheritance
  - Polymorphism
  - Abstraction
  - Composition
- Exception Handling for user input
- Uses `Scanner` for user input and `ArrayList` for storing data