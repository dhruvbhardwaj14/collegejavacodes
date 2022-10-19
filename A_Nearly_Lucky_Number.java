package Dhruv_Java;
import java.util.*;
public class A_Nearly_Lucky_Number{
public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
Long n = sc.nextLong();
String s1 =  Long.toString(n);

int sum =0;
for (int i = 0; i < s1.length(); i++) {
    int m = Integer.parseInt(String.valueOf(s1.charAt(i)));
    if (m==4 || m==7){
        sum += 1;
    }

    
}
if (sum== s1.length()){
    System.out.println("YES");
}
else{
    System.out.println("NO");
}
// String s=sc.next();
// int count=0;
// for (int i = 0; i < s.length(); i++) {
//     if (s.charAt(i)=='4' || s.charAt(i)=='7') {
//         count++;
//     }
// }
// String p=Integer.toString(count);
// boolean flag=true;
// for (int i = 0; i < p.length(); i++) {
//     if (p.charAt(i)=='4' || p.charAt(i)=='7') {
//         flag=true;
//     }
//     else{
//         flag=false;
//         break;
//     }
// }
// if (flag) {
//     System.out.println("YES");
// }
// else{
//     System.out.println("NO");
// }
}
 
}