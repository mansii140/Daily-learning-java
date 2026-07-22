import java.util.*;

// 1. Tower of hanoi 

// public class Recursion2 {
    
//     public static void towerOfHanoi(int n, String src, String helper, String dest) {
//         if (n==1){
//         System.out.println("transfer disk"+" "+ n + " " +"from"+" "+ src +" "+ "to"+" " + dest);
//         return;
//     }
//         towerOfHanoi(n-1, src, dest, helper);
//         System.out.println("transfer disk"+" "+ n + " " +"from"+" "+ src +" "+ "to"+" " + dest);
//         towerOfHanoi(n-1, helper, src, dest);
//     }
//     public static void main(String[] args) {
//         int n = 3;
//         towerOfHanoi(n, "S", "H", "D");
//     }
// }

// 2. Print a string in reverse "abcd"

// public class Recursion2 {

//     public static void printRev(String str, int idx) {
//         if (idx == 0) {
//             System.out.println(str.charAt(idx));
//             return;
//         }
//         System.out.print(str.charAt(idx));
//         printRev(str, idx-1);
//     }
//     public static void main(String[] args) {
//         String str = "abcd";
//         printRev(str, str.length()-1);
//     }
// }


// 3. Find the first and last occurance of an eelement in string "abaacdaefaah"

// public class Recursion2 {

//     public static int first = -1;
//     public static int last = -1;

//     public static void findOccurance(String str, int idx, char element) {
//         if (idx == str.length()) {
//             System.out.println(first);
//             System.out.println(last);
//             return;
//         }
//        char currChar = str.charAt(idx);
//        if (currChar == element) {
//         if (first == -1) {
//             first = idx;
//         } else {
//             last = idx;
//         }
//        }
//        findOccurance(str, idx+1, element);
//     }
//     public static void main(String[] args) {
//         String str = "abaacdaefaah";
//         findOccurance(str, 0, 'a');
//     }
// }

// 4. Check if an array is sorted (Strictly increasing) "1,2,3,4,5"

// public class Recursion2 {

//     public static boolean isSorted(int arr[], int idx) {
//         if (idx == arr.length-1) {
//             return true;
//         }
//         if (arr[idx] < arr[idx+1]) {
//            return isSorted(arr, idx+1);
//         }else{
//             return false;
//         }
//     }
//     public static void main(String[] args) {
//         int arr[]= {1,3,2};
//         System.out.println(isSorted(arr, 0));
//     }
// }
