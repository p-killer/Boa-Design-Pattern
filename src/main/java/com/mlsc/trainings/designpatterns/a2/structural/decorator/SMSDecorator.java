package com.mlsc.trainings.designpatterns.a2.structural.decorator;

public class SMSDecorator extends BaseDecorator {
    public SMSDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        notifier.send(message);
        System.out.println("Sending SMS : " + message);
    }
}
