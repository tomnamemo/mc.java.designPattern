package com.mc.designpattern.aBuilder.quiz;

import java.time.LocalDate;

public class Run {

	public static void main(String[] args) {
		Calculator cal = new Calculator(10);
		
		int res = cal
				.plus(100)
				.plus(50)
				.plus(50)
				.minus(100)
				.calculate();
		
		System.out.println(res);
		
		
		//메서드 체이닝 예제
		LocalDate nowDate = LocalDate.now();
		LocalDate afterDate =  nowDate
								.plusMonths(1)
								.plusDays(17)
								.plusWeeks(3);
		System.out.println(nowDate);
		System.out.println(afterDate);
		
	}

}
