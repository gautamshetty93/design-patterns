public class Client {
    public static void main(String[] args) {
        Notification email = NotificationFactory.createNotification("email");
        if (email != null) email.send();

        Notification sms = NotificationFactory.createNotification("sms");
        if (sms != null) sms.send();

        Notification push = NotificationFactory.createNotification("push");
        if (push != null) push.send();

        Notification unknown = NotificationFactory.createNotification("fax");
        if (unknown == null) System.out.println("Unknown notification channel: fax");
    }
}

