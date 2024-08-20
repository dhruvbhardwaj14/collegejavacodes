import java.util.*;
public class A_Helpful_Maths{
public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
String w=sc.nextLine();
char result[] = w.toCharArray();
char temp[]=new char[(w.length()/2)+1];
int k=0;
for (int i = 0; i < result.length; i+=2) {
    temp[k]=result[i];
    k++;
}
Arrays.sort(temp);
k=0;
 for (int i = 0; i < result.length; i+=2) {
    result[i]=temp[k];
    k++;
 }
 for (int i = 0; i < result.length; i++) {
    System.out.print(result[i]);
 }
 
}
}