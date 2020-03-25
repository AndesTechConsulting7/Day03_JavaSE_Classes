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
    private long id;
    private String name;
    private String sname;
    private Employee manager= null;

    public long getId(){return id;}

    public String getName(){return name;}
    public void setName(String name){ this.name = name.trim().toUpperCase();}

    public String getSname() {  return sname; }
    public void setSname(String sname) { this.sname = sname.trim().toUpperCase(); }

    public Employee getManager() { return manager; }
    public void setManager(Employee manager) {
        //....
        //....
        boolean sflag = true;
        if(sflag){
        this.manager = manager;}}

    public Employee(){
        this(-1,"Default","Default", null);
     }

    private long generateId(){
        //...
        // check Db, dublicates
        return new Random().nextInt(2_000_000_000);
    }

    public Employee(String name, String sname, Employee employee){
        this(0,name,sname,employee);
        id = generateId();
    }

    public Employee(int id, String name, String sname){
        this(id,name,sname,null);
    }

    public Employee(int id, String name, String sname, Employee employee){
         this.id = id;
         this.name = name;
        this.setSname(sname);
        setManager(employee);
        System.out.println("+++ ctor2: " + this);
    }

    String getEmployeeInfo(){
        return String.format("id:%d, %s %s.",id, name, getSname());
    }
    public void printEmployee(){ System.out.println(getEmployeeInfo());}


}
