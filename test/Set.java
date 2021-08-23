package uuu.etgt.test;

public class Set {

	public static void main(String[] args) {
		public static int[] sortArrayByParity(int[] A) {
		    int s = 0; 
		    int e = A.length - 1;
		    while (s < e) {
		        if ((A[s] & 1) == 1) { // 是否為奇數(even)
		            if ((A[e] & 1) == 0) { // 是否為偶數(odd)
		                int temp = A[s];
		                A[s] = A[e];
		                A[e] = temp;
		                s++;
		                e--;
		            } else {
		                e--;
		            }
		        } else {
		            s++;
		        }
		    }
		    return A;
		}
	}

}
