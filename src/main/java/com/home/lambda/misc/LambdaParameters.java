package com.home.lambda.misc;

interface Calculator
{
  //    double addition(double[] numbers);
  int addition(int a, int b);
}

class CalculatorImp implements Calculator
{

  @Override public int addition(int a, int b)
  {
    return a + b;
  }
}

public class LambdaParameters
{

  public static void main(String[] args)
  {
    Calculator addition = (a, b) -> {
      int c = 0;
      c = a + b;
      return c;
    };
    System.out.println(addition.addition(10, 20));

    Calculator add = (a, b) -> {
      return a + b;
    };
    System.out.println(add.addition(4, 4));
  }
}
