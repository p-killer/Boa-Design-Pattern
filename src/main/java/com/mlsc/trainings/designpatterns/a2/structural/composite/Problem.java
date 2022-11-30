package com.mlsc.trainings.designpatterns.a2.structural.composite;

/**
 * <p>Imagine that you have two types of objects: Products and Boxes . A Box can contain several Products as well as a number of smaller Boxes . These little Boxes can also hold some Products or even smaller Boxes , and so on.
 * </p>
 * <p>Say you decide to create an ordering system that uses these classes. Orders could contain simple products without any wrapping, as well as boxes stuffed with products...and other boxes. How would you determine the total price of such an order?
 * </p>
 * <p>You could try the direct approach: unwrap all the boxes, go over all the products and then calculate the total. That would be doable in the real world; but in a program, it’s not as simple as running a loop. You have to know the classes of Products and Boxes you’re going through, the nesting level of the boxes and other nasty details beforehand. All of this makes the direct approach either too awkward or even impossible.
 * </p>
 */
public class Problem {


}
