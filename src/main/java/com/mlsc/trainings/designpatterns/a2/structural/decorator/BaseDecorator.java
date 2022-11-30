package com.mlsc.trainings.designpatterns.a2.structural.decorator;

public class BaseDecorator extends Notifier {

    protected Notifier notifier;

    public BaseDecorator(Notifier notifier) {
        this.notifier = notifier;
    }

    @Override
    public void send(String message) {
        notifier.send(message);
    }
}
