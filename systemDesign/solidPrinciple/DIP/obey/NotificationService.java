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
class WhatAppService implements MessageService
{
    @Override
    public void sendMessage(String message)
    {
        System.out.println("WhatsApp Sent "+message);
    }
}