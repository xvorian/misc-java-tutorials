package com.home.lambda.function;

@FunctionalInterface
interface GenericFunctionalInterface<T, R>
{
  R apply(T param);
}

@FunctionalInterface
interface Printer
{
  void print(String msg);
}

@FunctionalInterface
interface Decider{
  boolean decide(String text);
}

public class Interfaces
{
   public static void main(String[] args)
  {
    Printer printer = (msg) -> System.out.println(msg.toUpperCase());
    printer.print("Canada");


  }
}
