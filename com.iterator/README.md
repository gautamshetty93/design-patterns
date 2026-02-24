# Iterator Design Pattern - Java Example

## Overview

The Iterator Design Pattern is a **Behavioral Design Pattern** that provides a way to access elements of a collection sequentially **without exposing its internal structure**.

It separates:
- Collection logic
- Traversal logic

---

## Problem

If we expose the internal structure (like List, Array, etc.) directly:

- Client becomes tightly coupled to implementation
- Internal data structure changes may break client code
- Traversal logic gets duplicated

We need a way to traverse a collection safely and cleanly.

---

## Solution

Create:

- `Iterator` → Interface defining traversal methods
- `Aggregate` → Interface to create iterator
- `ConcreteIterator` → Implements traversal logic
- `ConcreteAggregate` → Stores collection data

Client interacts only with the `Iterator`.

---
