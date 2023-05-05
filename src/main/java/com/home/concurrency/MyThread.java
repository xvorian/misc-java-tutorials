package com.home.concurrency;

public class MyThread extends Thread
{

  @Override
  public void run() {
    System.out.println("Run:"+getName());
  }
  public static void main(String[] args)
  {
    new MyThread().start();
    System.out.println("Main:"+Thread.currentThread().getName());

  }

}
