package com.home.lambda.function;

import java.util.function.Function;

class FunctionImp implements Function<String, Integer>
{

  @Override public Integer apply(String s)
  {
    return s.length();
  }

  @Override public <V> Function<V, Integer> compose(Function<? super V, ? extends String> before)
  {
    return Function.super.compose(before);
  }

  @Override public <V> Function<String, V> andThen(Function<? super Integer, ? extends V> after)
  {
    return Function.super.andThen(after);
  }
}

public class FunctionDemo
{
  public static void main(String[] args)
  {
    Function<String, Integer> function = new FunctionImp();
    System.out.println(function.apply("Pakistan"));

    Function<String, Integer> result = (s) -> s.length();
    System.out.println(result.apply("Canada"));

  }
}
