package com.flysaa.seat;
import java.util.*;
public class Seat{
public ArrayList<Integer> seat = new ArrayList<>();
private int seatNumber;
Scanner scan = new Scanner(System.in);
public Seat(){
int i = 1;
do{
System.out.println("Enter Seat Number");
seatNumber = scan.nextInt();
if(seatNumber == 0){
System.out.println("Seat Taken");
}else{
seat.add(seatNumber);
}
}while(i<1);
i++;
}

public int getSeatNo(){
return seatNumber;
}
}
