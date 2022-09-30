package com.yash.java8feature.task6;

import java.util.Scanner;

/**
 * 
 * @author ankesh.patil
 *WAP to print the following patterns using lambda expression 
ABCDEFEDCBA
ABCDE EDCBA
ABCD DCBA
ABC CBA
AB BA
A A
User will enter middle character in above case user has entered F 
and you printed above pattern. If user enter G pattern will look 
like following 
ABCDEFGFEDCBA and so on.
 */
public class TestMain6 {
	 public static void main(String[] args)
	    {
	        
	        Scanner sc= new Scanner(System.in);
	        
	        System.out.println("Enter the number of row needed to in the pattern");
	        int row=sc.nextInt();
	        
	        PatternInterface p= (r)->{System.out.println("Print pattern: "+(r));





	      int alphabet=65;
	        for(int i=0;i<=row;i++) {
	            
	            for(int j=0;j<=row-i;j++) {
	                System.out.print((char)(alphabet+j));
	            }
	            
	            for(int k=1;k<=i*2-1;k++) {
	                System.out.print(" ");
	            }
	            
	            for(int l=row-i;l>=0;l--) {
	                
	                if(l!=row)
	                    System.out.print((char)(alphabet+l));
	            }
	            System.out.println();
	        }
	        
	        };    
	        p.displayPattern(row);    
	    }
}


