package systemDesign.solidPrinciple.DIP.obey;

interface MessageService
{
    void sendMessage(String message);
}
class NotificationService
{
    void sendNotification(MessageService messageService,String message)
    {
        messageService.sendMessage(message);
    }
}

class EmailService implements MessageService
{
    @Override
    public void sendMessage(String message)
    {
        System.out.println("Email Sent "+message);
    }
}
class SMSService implements MessageService
{
    @Override
    public void sendMessage(String message)
    {
        System.out.println("SMS Sent "+message);
    }
}
class WhatsAppService implements MessageService
{
    @Override
    public void sendMessage(String message)
    {
        System.out.println("WhatsApp Sent "+message);
    }
}

class NotificationServiceMain2
{
    public static void main(String[] args) {
        EmailService es = new EmailService();
        SMSService sms = new SMSService();
        WhatsAppService was = new WhatsAppService();

        NotificationService ns = new NotificationService();
        ns.sendNotification(es,"Hello Goutam");
        ns.sendNotification(sms,"Hello Goutam");
        ns.sendNotification(was,"Hello Goutam");
    }
}