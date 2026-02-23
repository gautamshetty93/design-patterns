public class NotificationFactory {
    public static Notification createNotification(String channel) {
        if (channel == null) {
            return null;
        }
        switch (channel.toLowerCase()) {
            case "email":
                return new EmailNotification();
            case "sms":
                return new SMSNotification();
            case "push":
                return new PushNotification();
            default:
                return null;
        }
    }
}

