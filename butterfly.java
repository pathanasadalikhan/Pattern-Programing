package patterns;
import java.util.*;
public class butterfly {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            int s=2*(n-i);
            for(int j=1;j<=s;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            int s=2*(n-i);
            for(int j=1;j<=s;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
//input
//5
//output
// *        *
// **      **
// ***    ***
// ****  ****
// **********
// **********
// ****  ****
// ***    ***
// **      **
// *        *

//input
//7
//output

// *            *
// **          **
// ***        ***
// ****      ****
// *****    *****
// ******  ******
// **************
// **************
// ******  ******
// *****    *****
// ****      ****
// ***        ***
// **          **
// *            *
