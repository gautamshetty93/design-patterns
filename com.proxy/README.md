# Proxy Design Pattern (Java)

## 📌 Overview
The Proxy Pattern is a structural design pattern that provides a surrogate or placeholder for another object to control access to it.

The proxy controls access to the real object and can add additional behavior such as:
- Security checks
- Logging
- Caching
- Lazy initialization

---

## 🎯 Intent
- Control access to an object
- Reduce cost of heavy object creation
- Add security or logging without modifying original class

---

## 🏗 Structure

- **Subject** → Common interface
- **RealSubject** → Actual implementation
- **Proxy** → Controls access to RealSubject
- **Client** → Interacts with Subject interface

---

## 💻 Example Scenario

Internet access control:

- Internet → Subject
- RealInternet → Actual implementation
- ProxyInternet → Controls access
- Client → Uses proxy

---
