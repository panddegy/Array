package com.biz.arrays;

public class ScoreArray02 {
	
	public static void main(String[] args) {
		
		int intCount=20;
		int[] intKor=new int[intCount];
		int intSum=0;
		for(int i=0; i<intKor.length; i++) {
			intKor[i]=makeScore();
			intKor[i]=ConstMethod.makeScore();
			System.out.println("Score : "+intKor[i]);
			intSum+=intKor[i];
		}
		/*for(int i=0; i<intKor.length; i++) {
			System.out.println(intKor[i]);
		}
		*/
		System.out.println("-----------");
		System.out.println("Sum : "+intSum);
		System.out.println("Avg : "+(float)intSum/intCount);
		
	}
	
	public static int makeScore() {
		return (int)(Math.random()*(100-50+1))+50;
	}

}
