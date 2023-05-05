package com.home.stream;

import com.home.common.ProjectConstants;
import com.home.lambda.misc.model.EmployeeDetails;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FilterPrac
{
  public static void main(String[] args)
  {
    List<EmployeeDetails> employeeDetails = ProjectConstants.employeeList.stream()
        .filter(e -> e.getSalary() >= 100000).collect(
            Collectors.toList());
    System.out.println(employeeDetails.toString());
    for (EmployeeDetails employee : employeeDetails)
    {
      System.out.println(employee.toString());
    }

    Set<String> countryNames = Arrays.asList(ProjectConstants.countriesName).stream()
        .filter(e -> (e.startsWith("A") && e.endsWith("a"))).collect(
            Collectors.toSet());
    System.out.println(countryNames);
    Arrays.asList(ProjectConstants.countriesName).stream()
        .filter(e -> (e.startsWith("U") || e.endsWith("t"))).forEach(n -> System.out.println(n));
    System.out.println("---------------------------------");
    Arrays.asList(ProjectConstants.countriesName).stream()
        .filter(e -> (e.startsWith("U") || e.endsWith("t"))).forEach(System.out::println);
    System.out.println("---------------------------------");
    System.out.println(Arrays.asList(ProjectConstants.countriesName).stream()
        .filter(e -> e.startsWith("B")).collect(Collectors.toList()));
    System.out.println("---------------------------------");
  }
}
