# Facade Design Pattern - Java Example

## 📖 Overview

The Facade Design Pattern is a **Structural Design Pattern** that provides a simplified interface to a complex subsystem.

It hides system complexity and provides an easy-to-use interface to the client.

---

## 🧠 Problem

A Home Theater system contains multiple subsystems:
- Projector
- Sound System
- Streaming Player
- Lights

To watch a movie, the client must manually control each subsystem.

This increases:
- Coupling
- Complexity
- Client-side responsibility

---

## 🏗 Solution

Create a `HomeTheaterFacade` class that:

- Wraps all subsystems
- Provides simple methods like:
    - `watchMovie()`
    - `endMovie()`

Now the client interacts with only ONE class.

---