# Flyweight Pattern — com.flyweight

This folder contains a small example of the Flyweight design pattern (game trees example).

## What is the Flyweight pattern?
The Flyweight pattern is a structural design pattern used to minimize memory usage by sharing as much data as possible with similar objects. It separates object state into:
- Intrinsic (shared) state — stored in a Flyweight object (immutable or treated as read-only).
- Extrinsic (unique) state — passed to the flyweight when needed and stored externally.

Use the Flyweight when you need to create a large number of similar objects and want to reduce memory by sharing common parts.

## How this example maps to Flyweight
- `TreeType` — the Flyweight (intrinsic/shared state): `name`, `color`, `texture` and a `draw` method.
- `Tree` — contains extrinsic (unique) state: location `x, y`, plus a reference to a `TreeType`.
- `TreeFactory` — the Flyweight factory: returns shared `TreeType` instances (creates them when needed and caches them).
- `Forest` — manages many `Tree` instances and delegates drawing.
- `Client` — demonstrates planting many trees while reusing the same `TreeType` flyweights.

## Benefits illustrated
- Many `Tree` instances can reuse a small number of `TreeType` objects.
- Memory savings when the number of trees >> number of tree types.
- Centralized object creation via `TreeFactory`.

