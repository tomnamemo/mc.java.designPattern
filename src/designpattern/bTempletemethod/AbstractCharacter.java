package designpattern.bTempletemethod;

import java.util.Random;

// Character 인터페이스를 구현하는 추상 클래스
public abstract class AbstractCharacter implements Character {

	private String name; // 캐릭터의 이름
	private int hp; // 최대 체력
	private int currentHp; // 현재 체력
	private int atk; // 공격력
	private int def; // 방어력

	// 생성자: 캐릭터의 이름, 체력, 공격력, 방어력을 초기화
	public AbstractCharacter(String name, int hp, int atk, int def) {
		super();
		this.name = name;
		this.hp = hp;
		this.currentHp = hp; // 현재 체력은 최대 체력으로 초기화
		this.atk = atk;
		this.def = def;
	}

	// 공격 메서드: 목표 캐릭터에게 공격을 수행
	@Override
	public void attack(Character target) {
		Random random = new Random();
		// 랜덤 데미지 계산 (공격력의 ±50% 범위)
		int damage = random.nextInt(atk * 2 - atk / 2) + atk / 2;
		damage = calAttakWeight(damage); // 공격 가중치 계산
		target.takeDamage(damage); // 대상에게 데미지 적용
	}

	// 자식 클래스에서 구현해야 할 추상 메서드: 공격 가중치 계산
	protected abstract int calAttakWeight(int damage);

	// 데미지 수용 메서드: 공격을 받을 때 호출
	@Override
	public void takeDamage(int damage) {
		damage = calDefenseWeight(damage); // 방어 가중치 계산
		damage = damage < 0 ? 0 : damage; // 데미지가 0보다 작으면 0으로 설정
		applyDamage(damage); // 데미지 적용
	}

	// 실제 데미지를 적용하는 메서드
	private void applyDamage(int damage) {
		this.currentHp -= damage; // 현재 체력에서 데미지 차감
		this.currentHp = currentHp < 0 ? 0 : currentHp; // 현재 체력이 0보다 작으면 0으로 설정
	}

	/***
	 * 방어 가중치 계산 메서드
	 * 
	 * @param damage: 받은 데미지
	 * @return: 반환되는 데미지 연산 결과값은 꼭 0보다 커야합니다
	 */
	protected abstract int calDefenseWeight(int damage);

	// 캐릭터가 죽었는지 확인하는 메서드
	public boolean isDead() {
		return currentHp == 0; // 현재 체력이 0이면 사망
	}

	// Getter 메서드들
	public String getName() {
		return name; // 캐릭터 이름 반환
	}

	public int getHp() {
		return hp; // 최대 체력 반환
	}

	public int getCurrentHp() {
		return currentHp; // 현재 체력 반환
	}

	public int getAtk() {
		return atk; // 공격력 반환
	}

	public int getDef() {
		return def; // 방어력 반환
	}

}
