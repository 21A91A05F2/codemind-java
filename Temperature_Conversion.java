import java.util.*;
class conversion{
    public static void main(String args[]){
        int c;
        Scanner sc=new Scanner(System.in);
        c = sc.nextInt();
        Double f = 32+(c*1.8);
        System.out.format("%.2f",f);
    }
}