package email;

public class UserService {
    private EmailService emailService;

    // Constructor Injection
    // EmailService is injected into UserService through the constructor
    public UserService(EmailService emailService) {
        this.emailService = emailService;
    }

    public void registerUser(String username) {
        emailService.sendEmail("Welcome " + username);
    }
}

