package org.andestech.learning.sber2020;
import java.util.Random;

/**
 * ABS test
 * Employee class
 * <ul>
 *    <li> Name </li>
 *    <li> SName </li>
 *    <li> ID </li>
 * </ul>
 *
 * @author Andrei
 * @version 1.0.2
 */
public class Employee {
    long id;
    String name, sname;
    Employee manager= null;

    public Employee(){
        this(-1,"Default","Default", null);
     }

    public Employee(String name, String sname, Employee employee){
        this(0,name,sname,employee);
        id = new Random().nextInt(2_000_000_000);
    }

    public Employee(int id, String name, String sname){
        this(id,name,sname,null);
    }

    public Employee(int id, String name, String sname, Employee employee){
         this.id = id;
         this.name = name;
        this.sname = sname;
        manager = employee;
        System.out.println("+++ ctor2: " + this);
    }

    String getEmployeeInfo(){
        return String.format("id:%d, %s %s.",id, name, sname);
    }
    public void printEmployee(){ System.out.println(getEmployeeInfo());}

}
