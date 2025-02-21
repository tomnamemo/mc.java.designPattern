package designpattern.cStrategy;

import java.util.Random;

// 캐릭터를 정의하는 클래스
public class Character {

	private String name; // 캐릭터의 이름
	private int hp; // 최대 체력
	private int currentHp; // 현재 체력
	private int atk; // 공격력
	private int def; // 방어력
	private Weapon weapon; // 캐릭터가 착용한 무기
	private Armor armor; // 캐릭터가 착용한 방어구

	// 생성자: 캐릭터의 이름, 체력, 공격력, 방어력을 초기화
	public Character(String name, int hp, int atk, int def) {
		super();
		this.name = name;
		this.hp = hp;
		this.currentHp = hp; // 현재 체력은 최대 체력으로 초기화
		this.atk = atk;
		this.def = def;
	}

	// 공격 메서드: 대상 캐릭터를 공격
	public void attack(Character target) {
		if (weapon == null) {
			System.out.println("무기를 착용하지 않았습니다."); // 무기가 없을 경우 메시지 출력
			return;
		}
		weapon.attack(); // 무기 공격 메서드 호출

		Random random = new Random();
		// 랜덤 데미지 계산 (공격력의 ±50% 범위)
		int damage = random.nextInt(atk * 2 - atk / 2) + atk / 2;
		damage = weapon.calAttakWeight(damage); // 무기 공격 가중치 적용
		target.takeDamage(damage); // 대상에게 데미지 적용
	}

	// 데미지를 받는 메서드
	public void takeDamage(int damage) {
		if (armor == null) {
			applyDamage(damage); // 방어구가 없으면 그대로 데미지 적용
			return;
		}

		damage = armor.calDefenceWeight(damage); // 방어구 방어 가중치 적용
		damage = damage < 0 ? 0 : damage; // 데미지가 0보다 작으면 0으로 설정
		applyDamage(damage); // 최종 데미지 적용
	}

	// 무기를 장착하는 메서드
	public void equpidWeapon(Weapon weapon) {
		this.weapon = weapon;
	}

	// 방어구를 장착하는 메서드
	public void equpidArmor(Armor armor) {
		this.armor = armor;
	}

	// 실제 데미지를 적용하는 메서드
	private void applyDamage(int damage) {
		this.currentHp -= damage; // 현재 체력에서 데미지 차감
		this.currentHp = currentHp < 0 ? 0 : currentHp; // 현재 체력이 0보다 작으면 0으로 설정
	}

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
