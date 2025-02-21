package com.mc.designpattern.cStrategy;

// 무기의 행동을 정의하는 인터페이스
public interface Weapon {
	
	// 데미지를 받아 공격 가중치를 계산하는 메서드
	int calAttakWeight(int damage);
	
	// 공격 동작을 수행하는 메서드
	void attack();
}
