package designpattern.bTempletemethod;

// Player 클래스를 상속받는 Warrior 클래스
public class Warrior extends Player {

	// 생성자: 이름, 체력, 공격력, 방어력을 초기화
	public Warrior(String name, int hp, int atk, int def) {
		super(name, hp, atk, def); // 부모 클래스의 생성자 호출
	}

	// 공격 가중치를 계산하는 메서드 (데미지의 30% 증가)
	@Override
	protected int calAttakWeight(int damage) {
		System.out.println("전사의 분노가 적용되었습니다."); // 공격 가중치 적용 메시지 출력
		return (int) (damage * 1.3); // 30% 증가된 데미지 반환
	}

	// 방어 가중치를 계산하는 메서드 (데미지의 30% 감소)
	@Override
	protected int calDefenseWeight(int damage) {
		System.out.println("전사의 가호가 적용되었습니다."); // 방어 가중치 적용 메시지 출력
		return (int) (damage * 0.7); // 30% 감소된 데미지 반환
	}
}
