package com.home.lambda.function;

import java.time.LocalDateTime;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class UsingFunctionalInterfaces
{
  public static void main(String[] args)
  {
    Consumer<String> consumer = (string) -> System.out.println(string.toLowerCase());
    consumer.accept("Canada");

    Function<String, Integer> length = (str) -> (str.length());
    System.out.println("String length was: "+length.apply("Canada"));

    Supplier<LocalDateTime> supplier = () -> (LocalDateTime.now());
    System.out.println(supplier.get());

    String testing = "Testing";
  }
}
