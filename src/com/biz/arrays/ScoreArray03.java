package com.biz.arrays;

public class ScoreArray03 {
	
	public static void main(String[] args) {
		
		int intSum=0;
		int[] intEng=new int[10];
		
		for(int i=0; i<intEng.length; i++) {
			intEng[i]=ConstMethod.makeScore();
		}
		
		for(int i=0; i<intEng.length; i++) {
			intSum+=intEng[i];
		}
		
		
		
		
		
	}

}
