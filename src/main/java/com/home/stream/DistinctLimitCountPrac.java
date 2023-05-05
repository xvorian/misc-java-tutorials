package com.home.stream;

import com.home.common.ProjectConstants;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class DistinctLimitCountPrac
{
  public static void main(String[] args)
  {
    // Limit
    List<String> limitList = Arrays.asList(ProjectConstants.countriesName).stream().limit(10)
        .collect(
            Collectors.toList());
    System.out.println(limitList);

    List<Integer> actual = Arrays.asList(ProjectConstants.returnRandomNumbers(20, 1, 100));

    // Distinct
    List<Integer> duplicates = Arrays.asList(3, 4, 5, 6, 4, 5, 6, 4, 5, 6);
    duplicates.stream().distinct().forEach(System.out::println);

    // distinct sorted
    List<Integer> randomMinMax = actual.stream().distinct().sorted((n1, n2) -> (n1.compareTo(n2)))
        .collect(
            Collectors.toList());
    System.out.println(randomMinMax);

    // Min
    Optional<Integer> min = actual.stream().min((v1, v2) -> {
      return v1.compareTo(v2);
    });
    System.out.println(min);

    // Max
    Optional<Integer> max = actual.stream().max((v1,v2) ->{return v1.compareTo(v2);});
    System.out.println(max);
  }
}
