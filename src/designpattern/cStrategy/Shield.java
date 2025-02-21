package designpattern.cStrategy;

// Weapon 인터페이스를 구현하는 Shield 클래스
public class Shield implements Weapon {

	private String name; // 방패의 이름
	private int atkWeight; // 공격 가중치

	// 생성자: 방패의 이름과 공격 가중치를 초기화
	public Shield(String name, int atkWeight) {
		super();
		this.name = name;
		this.atkWeight = atkWeight;
	}

	// 공격 가중치를 계산하는 메서드
	@Override
	public int calAttakWeight(int damage) {
		return (int) (damage * (0.9 + atkWeight)); // 기본 데미지에 공격 가중치 적용
	}

	// 공격 메서드: 방패를 휘두르는 동작
	@Override
	public void attack() {
		System.out.println(name + "를 묵직하게 휘두릅니다."); // 공격 메시지 출력
	}
}
