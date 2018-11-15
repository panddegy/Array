package com.biz.arrays;

public class ScoreArray01 {
	
	public static void main(String[] args) {
		
		int intClassCount=10;
		
		int[] intKor=new int[intClassCount];
		int[] intEng=new int[intClassCount];
		int[] intMat=new int[intClassCount];
		int[] intSci=new int[intClassCount];
		
		intKor[0]=90;
		intKor[1]=91;
		intKor[2]=92;
		intKor[3]=93;
		intKor[4]=94;
		intKor[5]=95;
		intKor[6]=96;
		intKor[7]=97;
		intKor[8]=98;
		intKor[9]=99;
		
		for(int i=0; i<intKor.length; i++) {
			System.out.println(intKor[i]);
		}
		
		}

}
