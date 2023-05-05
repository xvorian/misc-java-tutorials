package com.home.stream;

import com.home.common.ProjectConstants;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConcatinatingStreams
{
  public static void main(String[] args)
  {
    List<String> bCountries = Arrays.asList(ProjectConstants.countriesName).stream()
        .filter(n -> n.startsWith("B")).collect(
            Collectors.toList());
    List<String> cCountries = Arrays.asList(ProjectConstants.countriesName).stream()
        .filter(n -> n.startsWith("C")).collect(
            Collectors.toList());
    List<String> aCountries = Arrays.asList(ProjectConstants.countriesName).stream()
        .filter(n -> n.startsWith("A")).collect(
            Collectors.toList());

    // Can combine two streams and combine them
    Stream<String> combinedStream = Stream.concat(aCountries.stream(),bCountries.stream());
    combinedStream.forEach(System.out::println);

  }
}
