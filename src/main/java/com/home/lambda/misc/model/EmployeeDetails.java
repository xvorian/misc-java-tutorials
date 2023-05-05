package com.home.lambda.misc.model;

import java.util.Objects;

@FunctionalInterface
interface EmployeeInterface
{
  void print(EmployeeDetails employee);

  default void showEmployeeDetails()
  {
    System.out.println("From showEmployeeDetails");
  }

  public static void showDetails()
  {
    System.out.println("From showDetails");
  }
}

public class EmployeeDetails implements EmployeeInterface
{
  private String _id;
  private String name;
  private double Salary;
  private String designation;
  private boolean status;

  public EmployeeDetails(String id, String name, double salary, String designation, boolean status)
  {
    set_id(id);
    this.setName(name);
    setSalary(salary);
    this.setDesignation(designation);
    this.setStatus(status);
  }

  public EmployeeDetails()
  {
  }

  public String get_id()
  {
    return _id;
  }

  public void set_id(String _id)
  {
    this._id = _id;
  }

  public String getName()
  {
    return name;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public double getSalary()
  {
    return Salary;
  }

  public void setSalary(double salary)
  {
    Salary = salary;
  }

  public String getDesignation()
  {
    return designation;
  }

  public void setDesignation(String designation)
  {
    this.designation = designation;
  }

  public boolean isStatus()
  {
    return status;
  }

  public void setStatus(boolean status)
  {
    this.status = status;
  }

  @Override public void print(EmployeeDetails employee)
  {
    System.out.println(
        String.format("Id [%s] Name [%s] Salary [%s] Designation [%s]", get_id(), getName(),
            getSalary(), getDesignation()));
  }

  @Override public String toString()
  {
    return "EmployeeDetails{" +
        "_id='" + _id + '\'' +
        ", name='" + name + '\'' +
        ", Salary=" + Salary +
        ", designation='" + designation + '\'' +
        ", status=" + status +
        '}';
  }

  @Override public boolean equals(Object o)
  {
    if (this == o)
      return true;
    if (!(o instanceof EmployeeDetails))
      return false;
    EmployeeDetails that = (EmployeeDetails) o;
    return Double.compare(that.getSalary(), getSalary()) == 0 && getName().equals(
        that.getName());
  }

  @Override public int hashCode()
  {
    return Objects.hash(getName(), getSalary());
  }
}
