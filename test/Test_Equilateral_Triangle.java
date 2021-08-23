package uuu.etgt.test;

public class Test_Equilateral_Triangle {

	public static void main(String[] args) {
		
		 System.out.println("正三角:");
//	        for(int i = 1; i <= 10; i++){//外層迴圈控制行數
//	            //內層迴圈控制列數
//	            for (int j = 1; j < 10; j++) {
//	                if (i<=j) {
//	                    System.out.print(" ");    
//	                }
//	            }
//	            
//	            for (int j = 10; j >= 1; j--) {
//	                if (i>=j) {
//	                    if (j==10) {
//	                        System.out.print("*");
//	                    }else{
//	                        System.out.print(j);
//	                    }
//	                }
//	            }
//	            
//	            for (int j = 1; j <= 10; j++) {
//	                if (j<=i&&j!=1) {
//	                    if(j==10){
//	                        System.out.print("*");
//	                    }else{
//	                        System.out.print(j);
//	                    }
//	                }
//	            }
//	            
//	            for (int j = 10; j >= 1; j--) {
//	                if (i<=j) {
//	                    System.out.print(" ");    
//	                }
//	            }
//	            System.out.println();
//	        }
		 
		 int rows = 5;
	      for(int i=1;i<=rows;i++)
	     {
	         for(int j=1;j<=rows-i;j++)
	         {
	           System.out.print(" ");
	         }
	        for(int j=1; j<=(2*i-1);j++)  //三角形
	       {
	          System.out.print("*");
	        }
	        System.out.println();
	       }
	        
	}

}
