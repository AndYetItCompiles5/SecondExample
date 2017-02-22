package edu.csbsju.cs;
   // the classes in this file are part of this package

import java.util.*;
   // import statements come after the package statement

public class Employee
{
   public Employee(String n, double s, int year, int month, int day)
   {
      name = n;
      salary = s;
      GregorianCalendar calendar = new GregorianCalendar(year, month - 1, day);
         // GregorianCalendar uses 0 for January
      hireDay = calendar.getTime();
   }

   public String getName()
   {
      return name;
   }

   public String toString()
   {
     return "Name: " + name + " Salary: " + salary + " Date of Hire: " + hireDay;
   }

   public double getSalary()
   {
      return salary;
   }

   public Date getHireDay()
   {
      return hireDay;
   }

   public void raiseSalary(double byDecimalValue)
   {
     if(byDecimalValue >= 0 || byDecimalValue <=1)
     {
       double raise = salary * byDecimalValue;
       salary += raise;
     }
     else
     {
       throw new IllegalArgumentException("Must be between 1 and 0");
     }
   }

   private String name;
   private double salary;
   private Date hireDay;
}
