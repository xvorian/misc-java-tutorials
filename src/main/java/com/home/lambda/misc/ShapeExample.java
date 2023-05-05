package com.home.lambda.misc;

interface Shape
{
  void draw();
}

class Circle implements Shape
{

  public void draw()
  {
    System.out.println("Circle");
  }

  public String shape()
  {
    // TODO Auto-generated method stub
    return null;
  }
}

class Square implements Shape
{

  public void draw()
  {
    System.out.println("Square");
  }

  public String shape()
  {
    // TODO Auto-generated method stub
    return null;
  }
}

class Rectangle implements Shape
{

  public void draw()
  {
    System.out.println("Rectange");
  }

  public String shape()
  {
    // TODO Auto-generated method stub
    return null;
  }
}

class Triangle implements Shape
{

  public void draw()
  {
    System.out.println("Triangle");
  }

  public String shape()
  {
    // TODO Auto-generated method stub
    return null;
  }
}

public class ShapeExample
{
  public static void main(String[] args)
  {
    // Shape rectangle = () -> System.out.println("rectangle");
    // rectangle.draw();

    Shape square = () -> System.out.println("Square");
    // square.draw();

    Shape circle = () -> {System.out.println("Circle");};
    // circle.draw();
   
    System.out.println("-------------");
    print(() -> System.out.println("rectangle"));
       print(circle);
  }

  public static void print(Shape shape){
    shape.draw();
  }


}
