import java.util.Scanner;

class Intercitybus {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("the available cities : hyderabad,chennai,vijaywada,bengaluru");

        System.out.println("enter from");
        String from = sc.nextLine();
        System.out.println("enter to");
        String to = sc.nextLine();
        int[] seats=new int[20];

        if (from.equals("hyderabad") && to.equals("chennai")) {
            System.out.println("THE AVAILABLE BUSES");
            System.out.println("From   " + from + " to  " + to);
            System.out.println("bus nummber: TS08HK9990");
            System.out.println("KK travels");
            System.out.println("departure time : 10:30pm");
            System.out.println("the available seats are :");
            for (int i = 0; i < 20; i++) {

        if (seats[i] == 0) {
            System.out.println("Seat " + (i + 1) + " - Available");
        }
        else {
            System.out.println("Seat " + (i + 1) + " - Booked");
        }
    }
        } else if (from.equals("hyderabad") && to.equals("vijaywada")) {
            System.out.println("THE AVAILABLE BUSES");
            System.out.println("From   " + from + " to  " + to);
            System.out.println("BUS NUMBER: NL09HJ2090 - BVR TRAVELS - TIME: 9:00PM -6:30AM - DURATION : 7HRS30MIN");
            System.out.println("the available seats are :");
            for (int i = 0; i < 20; i++) {

        if (seats[i] == 0) {
            System.out.println("Seat " + (i + 1) + " - Available");
        }
        else {
            System.out.println("Seat " + (i + 1) + " - Booked");
        }
    }
        } else if (from.equals("hyderabad") && to.equals("bengaluru"))
        {
            System.out.println("THE AVAILABLE BUSES");
           System.out.println("From   " + from + " to  " + to);
           System.out.println("BUS NUMBER: APO9RR1209 - DIWAKAR TRAVELS - TIME: 9:00PM -6:30AM - DURATION : 9HRS30MIN ");
           System.out.println("the available seats are :");
           for (int i = 0; i < 20; i++) {

        if (seats[i] == 0) {
            System.out.println("Seat " + (i + 1) + " - Available");
        }
        else {
            System.out.println("Seat " + (i + 1) + " - Booked");
        }
    }
        } else if (from.equals("bengaluru") && to.equals("hyderabad")) {
            System.out.println("THE AVAILABLE BUSES");
           System.out.println("From   " + from + " to  " + to);
           System.out.println("BUS NUMBER: TS08HK9989 - RR TRAVELS - TIME: 11:00PM -6:30AM - DURATION : 7HRS30MIN ");
           System.out.println("the available seats are :");
           for (int i = 0; i < 20; i++) {

        if (seats[i] == 0) {
            System.out.println("Seat " + (i + 1) + " - Available");
        }
        else {
            System.out.println("Seat " + (i + 1) + " - Booked");
        }
    }
        } else if (from.equals("vijaywada") && to.equals("hyderabad")) {
            System.out.println("THE AVAILABLE BUSES");
           System.out.println("From   " + from + " to  " + to);
           System.out.println("BUS NUMBER: AP39KL9999 - RRR TRAVELS - TIME: 11:00PM -6:30AM - DURATION : 7HRS30MIN ");
           System.out.println("the available seats are :");
           for (int i = 0; i < 20; i++) {

        if (seats[i] == 0) {
            System.out.println("Seat " + (i + 1) + " - Available");
        }
        else {
            System.out.println("Seat " + (i + 1) + " - Booked");
        }
    }
        } else if (from.equals("chennai") && to.equals("hyderabad")) {
            System.out.println("THE AVAILABLE BUSES");
           System.out.println("From   " + from + " to  " + to);
           System.out.println("BUS NUMBER: KA29HH9898 - KR TRAVELS - TIME: 8:00PM -6:30AM - DURATION : 10HRS30MIN ");
           System.out.println("the available seats are :");
           for (int i = 0; i < 20; i++) {

        if (seats[i] == 0) {
            System.out.println("Seat " + (i + 1) + " - Available");
        }
        else {
            System.out.println("Seat " + (i + 1) + " - Booked");
        }
    }
        }
         else if(from.equals("chennai") && to.equals("vijaywada")){
    {
            System.out.println("THE AVAILABLE BUSES");
           System.out.println("From   " + from + " to  " + to);
           System.out.println("BUS NUMBER: AP39KL9090 - RRR TRAVELS - TIME: 11:00PM -6:30AM - DURATION : 7HRS30MIN ");
           System.out.println("the available seats are :");
           for (int i = 0; i < 20; i++) {

        if (seats[i] == 0) {
            System.out.println("Seat " + (i + 1) + " - Available");
        }
        else {
            System.out.println("Seat " + (i + 1) + " - Booked");
        }
    }
        }
     }
      else if(from.equals("chennai") && to.equals("bengaluru")){
        {
            System.out.println("THE AVAILABLE BUSES");
           System.out.println("From   " + from + " to  " + to);
           System.out.println("BUS NUMBER: KA09YY7895 - YASH TRAVELS - TIME: 9:00PM -6:30AM - DURATION : 9HRS30MIN ");
           System.out.println("the available seats are :");
           for (int i = 0; i < 20; i++) {

        if (seats[i] == 0) {
            System.out.println("Seat " + (i + 1) + " - Available");
        }
        else {
            System.out.println("Seat " + (i + 1) + " - Booked");
        }
    }
        }
     }
 else if(from.equals("bengaluru") &&  to.equals("vijaywada")){ 

        {
            System.out.println("THE AVAILABLE BUSES");
           System.out.println("From   " + from + " to  " + to);
           System.out.println("BUS NUMBER: AP39KL9990 - KR TRAVELS - TIME: 11:00PM -6:30AM - DURATION : 7HRS30MIN ");
           System.out.println("the available seats are :");
           for (int i = 0; i < 20; i++) {

        if (seats[i] == 0) {
            System.out.println("Seat " + (i + 1) + " - Available");
        }
        else {
            System.out.println("Seat " + (i + 1) + " - Booked");
        }
    }
        }
     }
       else if(from.equals("bengaluru") && to.equals("chennai")){
        {
            System.out.println("THE AVAILABLE BUSES");
           System.out.println("From   " + from + " to  " + to);
           System.out.println("BUS NUMBER: TN09JK8888 - VIJAY TRAVELS - TIME: 9:00PM -6:30AM - DURATION : 9HRS30MIN ");
           System.out.println("the available seats are :");
           for (int i = 0; i < 20; i++) {

        if (seats[i] == 0) {
            System.out.println("Seat " + (i + 1) + " - Available");
        }
        else {
            System.out.println("Seat " + (i + 1) + " - Booked");
        }
    }
        }
     }

 else 
    {
            System.out.println("no buses are available in this route");
        }
    }
}

 
   


