# Decorator Design Pattern (Java)

## 📌 Overview
The Decorator Pattern is a structural design pattern that allows behavior to be added to an individual object dynamically without modifying its code.

It is used to follow the Open/Closed Principle.

---

## 🎯 Intent
- Add responsibilities dynamically
- Avoid subclass explosion
- Keep classes closed for modification

---

## 🏗 Structure

- **Component** → Common interface
- **ConcreteComponent** → Original object
- **Decorator** → Abstract wrapper
- **ConcreteDecorator** → Adds new behavior
- **Client** → Uses decorated object

---

## 💻 Example Scenario

Coffee ordering system:

- BasicCoffee → Base object
- MilkDecorator → Adds milk
- SugarDecorator → Adds sugar

---