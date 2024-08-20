import java.util.*;
public class ques{
public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
int n=sc.nextInt();
int a[]=new int[n];
int mx,mxidx=0,mn,mnidx=0,count=0;
//New learning
mx=Integer.MIN_VALUE;
mn=Integer.MAX_VALUE;
for (int i = 0; i < a.length; i++) {
    a[i]=sc.nextInt();
    mx=Math.max(mx,a[i]);
    mn=Math.min(mn,a[i]);
}
// System.out.println(mx);
// System.out.println(mn);

for (int i = 0; i < a.length; i++) {
    if(a[i]==mx){
        mxidx=i;
        break;
    }
}
for (int i = n-1; i>=0; i--) {
    if(a[i]==mn){
        mnidx=i;
        break;
    }
}
// System.out.println(mxidx);
// System.out.println(mnidx);
count=(n-1-mnidx)+mxidx;
if(mxidx>mnidx){
    System.out.println(count-1);
}
else{
    System.out.println(count);
}
}

}
