package com.home.optional;

import com.home.lambda.misc.model.EmployeeDetails;

import java.util.Optional;
import java.util.function.Function;

public class EmployDetailsPrac
{
  private String _id;
  private String name;
  private double Salary;
  private String designation;
  private boolean status;
  private static String email ="amjad.hanif@gmail.com";

  static{
    System.out.println("The static is executed before main method");
  }

  public static void main(String[] args)
  {
    // Returns Empty Optional Object
    Optional<Object> emptyOptional = Optional.empty();

    // Throws nullPointerException if value is not available
    System.out.println(emptyOptional);
    Function<String, String> eName = String::toLowerCase;
    email = eName.apply(email);
    Optional<String> emailOptionalOfNullable = Optional.ofNullable(email);
    System.out.println(emailOptionalOfNullable);

    Optional<String> emailOptional = Optional.of(email);
    System.out.println(emailOptional);

    Optional<EmployeeDetails> employee = Optional.of(new EmployeeDetails());
    System.out.println(Optional.of(employee.get().getName()));

  }

  public static void of()
  {
    //    Optional<EmployeeDetails> employee = Optional.of(new EmployeeDetails());
    //    System.out.println("Name:" + employee.getName().toUpperCase());
  }

  public static void empty()
  {
    EmployeeDetails employee = new EmployeeDetails();
    System.out.println("Name:" + employee.getName().toUpperCase());

  }

  public static void ofNullable()
  {

  }
}
