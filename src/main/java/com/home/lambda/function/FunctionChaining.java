package com.home.lambda.function;

import com.home.lambda.misc.model.EmployeeDetails;

import java.util.function.Function;

public class FunctionChaining
{
  public static void main(String[] args)
  {
    Function<Integer, Integer> function1 = n -> n * n;
    Function<Integer, Integer> function2 = n -> n + 2;

    System.out.println(function1.andThen(function2).apply(5)); // result of function1 applied, then the result would go to function2.

    System.out.println(function1.compose(function2).apply(5)); // first it would execute function2, then result sent to function1.
  }
}
