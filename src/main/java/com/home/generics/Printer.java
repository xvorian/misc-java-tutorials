package com.home.generics;

public class Printer<T>
{
  T thingsToPrint;

  public Printer(T t)
  {
    this.thingsToPrint = t;
  }

  public void print()
  {
    System.out.println(this.thingsToPrint);
  }
}
