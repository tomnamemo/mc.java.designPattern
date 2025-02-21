package com.mc.designpattern.cStrategy;

import java.util.Random;
import java.util.Scanner;

// 전투를 실행하는 클래스
public class Run {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in); // 사용자 입력을 위한 스캐너 생성

		// 캐릭터 생성: 전사와 몬스터
		Character warrior = new Character("강사", 200, 10, 10);
		Character monster = new Character("고블린", 200, 10, 10);

		// 무기 배열 생성
		Weapon[] weapons = new Weapon[] { new Sword("목검", 5), new Sword("철검", 10), new Sword("엑스칼리버", 100),
				new Shield("나무방패", 3) };

		// 전사와 몬스터의 무기 장착
		warrior.equpidWeapon(weapons[0]); // 전사는 목검 장착
		monster.equpidWeapon(weapons[3]); // 몬스터는 나무방패 장착

		System.out.println("전투 시작!"); // 전투 시작 메시지 출력

		// 전투 루프
		while (true) {
			// 전사가 죽었는지 확인
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

			// 전사와 몬스터의 공격
			warrior.attack(monster); // 전사가 몬스터 공격
			monster.attack(warrior); // 몬스터가 전사 공격

			// 남은 체력 출력
			System.out.println(warrior.getName() + " 남은 체력 : " + warrior.getCurrentHp());
			System.out.println(monster.getName() + " 남은 체력 : " + monster.getCurrentHp());

			// 런타임 시점에도 전략을 바꿀 수 있다.
			Random random = new Random();
			int idx = random.nextInt(4); // 0부터 3까지의 랜덤 정수 생성
			warrior.equpidWeapon(weapons[idx]); // 전사가 랜덤하게 무기를 변경
		}

		scanner.close(); // 스캐너 닫기
	}

}
