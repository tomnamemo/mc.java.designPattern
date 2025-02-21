package com.mc.designpattern.cStrategy;

// Weapon 인터페이스를 구현하는 Sword 클래스
public class Sword implements Weapon {
	
	private String name; // 검의 이름
	private int atkWeight; // 공격 가중치
	
	// 생성자: 검의 이름과 공격 가중치를 초기화
	public Sword(String name, int atkWeight) {
		super();
		this.name = name;
		this.atkWeight = atkWeight;
	}

	// 공격 가중치를 계산하는 메서드
	@Override
	public int calAttakWeight(int damage) {
		return (int) (damage * (1 + atkWeight)); // 기본 데미지에 공격 가중치 적용
	}

	// 공격 메서드: 검을 휘두르는 동작
	@Override
	public void attack() {
		System.out.println(name + "을 날카롭게 휘두릅니다!"); // 공격 메시지 출력
	}
}
