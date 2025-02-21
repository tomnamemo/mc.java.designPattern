package designpattern.bTempletemethod;

// AbstractCharacter를 상속받는 Player 클래스
public class Player extends AbstractCharacter {

	// 생성자: 이름, 체력, 공격력, 방어력을 초기화
	public Player(String name, int hp, int atk, int def) {
		super(name, hp, atk, def); // 부모 클래스의 생성자 호출
	}

	// 공격 가중치를 계산하는 메서드 (데미지의 10% 증가)
	@Override
	protected int calAttakWeight(int damage) {
		return (int) (damage * 1.1); // 10% 증가된 데미지 반환
	}

	// 방어 가중치를 계산하는 메서드 (데미지의 10% 감소)
	@Override
	protected int calDefenseWeight(int damage) {
		return (int) (damage * 0.9); // 10% 감소된 데미지 반환
	}
}
