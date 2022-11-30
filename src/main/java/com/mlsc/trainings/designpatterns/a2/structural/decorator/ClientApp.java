package com.mlsc.trainings.designpatterns.a2.structural.decorator;

public class ClientApp {

    public static void main(String[] args) {
        Notifier notifier = new Notifier();
//        notifier.send("Some Message");
//        FaceBookDecorator faceBookDecorator = new FaceBookDecorator(notifier);
//        faceBookDecorator.send("New Message");
//
//        SMSDecorator smsDecorator = new SMSDecorator(faceBookDecorator);
//        smsDecorator.send("The Message");
//
        SlackDecorator slackDecorator = new SlackDecorator(notifier);
        slackDecorator.send("The Message");


    }
}
