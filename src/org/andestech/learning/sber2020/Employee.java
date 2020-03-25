package org.andestech.learning.sber2020;
import java.util.Random;

import org.andestech.learning.sber2020.utils.ABSUtils;

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
 * @version 1.0.3
 */
public class Employee {
    private long id;
    private String name;
    private String sname;
    private Employee manager= null;

    private static int count = 0;
    public final static String ORGANISATION;

    static {
        //...
        System.out.println("+++ static init!");
        ORGANISATION = "SBER";
    }

    public static int getCount(){return count;}
    public long getId(){return id;}
    private void setId(long id){
        //.. check
        this.id = id;
    }

    // Aaaaaa Bbbbbb
//     private String normalizeName(String n){
//     n = n.trim();
//     String s1 = n.substring(0,1).toUpperCase();
//     String s2 = n.substring(1).toLowerCase();
//     return s1+s2;
//        // return n.trim().toUpperCase();
//    }

    public String getName(){return name;}
   // public void setName(String name){ this.name = normalizeName(name);}
   public void setName(String name){ this.name = ABSUtils.normalizeName(name);}

    public String getSname() {  return sname; }
   //  public void setSname(String sname) { this.sname = normalizeName(sname); }
   public void setSname(String sname) { this.sname = ABSUtils.normalizeName(sname); }

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
        setId(generateId());
    }

    public Employee(int id, String name, String sname){
        this(id,name,sname,null);
    }

    public Employee(int id, String name, String sname, Employee employee){
        setId(id);
        setName(name);
        setSname(sname);
        setManager(employee);
        System.out.println("+++ ctor2: " + this);
        count++;
    }

    String getEmployeeInfo(){
        return String.format("id:%d, %s %s.",id, name, getSname());
    }
    public void printEmployee(){ System.out.println(getEmployeeInfo());}


}
