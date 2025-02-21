package com.mc.designpattern.dProxy;

// Developer 인터페이스를 구현하는 프록시 클래스
public class DeveloperProxy implements Developer {

	private Developer developer; // 실제 개발자 객체를 참조하는 변수

	// 생성자: 프록시가 참조할 실제 개발자 객체를 초기화
	public DeveloperProxy(Developer developer) {
		super();
		this.developer = developer;
	}

	// 개발 메서드: 프록시에서 공통적인 작업을 수행
	@Override
	public void develop() {
		
		System.out.println("출근 카드를 찍는다. (log 찍기, 공통 전처리)"); // 전처리 작업 로그 출력
		
		try {
			// 실제 개발자에게 개발 요청
			developer.develop();
		} catch (Exception e) {
			// 예외 발생 시 처리
			System.out.println("앗 쉬는 날이었다! (예외처리)");
		} finally {
			// 항상 수행되는 후처리 작업
			System.out.println("집에 간다.");
		}
	}
}
