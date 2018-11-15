package com.biz.arrays;

public class Scores01 {
	
	public static void main(String[] args) {
		
		int[] scoreArr=new int[5];
		int scoreSum=0;
		
		for(int i=0; i<5; i++) {
			scoreArr[i]=(int)(Math.random()*(100-50+1))+50;
			scoreSum+=scoreArr[i];
			System.out.println("Stu No."+(i+1)+" : "+scoreArr[i]);
			
		}
		
		System.out.println("Sum : "+scoreSum);
		System.out.println("Avg : "+(scoreSum/5.0f));
		
	}

}
