package com.home.stream;

import com.home.common.ProjectConstants;
import com.home.lambda.misc.model.EmployeeDetails;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapPrac
{
  public static void main(String[] args)
  {
    List<Integer> numb1 = Arrays.asList(ProjectConstants.returnRandomNumbers(5, 300, 400));
    List<Integer> numb2 = Arrays.asList(ProjectConstants.returnRandomNumbers(5, 1, 100));
    List<Integer> numb3 = Arrays.asList(ProjectConstants.returnRandomNumbers(5, 200, 300));
    List<List<Integer>> combinedList = Arrays.asList(numb1, numb2, numb3);
    System.out.println(combinedList);

    List<Integer> result = combinedList.stream()
        .flatMap(x -> x.stream().filter(n -> n % 2 == 0)).sorted((n1, n2) -> (n1.compareTo(n2)))
        .collect(Collectors.toList());
    System.out.println(result);

    List<String> bCountries = Arrays.asList(ProjectConstants.countriesName).stream()
        .filter(n -> n.startsWith("B")).collect(
            Collectors.toList());
    List<String> cCountries = Arrays.asList(ProjectConstants.countriesName).stream()
        .filter(n -> n.startsWith("C")).collect(
            Collectors.toList());
    List<String> dCountries = Arrays.asList(ProjectConstants.countriesName).stream()
        .filter(n -> n.startsWith("A")).collect(
            Collectors.toList());

    List<List<String>> combinedCounties = Arrays.asList(bCountries, cCountries, dCountries);
    List<String> countryNames = combinedCounties.stream()
        .flatMap(n -> n.stream().filter(name -> name.length() < 6))
        .sorted((n1, n2) -> n2.compareToIgnoreCase(n1)).collect(Collectors.toList());
    System.out.println(countryNames);

    List<EmployeeDetails> emplist1 = new ArrayList<EmployeeDetails>()
    {{
      add(ProjectConstants.employeeList.get(0));
      add(ProjectConstants.employeeList.get(1));
    }};
    List<EmployeeDetails> emplist2 = new ArrayList<EmployeeDetails>()
    {{
      add(ProjectConstants.employeeList.get(2));
      add(ProjectConstants.employeeList.get(3));
    }};

    List<List<EmployeeDetails>> combinedEmployee = new ArrayList<List<EmployeeDetails>>();
    combinedEmployee.add(emplist1);
    combinedEmployee.add(emplist2);

    List<EmployeeDetails> finalEmployees = combinedEmployee.stream()
        .flatMap(e -> e.stream().filter(s -> s.getSalary() >= 100000))
        .sorted((a, b) -> b.getName().compareToIgnoreCase(a.getName())).collect(
            Collectors.toList());
    System.out.println(finalEmployees.toString());
  }

}
