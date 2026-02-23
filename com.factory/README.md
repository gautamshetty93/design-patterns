# Factory Pattern — com.factory

This folder demonstrates a simple Factory Method pattern for creating notifications.

## Classes
- `Notification` — interface with `void send()`.
- `EmailNotification` — sends an email notification.
- `SMSNotification` — sends an SMS notification.
- `PushNotification` — sends a push notification.
- `NotificationFactory` — factory class with `createNotification(String channel)` method that returns an appropriate `Notification` instance based on the `channel` argument.
- `Client` — demo `main` that uses the factory to create and send notifications.

Notes
- The factory returns `null` for unknown channels; you can change this to throw an exception or return an `Optional<Notification>` if you'd like stronger handling of invalid inputs.
- If you plan to compile the entire repository at once, consider giving these classes package declarations to avoid collisions with other top-level `Client` classes in the repo.

