package com.home.stream;

import com.home.common.ProjectConstants;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortedMatchFind
{
  public static void main(String[] args)
  {
    String randomString = ProjectConstants.getRandomString(10, false);
    List<Integer> actual = Arrays.asList(ProjectConstants.returnRandomNumbers(10, 1, 100));

    ////////////////////////////////////////////////// Sort //////////////////////////////////////////////////
    // Sorted
    System.out.println("Sorted Asc:"+actual.stream().sorted().collect(Collectors.toList()));

    //Sorted Desc Order
    System.out.println("Sorted Desc:"+actual.stream().sorted(Comparator.reverseOrder()).collect(
        Collectors.toList()));
    ////////////////////////////////////////////////// Match //////////////////////////////////////////////////
    List<String> aCountries = Arrays.asList(ProjectConstants.countriesName).stream().filter(a -> a.startsWith("A")).collect(Collectors.toList());

    // anyMatch
    System.out.println(aCountries);
    System.out.println("anyMatch - All Countries name Start with 'A': "+aCountries.stream().allMatch(a -> a.startsWith("A")));
    System.out.println("anyMatch - All Countries name End with 'a': "+aCountries.stream().allMatch(a -> a.endsWith("a")));

    //allMatch
    System.out.println("allMatch - All Countries name Start with 'A': "+aCountries.stream().anyMatch(a -> a.startsWith("A")));
    System.out.println("allMatch - All Countries name End with 'a': "+aCountries.stream().anyMatch(a -> a.endsWith("a")));

    //noneMatch
    System.out.println("noneMatch - All Countries name Start with 'A': "+aCountries.stream().noneMatch(a -> a.startsWith("A")));
    System.out.println("noneMatch - All Countries name End with 'a': "+aCountries.stream().noneMatch(a -> a.endsWith("a")));

    ////////////////////////////////////////////////// Find //////////////////////////////////////////////////
    //noneMatch
    System.out.println("noneMatch - All Countries:"+Arrays.asList(ProjectConstants.countriesName).stream().sorted(Comparator.reverseOrder()).findFirst());
    System.out.println("noneMatch - All Countries:"+Arrays.asList(ProjectConstants.countriesName).stream().findAny());

  }
}
