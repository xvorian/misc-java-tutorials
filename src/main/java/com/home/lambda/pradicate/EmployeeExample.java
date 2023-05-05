package com.home.lambda.pradicate;

import com.home.common.ProjectConstants;
import com.home.lambda.misc.model.EmployeeDetails;

import java.util.function.Predicate;

public class EmployeeExample
{

  public static void main(String[] args)
  {
    System.out.println(ProjectConstants.employeeList.size());

    // FOR SINGLE EMPLOYEE DETAILS
    Predicate<EmployeeDetails> employeeFind = (e) -> (ProjectConstants.employeeList.contains(e));
    System.out.println(
        employeeFind.test(new EmployeeDetails("1", "Amjad", 100000, "Director", true)));

    // FOR MULTIPLE EMPLOYEE DETAILS
    Predicate<EmployeeDetails> emp = (employee) -> (employee.getSalary() <= 100000
        && employee.isStatus());

    for (EmployeeDetails employee : ProjectConstants.employeeList)
    {
      System.out.println(emp.test(employee) ? employee.toString() : null);
    }

  }
}
