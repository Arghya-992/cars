import java.util.*;
public class car {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int a = 5;
int car1;
int car2;
int car3;
int car4;
int car5;
int min;
System.out.println("Welcome to the parking lot. Press 1 to park your vehicle. Press 2 to leave. Press 3 to check how many vehicles are there.");
int user = sc.nextInt();

switch(user){
    case 1: 
    int ab = 1;
    while (ab <= 5){
        System.out.println("Your car has been entered");
    } 
        System.out.println("No more parking space is left in the parking lot. Press 2 to leave or press 3 to to view the number of cars.");
    break;
    case 2: 
    min =  a - 1;
    System.out.println("Are you leaving? A certain number of vehicles have left. Press 3 to check.");
    break;
    case 3: 
    System.out.println("The number of lots available are: 4. In case you are interested to park your car please press 1.");
    break;
    default:
    System.out.println("Please enter a valid number");
}}}