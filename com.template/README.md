# Template Design Pattern - Java Example

## 📌 Overview

The **Template Design Pattern** defines the skeleton of an algorithm in a base class and allows subclasses to override specific steps without changing the overall structure.

It promotes:
- Code reuse
- Controlled extension
- Inversion of control (Hollywood Principle)

---

## 🧠 Concept

The template pattern consists of:

- An **abstract class** that defines:
  - A `final` template method
  - Concrete common steps
  - Abstract methods to be implemented by subclasses

- Concrete subclasses that override specific steps of the algorithm.

---

## 🏗 Example: Beverage Preparation

We define a fixed process for preparing beverages:

1. Boil water
2. Brew
3. Pour into cup
4. Add condiments

The structure remains the same, but brewing and condiments differ.

---

## 📂 Project Structure
