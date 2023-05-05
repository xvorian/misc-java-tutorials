package com.home.reflection;

import com.home.lambda.misc.model.Cat;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectPactice
{
  public static void main(String[] args) throws Exception
  {
    Cat myCat = new Cat("SnowWhite", 2);

    // Working with fields
    for (Field field : myCat.getClass().getDeclaredFields())
    {
      System.out.println("Field Name & type: " + field.getName() + ", " + field.getType());
      if (field.getName().equals("name"))
      {
        field.setAccessible(true);
        field.set(myCat, "Sky");
      }
    }
    System.out.println("Name updated to: " + myCat.getName());
    System.out.println(
        "--------------------------------------------------------------------------");
    //Working with methods
    for (Method method : myCat.getClass().getDeclaredMethods())
    {
      if (method.getName().equals("showLocation"))
      {
        method.setAccessible(true);
        method.invoke(myCat);
      }
      //Working with static private methods
      else if (method.getName().equals("staticMethodExample"))
      {
        method.setAccessible(true);
        method.invoke(null, "Private Static Method with String");
      }
    }
    System.out.println(
        "--------------------------------------------------------------------------");
  }
}
