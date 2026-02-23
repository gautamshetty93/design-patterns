# Prototype Design Pattern (Java)

## Overview
The Prototype Pattern is a creational design pattern that creates new objects by copying an existing object (prototype).

Instead of instantiating new objects using constructors, cloning is used.

---

## Intent
- Avoid expensive object creation
- Reduce subclassing
- Improve performance
- Simplify object creation logic

---

## Structure

- **Prototype** → Interface with clone() method
- **ConcretePrototype** → Implements cloning
- **Client** → Creates objects by cloning prototype

---

##  Example Scenario

Employee cloning system:

- Prototype → Cloneable interface
- Employee → Concrete prototype
- Client → Clones employee object

---
