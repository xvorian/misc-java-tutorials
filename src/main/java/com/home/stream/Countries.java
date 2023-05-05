package com.home.stream;

import com.home.common.ProjectConstants;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Countries
{
  private static ArrayList<String> countryList = new ArrayList<>(
      Arrays.asList(ProjectConstants.countriesName));
  private static Set<String> countriesSet;

  private static String[] sentenceWords = ProjectConstants.sentence.split(" ");

  public static void main(String[] args)
  {
    Function<List<String>, Set<String>> convertedSet = (countryList) -> new HashSet<String>(
        new ArrayList<>(countryList));

    countriesSet = convertedSet.apply(countryList);
    System.out.println(countriesSet);
    System.out.println("--------------------------------------");
    System.out.println("Count Length:" + countriesSet.stream().count());
    System.out.println("Find First:" + countriesSet.stream().findFirst());

    System.out.println("Number of words in Sentence: " + Arrays.stream(sentenceWords).count());

    String countryToRearch = "Pakistan";
    Optional<String> countrySelected = countriesSet.stream().filter(word -> word.equalsIgnoreCase(countryToRearch)).findFirst();
    System.out.println(countrySelected.isPresent() ? countrySelected: countryToRearch+ " Not Present");

    // showing all uppercase
    Arrays.stream(sentenceWords).map(w -> w.toUpperCase()).collect(
         Collectors.toList()).forEach(System.out::println);

    //Showing Set of String
    Set<String> collectedSet = Arrays.stream(sentenceWords).map(w -> w.toLowerCase()).collect(Collectors.toSet());
    System.out.println(collectedSet);

    // Sorting a String of Arrays
    Arrays.stream(sentenceWords).sorted((a,b) -> a.compareToIgnoreCase(b)).forEach(System.out::println);

  }
}
