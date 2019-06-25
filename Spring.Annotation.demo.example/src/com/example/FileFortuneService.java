package com.example;

import org.springframework.stereotype.Component;

@Component
public class FileFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return "welcome to file fortune";
	}

}
