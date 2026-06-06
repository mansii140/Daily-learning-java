// import java.util.*;



// if else 

// public class Conditions{
//     public static void main(String args[]){
//         Scanner sc = new Scanner (System.in);
//         int age = sc.nextInt();

//         if (age >= 18){
//             System.out.print("adult");
//         }else{
//             System.out.print("not adult");

//         }
//     }
// }

// public class Conditions{
//     public static void main(String args []){
//         Scanner sc = new Scanner (System.in);
//         int num = sc.nextInt();

//         if (num % 2 == 0){
//             System.out.print("Even no.");
//         }else {
//             System.out.print("Odd no.");
//         }
//     }
// }

// public class Conditions {
//     public static void main(String args[]){
//        Scanner sc = new Scanner(System.in);
//        System.out.print("enter income here:");
//        int income = sc.nextInt();
//        if (income < 500000){
//         System.out.print("0% tax");
//        }else if (income > 500000 && income < 1000000){
//         System.out.print("20% tax");
//     }else if (income > 1000000){
//         System.out.print("30% tax");
//     }

// }
// }

// public class Conditions{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter your first no. here:");
//         int num1 = sc.nextInt();
//         System.out.print("Enter your second no. here:");
//         int num2 = sc.nextInt();
//         System.out.print("Enter your third no. here:");
//         int num3 = sc.nextInt();
    
//         if(num1 > num2 && num1 > num3){
//             System.out.print("Largest no is :" + num1);
//         }else if (num2 > num1 && num2 > num3){
//             System.out.print("Largest no is :" + num2);
//         }else{
//             System.out.print("Largest no is :" + num3);
//         }
//     }
// }

// ternary operators

// public class Conditions {
//     public static void main(String args[]){
//     int number = 4;
//     String type = ((number % 2 ) == 0) ? "even" : "odd";
//     System.out.print(type);

// }
// }


// public class Conditions {
//     public static void main(String args[]){
//     int marks = 35;
//     String type = ((marks >= 33 )) ? "pass" : "fail";
//     System.out.print(type);
// }
// }

// Switch statement

// public class Conditions{
//     public static void main(String args[]){
//         int number = 2;
//         switch(number){
//             case 1 : System.out.print("samosa");
//             break;
//             case 2 : System.out.print("Burger");
//             break;
//             case 3 : System.out.print("Mango Shake");
//             break;
//             default: System.out.print("Better luck next time");
//         }
//     }
// }

// 

// import java.util.Scanner;

// public class Calculator {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter a here: ");
//         double a = sc.nextDouble();

//         System.out.print("Enter b here: ");
//         double b = sc.nextDouble();

//         System.out.print("Operator enter karein (+, -, *, /): ");
//         char operator = sc.next().charAt(0);

//         double result;

//         switch (operator) {
//             case '+':
//                 result = a + b;
//                 System.out.println("sum: " + result);
//                 break;

//             case '-':
//                 result = a - b;
//                 System.out.println("Subtraction: " + result);
//                 break;

//             case '*':
//                 result = a * b;
//                 System.out.println("Multiplication: " + result);
//                 break;

//             case '/':
//                  result = a / b;
//                  System.out.print("Division:" + result);

//              default:
//                  System.out.println("invalid operator");
//                break;
//         }
//     }
// }