package vvcbccco;

import java.util.*;
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
       Scanner sc = new Scanner(System.in); 
        int m = sc.nextInt();
        int n = sc.nextInt();
      
        int i =1;
        
            while(i>0){
                
            
               int  z=((i*i)-m-n);
               if(z<m && z<n && z>0)
               {
                System.out.println(z);
                i++;
                break;
               }
            
            else
            {
                System.out.println(0);
                i++;
                break;
            }
           
        }
    }
}
