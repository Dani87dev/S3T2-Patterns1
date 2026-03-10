# 📦 S1T4 — Design Patterns & Testing

## 🎯 Project Goal & Overview

The goal of this project is to practice **Design Patterns** and **Unit Testing** in Java through hands-on exercises.

This repository covers the implementation of different creational and behavioral design patterns, focused on:
- applying patterns to real-world scenarios
- guaranteeing correctness through unit tests
- understanding when and why each pattern is useful

---

## 🧩 LEVEL 1 — Singleton Pattern

### 📌 Exercise 1 — Undo Management System

The **Singleton** pattern ensures a class has only one instance throughout the application. This exercise applies it to a command history system.

The system must:
- guarantee a single instance of the `Undo` class
- store commands so the last one added is the first one removed (LIFO)
- provide a full history of all commands currently stored

#### 🧪 Unit Tests

- **🆔 Singleton Test**: Verifies two variables point to the same instance using `assertSame()`
- **📥 Add/Undo Test**: Ensures adding a command and undoing it returns the exact same string
- **📜 History Test**: Validates `showHistory()` returns a `List<String>` matching the entered commands
- **⚠️ Boundary Conditions**: Checks the system handles empty stacks without crashing

---

## 🧩 LEVEL 2 — Abstract Factory Pattern

### 📌 Exercise 2 — International Contact Manager

The **Abstract Factory** pattern provides an interface to create families of related objects without specifying their concrete classes. This exercise applies it to format contact data (addresses and phone numbers) according to each country's conventions.

The system must:
- define abstract products: `Address`, `Phone`
- define an abstract factory: `ContactFactory`
- implement at least two concrete factories: `SpainContactFactory` and `USAContactFactory`
- format address and phone according to each country:
  - 🇪🇸 Spain: `Carrer Major 34, 08001 Barcelona` | Phone: `+34 623 45 67 89`
  - 🇺🇸 USA: `154 5th Avenue, New York, NY 10001` | Phone: `+1 (098) 765-4321`
- implement a `Contact` class as the client, which creates addresses and phones through the factory without knowing the concrete classes

#### 🧪 Unit Tests

- Verify each factory produces correctly formatted addresses and phone numbers per country
- Validate the `Contact` class output matches the expected string representation

---

## 🛠 Technologies

- ☕ Java
- 🧪 JUnit 5
- 🏗️ Maven / Gradle
- 🐙 Git & GitHub
