package org.andestech.learning.sber2020.m1;

import org.andestech.learning.sber2020.Employee;

public class ClassTest {
    public static void main(String[] args) {

   Employee emp1 = new Employee("BAsiL "," THe WOLf",null);
   emp1.printEmployee();
   String s1 = "ABCD";

  Employee emp2 = new Employee("Lawrence "," Olivier",emp1);
  new Employee(11111,"Lawrence "," Olivier Second",emp1);
   //Employee.ORGANISATION = "RAIFF";

   System.out.println(Employee.ORGANISATION);

   System.out.println(s1.substring(1));
   System.out.println(s1.substring(0,1));

   System.out.println("Count: " + Employee.getCount());


    }
}
