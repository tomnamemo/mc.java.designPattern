package com.mc.designpattern.aBuilder;

// 빌더 패턴을 실행하는 클래스
public class Run {
	
	public static void main(String[] args) {
		// 빌더를 사용하여 Book 객체 생성
		Book book = new Book.Builder()
					.title("해리포터") // 제목 설정
					.author("조앤롤링") // 저자 설정
					.price(1000) // 가격 설정
					.page(1000) // 페이지 수 설정
					.build(); // Book 객체 생성
		
		// 생성된 Book 객체 출력
		System.out.println(book); // toString 메서드 호출
		System.out.println(book.getTitle()); // 제목 출력
	}
}
