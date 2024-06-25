package systemDesign.solidPrinciple.DIP.obey;

interface MessageService
{
    void sendMessage(String message);
}
class NotificationService
{
    private MessageService messageService;
    public NotificationService(MessageService messageService)
    {
        this.messageService=messageService;
    }

    void sendNotification(String message)
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

class NotificationServiceMain
{
    public static void main(String[] args) {
        EmailService es = new EmailService();
        SMSService sms = new SMSService();
        WhatsAppService ws = new WhatsAppService();

        NotificationService ns1 = new NotificationService(es);
        ns1.sendNotification("Hello Goutam");

        NotificationService ns2 = new NotificationService(sms);
        ns2.sendNotification("Hello Goutam");

        NotificationService ns3 = new NotificationService(ws);
        ns3.sendNotification("Hello Goutam");
    }
}