package com.mlsc.trainings.designpatterns.a2.structural.decorator;

public class FaceBookDecorator extends BaseDecorator {

    public FaceBookDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        notifier.send(message);

        // Additional Behaviour
        System.out.println("Sending message on FB : " + message);
    }


}
