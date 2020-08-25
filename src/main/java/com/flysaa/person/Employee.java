package com.flysaa.person;
import java.util.Scanner;
public class Employee extends Person{
private String employeeNumber;
private String password;
Scanner sc = new Scanner(System.in);

public void setEmployeeName(){
System.out.println("Enter Name");
String name = sc.nextLine();
this.name = name;
}
public String getEmployeeName(){
return name;
}
public void setEmployeeNumber(){
System.out.println("Enter Number");
String employeeNumber =  sc.nextLine();
this.employeeNumber = employeeNumber;
}
public String getEmployeeNumber(){
return employeeNumber;
}
public void setPassword (){
System.out.println("Enter Password");
String password = sc.nextLine();
this.password = password;
}
public String getPassword(){
return password;
}



}
