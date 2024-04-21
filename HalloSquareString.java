package patterns;

import java.util.Scanner;

public class HalloSquareString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int co=s.length();
        int k=s.length()-1;
        int n=s.length()-1;
        for(int i=0;i<co;i++){
            for(int j=0;j<co;j++){
                if(i==0){
                    System.out.print(s.charAt(j)+" ");
                }
                else if(j==0){
                    System.out.print(s.charAt(i)+" ");
                }
                else if(i==co-1){
                    k--;
                    System.out.print(s.charAt(k)+" ");
                }
                else if(j==co-1){
                    n--;
                    System.out.print(s.charAt(n)+" ");
                }
                else if(i==j){
                    System.out.print(s.charAt(i)+" ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
// Sample Input ;
//kallimunisa

//Sample output;
// k a l l i m u n i s a
// a                   s 
// l                   i
// l                   n
// i                   u
// m                   m
// u                   i
// n                   l
// i                   l
// s                   a
// a s i n u m i l l a k

// Sample Input 1:
//software
// Sample Output 1:
// s o f t w a r e
// o             r 
// f             a
// t             w
// w             t     
// a             f
// r             o
// e r a w t f o s

