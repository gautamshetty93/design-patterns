# Command Design Pattern (Java)

## Overview
The Command Design Pattern is a behavioral design pattern that encapsulates a request as an object.  
It allows parameterizing objects with operations, delaying execution, and supporting undo/redo functionality.

---

## Intent
- Encapsulate a request as an object
- Decouple sender and receiver
- Support undo/redo
- Enable logging and queuing of requests

---

## Structure

- **Command** → Interface with execute()
- **ConcreteCommand** → Implements Command
- **Receiver** → Performs actual work
- **Invoker** → Triggers command
- **Client** → Creates and connects objects

---

## Example Scenario

A Remote Control controlling a Light.

- Light → Receiver
- LightOnCommand / LightOffCommand → Concrete Commands
- RemoteControl → Invoker
- Client → Binds everything together
