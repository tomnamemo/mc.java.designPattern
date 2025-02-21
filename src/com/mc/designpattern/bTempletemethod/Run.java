package com.mc.designpattern.bTempletemethod;

import java.util.Scanner;

// 전투를 실행하는 클래스
public class Run {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in); // 사용자 입력을 위한 스캐너 생성

		// 플레이어와 몬스터 객체 생성
		Player warrior = new Player("강사", 200, 10, 10);
		Monster monster = new Monster("고블린", 200, 10, 10);

		System.out.println("전투 시작!"); // 전투 시작 메시지 출력

		// 전투 루프
		while (true) {
			// 플레이어가 죽었는지 확인
			if (warrior.isDead()) {
				System.out.println("졌습니다."); // 패배 메시지 출력
				break; // 루프 종료
			}

			// 몬스터가 죽었는지 확인
			if (monster.isDead()) {
				System.out.println("이겼습니다."); // 승리 메시지 출력
				break; // 루프 종료
			}

			System.out.println("============================");
			scanner.nextLine(); // 사용자 입력 대기

			// 플레이어와 몬스터의 공격
			warrior.attack(monster); // 플레이어가 몬스터 공격
			monster.attack(warrior); // 몬스터가 플레이어 공격

			// 남은 체력 출력
			System.out.println(warrior.getName() + " 남은 체력 : " + warrior.getCurrentHp());
			System.out.println(monster.getName() + " 남은 체력 : " + monster.getCurrentHp());
		}

		scanner.close(); // 스캐너 닫기
	}

}
