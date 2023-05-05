package com.home.generics;

public class StringPrinter
{

  public static void main(String[] args)
  {
    Printer<String> print = new Printer<String>("This is sentence...");
    print.print();

  }

}
