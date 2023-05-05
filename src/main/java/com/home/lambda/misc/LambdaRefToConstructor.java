package com.home.lambda.misc;

import com.home.common.ProjectConstants;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;

public class LambdaRefToConstructor
{
  public static void main(String[] args)
  {
    List<String> countries = Arrays.asList(ProjectConstants.countriesName);

    Function<List<String>, Set<String>> setFunction = (countriesList) -> new HashSet<>(
        countriesList);
    System.out.println(setFunction.apply(countries));

    Function<List<String>, Set<String>> withRef = HashSet::new;
    System.out.println(withRef.apply(countries));

  }
}
