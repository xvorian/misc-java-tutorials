package com.home.concurrency;

class CountDown implements Runnable
{
  Integer[] numbers = new Integer[100];

  public void run()
  {
    for(int i=0; i<50;i++) {
      try
      {
        System.out.println(i);
      }
      catch (Exception e)
      {
        System.err.println(e.getMessage());
      }
    }
  }
}
