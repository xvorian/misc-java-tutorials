package com.home.generics;

public class IntegerPrinter
{

  public static void main(String[] args)
  {
    Printer<Integer> print = new Printer(23);
    print.print();
  }

}
