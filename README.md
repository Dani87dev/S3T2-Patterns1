## 📦 S1T4 — Singleton Pattern & Testing

## 🎯 Project Goal & Overview

The goal of this project is to practice the **Singleton Design Pattern** and **Unit Testing** in Java through a command management system.

This repository implements the **“Undo”** logic, focused on managing:
- a unique history of commands across the entire application
- adding new commands to the history
- undoing the last command (LIFO - Last In, First Out)
- retrieving the full history for display purposes

---

## 🧩 LEVEL 1 — Undo Management System

### 📌 Exercise 1 — The Undo Singleton

Design a class that acts as a command registry. 

The system must:
- guarantee a single instance of the `Undo` class
- store commands in a way that the last one added is the first one removed
- provide a history of all commands currently stored



#### 🧪 Unit Testing the Logic 🚀

The test suite ensures the system works as expected:
- **🆔 Singleton Test**: Verifies that two different variables point to the same memory address using `assertSame()`. 
- **📥 Add/Undo Test**: Ensures that adding a command and then undoing it returns the exact same string (LIFO logic). ✅
- **📜 History Test**: Validates that the `showHistory()` method returns a `List<String>` that matches the sequence of entered commands. 📋
- **⚠️ Boundary Conditions**: Checks that the system handles empty stacks gracefully without crashing. 🛡️

---

## 🛠 Technologies

- ☕ Java
- 🧪 JUnit 5
- 🏗️ Maven / Gradle
- 🐙 Git & GitHub
