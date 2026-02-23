# Adapter Design Pattern

## 📌 Overview
The **Adapter Pattern** is a structural design pattern that allows incompatible interfaces to work together.  
It acts as a bridge between two classes by converting the interface of one class into another interface expected by the client.

---

## Intent
Convert the interface of an existing class into another interface that a client expects.

---

## Structure
- **Target** – The interface expected by the client
- **Adaptee** – The existing class with an incompatible interface
- **Adapter** – Wraps the Adaptee and converts its interface
- **Client** – Uses the Target interface

---

## How It Works
1. The client calls methods defined in the Target interface.
2. The Adapter translates those calls into calls to the Adaptee.
3. The Adapter may also transform data or format if required.
4. The client remains unaware of the underlying incompatible class.

---

## When to Use
- Integrating third-party libraries
- Working with legacy systems
- Migrating old code to new architecture
- Converting data formats or units

---

## Benefits
- Promotes code reusability
- Improves flexibility
- Follows Open/Closed Principle
- Keeps client code clean

---

> Adapter Pattern enables collaboration between classes that otherwise could not work together due to incompatible interfaces.