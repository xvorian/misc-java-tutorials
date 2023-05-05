package com.home.lambda.pradicate;

import java.util.Arrays;
import java.util.function.Predicate;

public class PraticateExample
{
  public static void main(String[] args)
  {
    Predicate<Integer> lessThan10 = p->(p<10);
    Predicate<Integer> moreThan10 = p->(p>10);
    Predicate<String> sameword = (word)->(word.equals("welcome"));
    Predicate<String> nameLength = (word)->(word.length()>5);

    String[] names = new String[]{"Amjad","Alishbah","Ayan","Shumaila"};


    System.out.println(lessThan10.test(20)+" , "+moreThan10.test(1)+", "+sameword.test("Welcome"));

    for (String name: names){
      System.out.println(nameLength.test(name) ? name : "");
    }

    System.out.println(Arrays.stream(names).anyMatch(nameLength));

  }
}
