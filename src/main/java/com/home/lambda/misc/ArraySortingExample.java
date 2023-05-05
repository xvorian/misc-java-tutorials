package com.home.lambda.misc;

import com.home.common.ProjectConstants;

import java.util.Arrays;

public class ArraySortingExample
{
  public static void main(String[] args)
  {
    String[] withoutSort = ProjectConstants.countriesName;
    Arrays.sort(withoutSort, (s2, s1) -> s2.compareToIgnoreCase(s1));
    Arrays.sort(withoutSort, String::compareToIgnoreCase);

  }
}
