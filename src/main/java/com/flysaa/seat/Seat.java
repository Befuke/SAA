package com.flysaa.seat;
import java.util.Scanner;
public class Seat{
static int seatNo[] = new int[25];
private int seatNumber;
Scanner scan = new Scanner(System.in);
public Seat(){
int i = 1;
do{
System.out.println("Enter Seat Number");
seatNo[i] = scan.nextInt();
if(seatNo[i] == seatNo[i-1]){
System.out.println("Seat Taken");
}


}while(i<1);
i++;
}



//public Seat(){
//for( int i = 1; i<=26; i++){
//if(i == 1){
//System.out.println("Enter Seat Number");
//seatNo[0] = scan.nextInt();
//if(seatNo[0] < 1){
//System.out.println("Seat Taken");
//}
//}
//}
//}
public int getSeatNo(){
return seatNo[0];
}
}
