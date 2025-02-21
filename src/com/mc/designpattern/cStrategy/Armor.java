package com.mc.designpattern.cStrategy;

// 방어구의 행동을 정의하는 인터페이스
public interface Armor {

	// 데미지를 받아 방어 가중치를 계산하는 메서드
	int calDefenceWeight(int damage);
}
