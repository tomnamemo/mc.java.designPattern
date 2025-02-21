package com.mc.designpattern.dProxy;

// Developer 인터페이스를 구현하는 Woman 클래스
public class Woman implements Developer {
	
	// 개발 메서드: 자바로 개발하는 구현
	public void develop() {
		System.out.println("자바로 개발한다. (핵심로직)"); // 개발 동작 메시지 출력
	}

}
