package com.home.scrap;

import java.util.HashMap;
import java.util.Map;

public class WorkingHashMap
{
  public static void main(String[] args)
  {
    Map<String, Double> priceMap = new HashMap<>();
    priceMap.put("apple", 2.45);
    priceMap.put("grapes", 1.22);

    for(String str: priceMap.keySet()){
      System.out.println(str+", "+priceMap.get(str));
    }

    double newPrice = 3.22;
    Double applePrice = priceMap.get("apple");

    Double oldValue = priceMap.replace("apple", newPrice);
    System.out.println("---------------------------");
    for(String str: priceMap.keySet()){
      System.out.println(str+", "+priceMap.get(str));
    }
  }
}
