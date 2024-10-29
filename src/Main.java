import email.EmailService;
import email.UserService;
import trades.ForwardTrade;
import trades.FxTrade;
import trades.SpotTrade;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        FxTrade trade1 = new SpotTrade("XXX", "name1", 100, 0.5);
        FxTrade trade2 = new ForwardTrade("YYY", "name2", 200, 0.3);

        EmailService emailService = new EmailService();
        UserService userService = new UserService(emailService);

        // Setter Injection
//        UserService userService = new UserService();
//        userService.setEmailService(new EmailService());
    }
}