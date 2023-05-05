package com.home.lambda.misc;

import java.util.function.BiFunction;
import java.util.function.Function;

@FunctionalInterface
interface Printable{
  void print(String text);
}
public class MethodRefDemo
{
  public static void main(String[] args)
  {
    // Using Lambda
    Function<Integer, Double> function = (input) -> Math.sqrt(input);
    System.out.println(function.apply(16));

    // Using Method reference to a static method
    Function<Integer, Double> methodRef = Math::sqrt;
    System.out.println(methodRef.apply(25));

    // Using lambda - to static method
    BiFunction<Integer, Integer, Integer> biFunction = (a, b) -> MethodRefDemo.addition(a,b);
    System.out.println(biFunction.apply(10,20));

    // Using method reference
    BiFunction<Integer, Integer, Integer> biFunction1 = MethodRefDemo::addition;
    System.out.println(biFunction1.apply(30,45));

    //  Object with lambda express
    MethodRefDemo methodRefDemo = new MethodRefDemo();
    Printable printable = (msg) -> methodRefDemo.display(msg);
    printable.print("Hello World");

    // with method reference,
    Printable printable1 = methodRefDemo::display;
    printable1.print("Welcome to Java");

    // Reference to the instance method of an arbitrary object
    Function<String, String> stringFunction = (input) -> input.toUpperCase();
    System.out.println(stringFunction.apply("Pakistan"));

    Function<String, String> stringFunction1 = String::toLowerCase;
    System.out.println(stringFunction1.apply("INDIAN"));



  }


  public static int addition (int a, int b){
    return (a+b);
  }

  public void display(String text){
    System.out.println(text.toLowerCase());
  }
}
