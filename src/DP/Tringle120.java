package DP;

import java.util.ArrayList;
import java.util.List;

public class Tringle120 {
	 public static int minimumTotal(List<List<Integer>> triangle) {
	        int[] A = new int[triangle.size()+1];
	    for(int i=triangle.size()-1;i>=0;i--){
	        for(int j=0;j<triangle.get(i).size();j++){
	            A[j] = Math.min(A[j],A[j+1])+triangle.get(i).get(j);
	        }
	    }
	    return A[0];
	    }
	 //sol2 without extra memory
	 public static int minimumTotal2(List<List<Integer>> triangle) {
	        int[] A = new int[triangle.size()+1];
	    for(int i=triangle.size()-1;i>=0;i--){
	        for(int j=0;j<triangle.get(i).size();j++){
	            A[j] = Math.min(A[j],A[j+1])+triangle.get(i).get(j);
	        }
	    }
	    return A[0];
	    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<Integer>> triangle = new ArrayList<>();
		
		List<Integer> temp = new ArrayList<>();
		temp.add(2);
		triangle.add(temp);
		
		List<Integer> temp1 = new ArrayList<>();
		temp1.add(3);
		temp1.add(4);
		triangle.add(temp1);
		
		List<Integer> temp2 = new ArrayList<>();
		temp2.add(6);
		temp2.add(5);
		temp2.add(7);
		triangle.add(temp2);
		
		List<Integer> temp3 = new ArrayList<>();
		temp3.add(4);
		temp3.add(1);
		temp3.add(8);
		temp3.add(3);

		triangle.add(temp3);
		
		System.out.println(minimumTotal(triangle));

	}

}
