package uuu.etgt.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class TestBubbleSort {

	public static void main(String[] args) {
		
		Integer[] a =new Integer[10];
		for(int i=0;i<10;i++) {
			Random random = new Random();
			a[i]=random.nextInt(99)+1;
		}
		
		int c;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]<a[j]) {
					c=a[i];
					a[i]=a[j];
					a[j]=c;
				}
			}
			System.out.println(a[i]);
		}
		
//		Arrays.sort(a,Collections.reverseOrder());
//		for(int i : a) {
//			System.out.println(i);
//		}
		
		
		
	}

}
