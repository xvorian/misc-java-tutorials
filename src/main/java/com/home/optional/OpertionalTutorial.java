package com.home.optional;

import com.home.lambda.misc.model.Cat;

public class OpertionalTutorial
{
  public static void main(String[] args)
  {
    Cat myFindCatByName = findCatByName("Sky", 3);
  }

  private static Cat findCatByName(String name, int age){
    return new Cat(name, age);
  }
}
