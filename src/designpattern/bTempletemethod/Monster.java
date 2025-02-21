package designpattern.bTempletemethod;

// AbstractCharacter를 상속받는 Monster 클래스
public class Monster extends AbstractCharacter {

	// 생성자: 이름, 체력, 공격력, 방어력을 초기화
	public Monster(String name, int hp, int atk, int def) {
		super(name, hp, atk, def); // 부모 클래스의 생성자 호출
	}

	// 공격 가중치를 계산하는 메서드 (단순히 받은 데미지를 반환)
	@Override
	protected int calAttakWeight(int damage) {
		return damage; // 공격 가중치가 없으므로 그대로 반환
	}

	// 방어 가중치를 계산하는 메서드 (단순히 받은 데미지를 반환)
	@Override
	protected int calDefenseWeight(int damage) {
		return damage; // 방어 가중치가 없으므로 그대로 반환
	}
}
