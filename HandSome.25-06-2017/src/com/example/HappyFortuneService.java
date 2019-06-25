	package com.example;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Random;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {
    Random random=new Random();
    public String [] data=new String[5];;
	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
	//int i=random.nextInt(data.length);
     // return data[i];
		String temp=data[(int)(Math.random()*data.length)];
		return temp;
	}
@PostConstruct
public void stringReader()
{
	
	String temp;
	int i=0;
   System.out.println("happy init");
   try {
	     BufferedReader br=new BufferedReader(new FileReader("FortuneFile"));
         while((temp=br.readLine())!=null)
        		 {
        	 data[i++]=temp;
        		 }
         br.close();
   }
   catch(Exception e)
   {
	   e.printStackTrace();
   }
}
@PreDestroy
public void destroy()
{
	System.out.println("destroy of HappyFortune ");
}

}
