package com.home.concurrency;

public class MultiThreading extends Thread
{

  @Override
  public void run()
  {
    for (int i = 0; i < 10; i++)
    {
      System.out.println(i+" , "+this.getName());
    }
    try
    {
      Thread.sleep(100);
    }
    catch (InterruptedException e)
    {
      e.printStackTrace();
    }
  }
}
