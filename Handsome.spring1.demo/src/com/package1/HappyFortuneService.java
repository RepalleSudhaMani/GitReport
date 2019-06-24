package com.package1;

import java.util.Random;

public class HappyFortuneService implements FortuneService {
Random random=new Random();
	@Override
	public String random() {
		// TODO Auto-generated method stub
		//int n=(int)Math.random();
		//return arr[n];
	//	String arr[]= {"hello","Good","to","see","you"};
//   String temp=arr[(int)Math.random()*arr.length];
 //  return temp;
	String data[]=
		{
				"AAAAA","BBBBB","cccccc","DDDD","eeeee"
		};
   int i=random.nextInt(data.length);
	
	return data[i];
	}

}
