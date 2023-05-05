package com.home.lambda.pradicate;

// Joining Pradicate - and , or ,negate
// p1 -- check if number is even
// p2 -- check if number is greater than 50

import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Predicate;

public class JoiningPradicate
{
  static int[] numbers = new int[10];
  static {
    for(int i=0;i< numbers.length;i++){
      numbers[i] = ThreadLocalRandom.current().nextInt(1, 101);
    }
  }
  public static void main(String[] args)
  {
    Predicate<Integer> p1 = (num) -> (num%2==0);
    Predicate<Integer> p2 = (num) -> (num>50);

    for(int num: numbers){
//      if(p1.test(num) && p2.test(num)){
//        System.out.println(num);
//      }

      // Using or
      if(p1.and(p2).test(num)){
        System.out.println("AND Joining: "+num);
      }
      // Using or
      if(p1.or(p2).test(num)){
        System.out.println("OR Joining: "+num);
      }

      // Using negate
      if(p1.negate().test(num)){
        System.out.println("negate: "+num);
      }
    }




//    System.out.println(p1.test(40)+", "+p2.test(40));
//    System.out.println(p1.test(53)+", "+p2.test(53));
  }
}
