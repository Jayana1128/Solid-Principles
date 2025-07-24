
// Dependency Inversion Principle
interface MessageService {
    void sendMessage(String message, String recipient);
}

class EmailService implements MessageService {
    public void sendMessage(String message, String recipient) {
        System.out.println("Email sent to " + recipient + ": " + message);
    }
}

class Notification {
    private MessageService service;

    public Notification(MessageService service) {
        this.service = service;
    }

    public void notifyUser(String message, String recipient) {
        service.sendMessage(message, recipient);
    }
}

public class DependencyInversionPrinciple {
    public static void main(String[] args) {
        MessageService emailService = new EmailService();
        Notification notification = new Notification(emailService);
        notification.notifyUser("Hello, SOLID!", "abhigna@example.com");
    }
}
