package com.biz.arrays;

public class ScoreArray05 {
	
	public static void main(String[] args) {
		
		int[] intScore=new int[5];
		int intSort=0;
		
		for(int i=0; i<intScore.length; i++) {
			intScore[i]=ConstMethod.makeScore();
			System.out.print(intScore[i]+" ");
		}
		
		for(int i=0; i<intScore.length; i++) {
			for(int j=i+1; j<intScore.length; j++) {
				if(intScore[i]>intScore[j]) {
					intSort=intScore[i];
					intScore[i]=intScore[j];
					intScore[j]=intSort;
				}
			}
		}
		System.out.println();		
		for(int i=0; i<intScore.length; i++) {
			System.out.print(intScore[i]+" ");
			
		}
	}

}
