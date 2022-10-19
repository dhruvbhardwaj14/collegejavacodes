package Dhruv_Java;
import java.util.*;
public class B_Effective_Approach{
public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
// int n = sc.nextInt();
// int[] arr = new int[n];
// for (int i = 0; i < n; i++) {
//     arr[i]=sc.nextInt();
// }
// int m = sc.nextInt();
// int x=0;
// int y=0;
// while (m>0){
//     // int s1 = 0;
//     // int s2 = 0;
//     int a = sc.nextInt();
//     for (int i = 0; i < n; i++) {
//         // s1++;
//         x ++;
//         if (a== arr[i]){
//             break;
//         }

        
//     }
//     for (int i = n-1; i >=0 ; i--) {
//         // s2++;
//         y ++;
//         if (a== arr[i]){
//             break;
//         }
        
//     }
//     m--;
// }

// System.out.print(x+" ");
// System.out.print(y);
int n=sc.nextInt();
int a[]=new int[n];
for (int i = 0; i < n; i++) {
    a[i]=sc.nextInt();
}
int m=sc.nextInt();
int b[]=new int[m];
for (int i = 0; i < m; i++) {
    b[i]=sc.nextInt();
}

int petya=0;
int vasya=0;
HashMap<Integer,Integer> pm=new HashMap<Integer,Integer>();
HashMap<Integer,Integer> vm=new HashMap<Integer,Integer>();
for (int i = 0; i < n; i++) {
    pm.put(a[i], i+1);
    vm.put(a[i], n-i);
}
for (int i = 0; i < m; i++) {
    petya+=pm.get(b[i]);
    vasya+=vm.get(b[i]);
}
System.out.println(petya+" "+vasya);
}
 
}