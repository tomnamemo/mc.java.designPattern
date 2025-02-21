package com.mc.designpattern.dProxy;

// Developer 인터페이스를 구현하는 Man 클래스
public class Man implements Developer {
	
	// 개발 메서드: 파이썬으로 개발하는 구현
	public void develop() {
		System.out.println("파이썬으로 개발한다. (핵심로직)"); // 개발 동작 메시지 출력
	}

}
