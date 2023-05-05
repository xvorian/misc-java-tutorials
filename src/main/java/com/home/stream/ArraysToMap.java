package com.home.stream;

import com.home.common.ProjectConstants;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

import static java.lang.System.out;

public class ArraysToMap
{
  public static void main(String[] args)
  {
    Map<String, String> details = Arrays.stream(ProjectConstants.personDetails)
        .collect(Collectors.toMap(q -> q[0], q -> q[1]));
    System.out.println(details.keySet());
    System.out.println(details.values());

    Arrays.stream(ProjectConstants.personDetails)
        .peek(w -> out.println(String.format("%s %s", w[0], w[1]))).collect(
            Collectors.toMap(w -> w[0], w -> w[1]));
    //        System.out.println(details.keySet());
    //        System.out.println(details.values());

    //    Arrays.stream(ProjectConstants.personDetails).collect(Collectors.toMap(q -> q[0], e->e[1])).forEach(System.out::println);

    Arrays.stream(ProjectConstants.countriesName).sorted((w1, w2) -> w1.compareToIgnoreCase(w2))
        .forEach(w -> System.out.println(String.format(" %s", w)));

  }
}
