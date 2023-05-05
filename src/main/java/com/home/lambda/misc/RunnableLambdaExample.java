package com.home.lambda.misc;

class ThreadDemo implements Runnable
{
  @Override public void run()
  {
    System.out.println("Run method called");
  }
}

public class RunnableLambdaExample
{

  public static void main(String[] args)
  {
    Thread thread = new Thread(new ThreadDemo());
    thread.start();

    Runnable runnable = () -> {
      System.out.println("Using Runnable interface");
    };

    Thread thread1 = new Thread(runnable);
    thread1.start();

    Thread thread2 = new Thread(() -> System.out.println("Complex item"));
    thread2.start();
  }
}
