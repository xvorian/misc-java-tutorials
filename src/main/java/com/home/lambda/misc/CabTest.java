package com.home.lambda.misc;

interface Cab
{
  public void bookCab(String source, String destination);
}

interface Bus
{
  public String bookBus(String source, String destination);
}

public class CabTest
{
  public static void main(String[] args)
  {
    Cab burToOak = (a, b) -> System.out.println(
        String.format("Starting from [%s] and Going to [%s]", a, b));
    burToOak.bookCab("Burlington", "Oakville");

    Bus busBook = (source, destination) -> {
      return String.format("Starting from [%s] and Going to [%s]", source, destination);
    };
    System.out.println(busBook.bookBus("Toronto", "Oakville"));
  }
}
