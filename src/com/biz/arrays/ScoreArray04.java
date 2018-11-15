package com.biz.arrays;

public class ScoreArray04 {
	
	public static void main(String[] args) {
		
		int[] intMath=new int[100];
		int intSum=0;
		
		for(int i=0; i<intMath.length; i++) {
			intMath[i]=ConstMethod.makeScore();
			
		}
		
		for(int i=0; i<intMath.length; i++) {
			if(intMath[i]>=80) {
				intSum+=intMath[i];
				System.out.printf("Index : %d\t Value : %d\n",i,intMath[i]);
			}
		}
		System.out.println("----------------------------");
		System.out.println("Value Sum : "+intSum);
		
		for(int i=0; i<intMath.length; i++) {
			if(intMath[i]>=80) {
				System.out.println("First No  : "+i);
				break;
			}
		}
		
	}

}
