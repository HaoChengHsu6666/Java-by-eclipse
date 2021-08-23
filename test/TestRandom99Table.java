package uuu.etgt.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TestRandom99Table {

	public static void main(String[] args) {
		
		int   n=10;    
        int[]   num   =   new   int[n];    
        for(int   i=0;i <num.length;i++)    
                num[i]   =   i+1;    
        int[]   arr   =   new   int[10];    
        for(int   i=0;i <arr.length;i++)    
        {    
                int   r   =(int)(Math.random()*n);    
                arr[i]=num[r];    
                num[r]=num[n-1];    
                n--;    
        }    
        for(int   i=0;i <arr.length;i++)    
                System.out.print(arr[i]+"   ");    
			

	}

}
