import java.util.*;
public class unique{
public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
int n=sc.nextInt();
int arr[]=new int[n];
for (int i = 0; i < arr.length; i++) {
    arr[i]=sc.nextInt();
}
int res=0;
for (int i = 0; i < arr.length; i++) {
    res^=arr[i];
}
System.out.println(res);
}
 
}