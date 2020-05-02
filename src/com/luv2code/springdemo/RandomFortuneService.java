package com.luv2code.springdemo;

import java.util.Random;

public class RandomFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		String[] fortuneStrings = {"go for it!", "fighting!", "Go, go, go!"};
		Random r = new Random();
		return fortuneStrings[r.nextInt(fortuneStrings.length)];
	}

}
