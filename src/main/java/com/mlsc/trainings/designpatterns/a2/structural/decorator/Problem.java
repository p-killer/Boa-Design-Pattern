package com.mlsc.trainings.designpatterns.a2.structural.decorator;

/**
 * <p>Imagine that you’re working on a notification library which lets other programs notify their users about important events.
 * </p>
 * <p>
 * The initial version of the library was based on the Notifier class that had only a few fields, a constructor and a single send method. The method could accept a message argument from a client and send the message to a list of emails that were passed to the notifier via its constructor. A third-party app which acted as a client was supposed to create and configure the notifier object once, and then use it each time some-thing important happened.
 * </p>
 * <p>
 * At some point, you realize that users of the library expect more than just email notifications. Many of them would like to receive an SMS about critical issues. Others would like to be notified on Facebook and, of course, the corporate users would love to get Slack notifications.
 * </p>
 * <p>
 * Also consider that there can be situations where the someone would want to be notified through multiple  channels at once for a particular event (may be in case of fire)
 * </p>
 */
public class Problem {

}
