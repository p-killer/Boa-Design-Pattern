package com.mlsc.trainings.designpatterns.a3.behavioral.cor;

/**
 * <p>Imagine that you’re working on an online ordering system. You want to restrict access to the system so only authenticated users can create orders. Also, users who have administrative permissions must have full access to all orders.
 * </p>
 * <p>
 * After a bit of planning, you realized that these checks must be performed sequentially. The application can attempt to authenticate a user to the system whenever it receives a request that contains the user’s credentials. However, if those credentials aren’t correct and authentication fails, there’s no reason to proceed with any other checks.
 * </p>
 * <p>
 * During the next few months, you implemented several more of those sequential checks.
 * </p>
 * <p>
 * It is unsafe to pass raw data straight to the ordering system. So you added an extra validation step to sanitize the data in a request.
 * Later, security team noticed that the system is vulnerable to brute force password cracking. To negate this, you promptly added a check that filters repeated failed requests coming from the same IP address.
 * Business wanted better speed. So you decided to  speed up the system by returning cached results on repeated requests containing the same data. Hence, you added another check which lets the request pass through to the system only if there’s no suitable cached response.
 * </p>
 */
public class Problem {
}
