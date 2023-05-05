package com.home.lambda.misc.model;

public class Animal
{
  protected String name;
  protected int age;

  public void sound()
  {
    System.out.println("Make Sound:" + this.name);
  }

  public Animal(String name, int age)
  {
    this.name = name;
    this.age = age;
  }

}
