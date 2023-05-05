package com.home.stream;

import com.home.common.ProjectConstants;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapPrac
{
  public static void main(String[] args)
  {
    List<String> counties = Arrays.asList(ProjectConstants.countriesName).stream()
        .filter(c -> (c.startsWith("C"))).map(name -> name.toUpperCase()).sorted((c1, c2) -> c2.compareToIgnoreCase(c1)).collect(
            Collectors.toList());
    System.out.println(counties);
    List<Integer> numList = Arrays.asList(4,5,6,3,2,6,8);
    System.out.println(numList);
    List<Integer> numListUpdated =numList.stream().map(num -> num*num).collect(Collectors.toList());
    System.out.println(numListUpdated);
  }
}
