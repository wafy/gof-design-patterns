package facade.after;

public class Client {

    public static void main(String[] args) {

        EmailSettings emailSettings = new EmailSettings();
        emailSettings.setHost("127.0.0.1");
        EmailSender emailSender = new EmailSender(emailSettings);
        EmailMessage emailMessage = new EmailMessage();
        emailMessage.setFrom("호순이");
        emailMessage.setTo("구름이");
        emailMessage.setSubject("고양이");
        emailMessage.setTo("구름아 보고싶다..");
        emailSender.sendEmail(emailMessage);
    }
}
