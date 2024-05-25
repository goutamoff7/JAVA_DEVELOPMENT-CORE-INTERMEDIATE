package systemDesign.solidPrinciple.DIP.notObey;

class NotificationService
{
    //Notification can be sent either Email or SMS
    EmailService emailService;// Higher level NotificationService depends
    SMSService smsService; // on lower level EmailService and SMSService

    public NotificationService(SMSService smsService) {
        this.smsService = new SMSService();
        this.emailService= new EmailService();
    }

    public void sendNotification(String message)
    {
        emailService.sendEmail(message);
        smsService.sendSMS(message);
    }
}

class EmailService
{
    public void sendEmail(String message)
    {
        System.out.println("Email Sent "+message);
    }
}
class SMSService
{
    public void sendSMS(String message)
    {
        System.out.println("SMS Sent "+message);
    }
}