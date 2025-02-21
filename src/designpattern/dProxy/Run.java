package designpattern.dProxy;

// 프록시 패턴을 실행하는 클래스
public class Run {
	
	public static void main(String[] args) {
		// 실제 개발자 객체를 프록시로 감싸기
		Developer man = new DeveloperProxy(new Man());
		Developer woman = new DeveloperProxy(new Woman());
		Developer children = new DeveloperProxy(new Children());
		
		// 각 개발자의 개발 메서드 호출
		man.develop(); // 남성 개발자의 개발
		System.out.println("==================================");
		woman.develop(); // 여성 개발자의 개발
		System.out.println("==================================");
		children.develop(); // 어린이 개발자의 개발
		System.out.println("==================================");
	}
}
