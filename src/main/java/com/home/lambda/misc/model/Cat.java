package com.home.lambda.misc.model;

public class Cat
{
  private String name;
  private int age;

  public Cat(String name, int age)
  {
    this.name = name;
    this.age = age;
  }

  public String getName()
  {
    return name;
  }

  public int getAge()
  {
    return age;
  }

  public void setAge(int age)
  {
    this.age = age;
  }

  private void showLocation()
  {
    System.out.println("Animal is Cat");
  }

  private static void staticMethodExample(String sound)
  {
    System.out.println("Calling Static Method Example with: " + sound);
  }
}
