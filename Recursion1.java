// import java.util.*;

// Print no 5 to 1

// public class Recursion1 {
//     public static void printNumb(int n) {
//         if (n==0) {
//            return; 
//         }
//         System.out.println(n);
//         printNumb(n-1);
//     }
//     public static void main(String[] args) {
//         int n = 5;
//         printNumb(n);
//     }
// }


// Print no 1 to 5

// public class Recursion1 {
//     public static void printNumb(int n) {
//         if (n==6) {
//             return;
//         }
//         System.out.println(n);
//         printNumb(n+1);
//     }
//     public static void main(String[] args) {
//         int n = 1;
//         printNumb(n);
//     }
// }


// sum of n naturals numbers

// public class Recursion1 {
//     public static void printSum(int i, int n, int sum) {
//         if (i == n) {
//             sum += i;
//             System.out.println(sum);
//             return;
//         }
//         sum += i;
//         printSum(i+1, n, sum);
//         System.out.println(i);
//     }
//     public static void main(String[] args) {
//         printSum(1, 5, 0);
//     }
// }

// Factorial of n 

// public class Recursion1 {
//     public static int calcfactorial(int n) {
//         if (n == 1 || n == 0) {
//             return 1;
//         }
//         int fact_nm1 = calcfactorial(n-1);
//         int fact_n = n * fact_nm1;
//         return fact_n;
//     }

//     public static void main(String[] args) {
//         int n = 6;
//         calcfactorial(n);
//         System.out.println(calcfactorial(n));
//     }
// }


// Print fibonacci sequence till nth term

// public class Recursion1 {

//     public static void prinFib(int a, int b , int n) {
//         if (n == 0){
//             return;
//         }
//         int c = a + b;
//         System.out.println(c);
//         prinFib(b, c, n-1);
//     }
//     public static void main(String[] args) {
//         int a = 0 , b = 1;
//         System.out.println(a);
//         System.out.println(b);
//         int n = 7;
//         prinFib(a, b, n-2);
//     }
// }


// Print x^n (stack height = n)

// public class Recursion1 {

//     public static int calcPower(int x, int n) {
//         if (n == 0) {
//             return 1;
//         }
//         if (x == 0) {
//             return 0;
//         }
//         int xPownm1 = calcPower(x, n-1);
//         int xPown = x * xPownm1;
//         return xPown;
//     }

//     public static void main(String[] args) {
//         int x = 2, n = 5;
//         int ans = calcPower(x, n);
//         System.out.println(ans);
//     }
// }

// Print x^n (Stack height logn)

// public class Recursion1 {

//     public static int calcPower(int x, int n) {
//         if (n == 0) {
//             return 1;
//         }
//         if (x == 0) {
//             return 0;
//         }
//         if (n % 2 == 0) {
//             return calcPower(x, n/2) * calcPower(x, n/2);
//         }
//         else {
//             return calcPower(x, n/2) * calcPower(x, n/2) * x;
//         }
//     }
//     public static void main(String[] args) {
//         int x = 2, n = 5;
//         int ans = calcPower(x, n);
//         System.out.println(ans);
//     }
// }

