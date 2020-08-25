package com.flysaa.person;
import java.util.*;
import java.time.*;
import com.flysaa.seat.Seat;
public class Client extends Person{

private String age;
private String phoneNumber;
private String email;
private String address;
private String nationality;
private String sex;

private String planeNumber;
private String planeClass;
private String lockage = "Lockage: 32kg";
private ZonedDateTime departureDate;
private ZonedDateTime arrivalTime;
private String destination;
private String flightNumber;
private String numberOfTrip;
private String planeCapacity;
private String extraLockage;
private int pin;
private String passengers;
Seat s;
Scanner scan = new Scanner(System.in);
public Client(int pin){
System.out.println("Enter Name");
this.name = scan.nextLine();
System.out.println("Enter age");
this.age = scan.nextLine();
System.out.println("Enter Sex");
this.sex = scan.nextLine();
System.out.println("Enter PhoneNumber");
this.phoneNumber = scan.nextLine();
System.out.println("Enter Email");
this.email = scan.nextLine();
System.out.println("Enter Address");
this.address = scan.nextLine();
System.out.println("Enter Nationality");
this.nationality = scan.nextLine();
this.pin = pin;
payFlightTicket();
s = new Seat();

}

public void payFlightTicket(){
this.passengers = "25 Passengers";
this.planeNumber = "A001";
this.destination = "CAMEROON";
LocalDateTime takeOff = LocalDateTime.of(2020,12,25,12,00);
ZonedDateTime departureDate = ZonedDateTime.of(takeOff,ZoneId.of("Africa/Johannesburg"));
this.departureDate = departureDate;
LocalDateTime arrival = LocalDateTime.of(2020,12,25,16,20);
ZonedDateTime arrivalTime = ZonedDateTime.of(arrival,ZoneId.of("Africa/Douala"));
this.arrivalTime = arrivalTime;

System.out.println("Two-way or One-Way Trip");
this.numberOfTrip = scan.nextLine();
System.out.println("Enter Class");
this.planeClass = scan.nextLine();
System.out.println("Extra lockage?");
this.extraLockage = scan.nextLine();
}
public void printFlightTicket(){
System.out.println("Would You Like To Print Out FlightTicket ?");
String input = scan.nextLine();
if(input.equalsIgnoreCase("Yes")){
System.out.println("Client's Name:"+ getName());
System.out.println("Client's Age:"+ getAge());
System.out.println("Client's Sex:"+ getSex());
System.out.println("Client's PhoneNumber:"+ getPhoneNumber());
System.out.println("Client's Email:"+ getEmail());
System.out.println("Client's Address:"+ getAddress());
System.out.println("Client's Nationality:"+ getNationality());
System.out.println("Client's Destination:"+ getDestination());
System.out.println("Departure Date and Time:"+ getDepartureDate());
System.out.println("Arrival Date and Time:"+ getArrivalTime());
System.out.println("Number Of Trip:"+ getNumberOfTrip());
System.out.println("Plane Class:"+ getPlaneClass());
System.out.println("Lockage:"+ getLockage());
System.out.println("Extra Lockage"+ getExtraLockage());
System.out.println("Seat Number:"+ s.getSeatNo());
System.out.println("Plane Number:"+ getPlaneNumber());
System.out.println("Number of Passengers:"+ getPassengers());
System.out.println("Client's Pin:" + getPin());
}
if(input.equalsIgnoreCase("No")){
System.out.println("*** Thank You For Trusting South African Airline ***");
}
}
public String getPlaneNumber(){
return planeNumber;
}
public String getExtraLockage(){
return extraLockage;
}
public String getLockage(){
return lockage;
}
public String getPlaneClass(){
return planeClass;
}
public String getNumberOfTrip(){
return numberOfTrip;
}

public ZonedDateTime getArrivalTime(){
return arrivalTime;
}

public String getDestination(){
return destination;
}
public ZonedDateTime getDepartureDate(){
return departureDate;
}

public String getSex(){
return sex;
}
public String getAge(){
return age;
}
public String getName(){
return name;
}
public String getPhoneNumber(){
return phoneNumber;
}
public String getEmail(){
return email;
}
public String getAddress(){
return address;
}
public String getNationality(){
return nationality;
}
public int getPin(){
return pin;
}
public String getPassengers(){
return passengers;
}

}
