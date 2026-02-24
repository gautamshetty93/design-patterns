# State Design Pattern - Simple Explanation (Traffic Light Example)

## 📖 Overview

The State Design Pattern is a **Behavioral Design Pattern** that allows an object to change its behavior when its internal state changes.

Instead of using large `if-else` or `switch` statements, behavior is delegated to separate state classes.

The object appears to change its class when its state changes.

---

## 🧠 Problem

When an object behaves differently based on its state, developers often use:

- Multiple if-else conditions
- Switch-case blocks

This leads to:

- Hard-to-maintain code
- Violation of Open/Closed Principle
- Complex and unreadable logic

---

## 🏗 Solution

Encapsulate each state into its own class.

The main object (called **Context**) maintains a reference to a **State** object and delegates behavior to it.

---

## 📦 Example Scenario – Traffic Light

States:
- 🔴 Red → Stop
- 🟢 Green → Go
- 🟡 Yellow → Slow Down

Instead of checking state using conditions, each state has its own class that defines its behavior.

---

## 🔎 Structure

- `State` → Interface defining behavior
- `ConcreteState` → Implements specific behavior
- `Context` → Maintains current state and delegates actions

### Flow:

Client → Context → Current State → Behavior

---