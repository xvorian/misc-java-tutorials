package com.home.concurrency;

public class TriggerCount
{

  public static void main(String[] args)
  {
    Thread cd = new Thread(new CountDown());
    System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    cd.start();
    try
    {
      cd.join();
    }
    catch (Exception e)
    {
      e.printStackTrace();
    }
    System.out.println("-------------------------------------------------");
  }

}
