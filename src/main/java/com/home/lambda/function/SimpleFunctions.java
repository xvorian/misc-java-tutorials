package com.home.lambda.function;

import com.home.common.ProjectConstants;
import com.home.lambda.misc.model.EmployeeDetails;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class SimpleFunctions
{
  public static void main(String[] args)
  {
    // Functions
    Function<Integer, Integer> square = n -> n * n;
    System.out.println("Square is: " + square.apply(5));

    Function<String, String> upClass = n -> n.toUpperCase();
    System.out.println("Upper case:" + upClass.apply("welcome"));

    Function<EmployeeDetails, Double> bonus = es -> {
      return (es.getSalary() > 100000) ? (es.getSalary() * .10) : es.getSalary() * 0.05;
    };

    // PREDICATE
    Predicate<Double> showBonus = b -> b > 2500;

    // CONSUMER
    Consumer<EmployeeDetails> noBonusEmployee = e -> System.out.println(e.toString());

    // SUPPLIER
    Supplier<EmployeeDetails> employeeDetailsSupplier = () -> ProjectConstants.employeeList.get(2);
    noBonusEmployee.accept(employeeDetailsSupplier.get());
    for (EmployeeDetails employee : ProjectConstants.employeeList)
    {
      if(showBonus.test(bonus.apply(employee)))
      {
        System.out.println(employee.toString() + ", " + bonus.apply(employee));
      }else{
        noBonusEmployee.accept(employee);
      }
    }

  }
}
