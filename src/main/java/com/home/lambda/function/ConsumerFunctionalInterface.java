package com.home.lambda.function;

import java.util.function.Consumer;

//class ConsumerFunctionalImp implements Consumer<String> {
//
//  @Override public void accept(String s)
//  {
//    s.toUpperCase();
//  }
//
//  @Override public Consumer<String> andThen(Consumer<? super String> after)
//  {
//    return Consumer.super.andThen(after);
//  }
//}


public class ConsumerFunctionalInterface
{
  public static void main(String[] args)
  {
    Consumer<String> consumer = (s) -> System.out.println(s.toUpperCase());
    consumer.accept("canada");
  }
}
