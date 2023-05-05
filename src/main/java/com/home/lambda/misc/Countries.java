package com.home.lambda.misc;

import com.home.common.ProjectConstants;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;

@FunctionalInterface
interface Country
{
  String name(String name);

  public static void print(String text, PrintWriter writer)
  {
    writer.write(text);
  }
}

class CountryName implements Country
{
  String result;

  @Override public String name(String name)
  {
    for (String country : ProjectConstants.countriesName)
    {
      if (country.equalsIgnoreCase(name))
      {
        this.result = country;
        return country;
      }
    }
    return null;
  }
}

public class Countries
{
  static Set<String> countrySet = new HashSet<>();

  public static void main(String[] args)
  {
    Country country = (String name) -> {
      return ("India");
    };
    System.out.println(country.name("Pakistan"));

    // Used to convert from one data type to another
    Function<String, String> toLowerCase = (msg) -> msg.toLowerCase();
    System.out.println(toLowerCase.apply(ProjectConstants.sentence));
    System.out.println("---------------------");
    Function<Integer, Boolean> comparison = (x) -> (x > 1 ? true : false);
    System.out.println(comparison.apply(-1));
    System.out.println(comparison.apply(2));
    System.out.println("---------------------");
    Function<Boolean, String> checkTrue = (x) -> (x ? "True" : "False");
    System.out.println(checkTrue.apply(true));
    System.out.println(checkTrue.apply(false));
    System.out.println("---------------------");
    Function<List<String>, Set<String>> countrySet = (countryList) -> new HashSet<>(countryList);
    System.out.println(countrySet.apply(Arrays.asList(ProjectConstants.countriesName)));
    Countries.countrySet = countrySet.apply(Arrays.asList(ProjectConstants.countriesName));
    System.out.println("---------------------");
    // Used to consume the value and get something out of it.
    Consumer<String> toUpperCase = (msg) -> System.out.println(msg.toUpperCase());
    toUpperCase.accept(ProjectConstants.sentence);
    System.out.println("---------------------");
  }
}
