package patterns;
import java.util.*;
public class PaternUsing1ForLoop {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int k=1;
        //int count=1;
        for (int line_no = 1; line_no <= a; ) 
    { 
        // If current star count is less than 
        // current line number 
        if (curr_star < line_no) 
        { 
           cout << "* "; 
           curr_star++; 
           continue; 
        }  
        if (curr_star == line_no) 
        { 
           cout << "\n"; 
           line_no++; 
           curr_star = 0; 
        } 
    } 
    }
}
