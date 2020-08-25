package com.flysaa.driver;
import com.flysaa.seat.Seat;
import java.util.ArrayList;
import com.flysaa.person.Employee;
import java.util.Scanner;
import com.flysaa.display.Display;
import com.flysaa.person.Client;
public class Driver{
public Driver(){}
public static void main (String[]args){
Scanner s = new Scanner(System.in);
System.out.println("*** Please Login ***");
Employee emp = new Employee();
emp.setEmployeeName();
emp.setEmployeeNumber();
emp.setPassword();
Client c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14,c15,c16,c17,c18,c19,c20,c21,c22,c23,c24,c25;
Seat s1,s2;
for(int a=0; a<=100; a++){

Display dis = new Display();
dis.display();
ArrayList<String> list = new ArrayList<>();

int input = s.nextInt();
switch (input){
case 1:
if(a == 0){
c1 = new Client(1001);
c1.printFlightTicket();
}
if(a == 1){
c2 = new Client(1002);
c2.printFlightTicket();
}
if(a == 2){
c3 = new Client(1003);
c3.printFlightTicket();
}
if(a == 3){
c4 = new Client(1004);
c4.printFlightTicket();
}
if(a == 4){
c5 = new Client(1005);
c5.printFlightTicket();
}
if(a == 5){
c6 = new Client(1006);
c6.printFlightTicket();
}
if(a == 6){
c7 = new Client(1007);
c7.printFlightTicket();
}
if(a == 7){
c8 = new Client(1008);
c8.printFlightTicket();
}
if(a == 8){
c9 = new Client(1009);
c9.printFlightTicket();
}
if(a == 9){
c10 = new Client(1010);
c10.printFlightTicket();
}
if(a == 10){
c11 = new Client(1011);
c11.printFlightTicket();
}
if(a == 11){
c12 = new Client(1012);
c12.printFlightTicket();
}
if(a == 12){
c13 = new Client(1013);
c13.printFlightTicket();
}
if(a == 13){
c14 = new Client(1014);
c14.printFlightTicket();
}
if(a == 14){
c15 = new Client(1015);
c15.printFlightTicket();
}
if(a == 15){
c16 = new Client(1016);
c16.printFlightTicket();
}
if(a == 16){
c17 = new Client(1017);
c17.printFlightTicket();
}
if(a == 17){
c18 = new Client(1018);
c18.printFlightTicket();
}
if(a == 18){
c19 = new Client(1019);
c19.printFlightTicket();
}
if(a == 19){
c20 = new Client(1020);
c20.printFlightTicket();
}
if(a == 20){
c21 = new Client(1021);
c21.printFlightTicket();
}
if(a == 21){
c22 = new Client(1022);
c22.printFlightTicket();
}
if(a == 22){
c23 = new Client(1023);
c23.printFlightTicket();
}
if(a == 23){
c24 = new Client(1024);
c24.printFlightTicket();
}
if(a == 24){
c25 = new Client(1025);
c25.printFlightTicket();
}
if(a>25){
System.out.println("Plane Number A0101 Fully booked");
}
break;
case 2:
System.out.println("Enter Client's Pin Code");
int clientNumber = s.nextInt();
if(clientNumber == 1001){
c1 = null;
}
if(clientNumber == 1002){
c2 = null;
}
if(clientNumber == 1003){
c3 = null;
}
if(clientNumber == 1004){
c4 = null;
}
if(clientNumber == 1005){
c5 = null;
}
if(clientNumber == 1006){
c6 = null;
}
if(clientNumber == 1007){
c7 = null;
}
if(clientNumber == 1008){
c8 = null;
}
if(clientNumber == 1009){
c9 = null;
}
if(clientNumber == 1010){
c10 = null;
}
if(clientNumber == 1011){
c11 = null;
}
if(clientNumber == 1012){
c12 = null;
}
if(clientNumber == 1013){
c13 = null;
}
if(clientNumber == 1014){
c14 = null;
}
if(clientNumber == 1015){
c15 = null;
}
if(clientNumber == 1016){
c16 = null;
}
if(clientNumber == 1017){
c17 = null;
}
if(clientNumber == 1018){
c18 = null;
}
if(clientNumber == 1019){
c19 = null;
}
if(clientNumber == 1020){
c1 = null;
}
if(clientNumber == 1021){
c21 = null;
}
if(clientNumber == 1022){
c22 = null;
}
if(clientNumber == 1023){
c23 = null;
}
if(clientNumber == 1024){
c24 = null;
}
if(clientNumber == 1025){
c25 = null;
}

break;
case 3:

}
}
}
}

