package com.home.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class VariousTypes
{

  public static void main(String[] args)
  {
    ExecutorService es = fixedExecutor("Starting fixed");
    es.execute(new CountDown());
    es.shutdown();
    countlessExecutor();
    fixedExecutorCheck();
  }

  private static void countlessExecutor()
  {
    System.out.println("Start of new Cashed");
    ExecutorService es = Executors.newCachedThreadPool();
    es.execute(new CountDown());
    es.shutdown();
    System.out.println("End of new Cashed");
  }

  private static ExecutorService fixedExecutor(String message)
  {
    System.out.println(message);
    int cupCount = Runtime.getRuntime().availableProcessors();
    return Executors.newFixedThreadPool(cupCount);
  }
  
  private static void fixedExecutorCheck()
  {
    System.out.println("Start of new Fixed Check");
    int cupCount = Runtime.getRuntime().availableProcessors();
    ExecutorService es2 = Executors.newFixedThreadPool(cupCount);
    es2.execute(new CountDown());
    es2.shutdown();
    System.out.println("End of new Fixed Check");
  }


}
