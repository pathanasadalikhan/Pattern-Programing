package patterns;
import java.util.*;
public class aBcDeFgHiJ {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(i%2==1){
                    System.out.print((char)(96+j));
                }
                else{
                    System.out.print((char)(64+j));
                }
            }
            System.out.println();
        }
    }
}
// input
// 5
// output
// a
// AB
// abc
// ABCD
// abcde