package patterns;

import java.util.*;

public class abcde {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i,j;
        for( i=1;i<=n;i++){
            for( j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(j=1;j<=n-i+1;j++){
                System.out.print((char)(64+j));
            }
            for(j=1;j<=n-i+1;j++){
                System.out.print((char)(69+j));
            }
            System.out.println();
        }
        for( i=1;i<=n;i++){
            for( j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(j=1;j<=n-i+1;j++){
                System.out.print((char)(96+j));
            }
            for(j=1;j<=n-i+1;j++){
                System.out.print((char)(101+j));
            }
            System.out.println();
        }
        
    }
}
//input
//5
//output
//  ABCDEFGHIJ
//   ABCDFGHI
//    ABCFGH
//     ABFG
//      AF
//  abcdefghij
//   abcdfghi
//    abcfgh
//     abfg
//      af
