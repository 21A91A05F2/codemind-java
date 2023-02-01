import java.util.*;
class capacity{
    public static void main(String args[]){
        int t,s,b;
        Scanner sc=new Scanner(System.in);
        t = sc.nextInt();
        s = sc.nextInt();
        b = sc.nextInt();
        int k = t*s*b*512;
        System.out.println(2*k);
        
    }
}