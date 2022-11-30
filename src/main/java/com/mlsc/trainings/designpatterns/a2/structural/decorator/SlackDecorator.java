package com.mlsc.trainings.designpatterns.a2.structural.decorator;

public class SlackDecorator extends BaseDecorator {


    public SlackDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        notifier.send(message);
        System.out.println("Sending Slack message : " + message);
    }
}
