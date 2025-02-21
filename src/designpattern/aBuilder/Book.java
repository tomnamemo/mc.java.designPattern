package designpattern.aBuilder;

// Book 클래스를 정의하는 클래스
public class Book {
	private String title; // 책 제목
	private String author; // 저자
	private int page; // 페이지 수
	private int price; // 가격
	
	// Builder 객체를 통해 Book 객체를 생성하는 프라이빗 생성자
	private Book(Builder builder) {
		this.title = builder.title;
		this.author = builder.author;
		this.page = builder.page;
		this.price = builder.price;
	}
	
	// 모든 속성을 파라미터로 받는 생성자
	public Book(String title, String author, int page, int price) {
		super();
		this.title = title;
		this.author = author;
		this.page = page;
		this.price = price;
	}
	
	// 각 속성에 대한 getter 메서드
	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public int getPage() {
		return page;
	}

	public int getPrice() {
		return price;
	}
	
	// 객체의 문자열 표현을 반환하는 toString 메서드
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", page=" + page + ", price=" + price + "]";
	}

	// 빌더 패턴의 장점 설명
	// - 캡슐화를 통한 속성 접근 권한 관리
	// - Immutable 객체 생성 가능 (setter를 만들지 않음)
	// - Immutable: 객체 생성 이후 속성값이 변경 불가능
	// - Mutable: 객체 생성 이후 속성값이 변경 가능
	
	// [빌더 클래스]
	public static class Builder {
		private String title; // 빌더 속성: 제목
		private String author; // 빌더 속성: 저자
		private int page; // 빌더 속성: 페이지 수
		private int price; // 빌더 속성: 가격
		
		// 각 속성을 설정하는 메서드 (체이닝 가능)
		public Builder title(String title) {
			this.title = title;
			return this;
		}
		public Builder author(String author) {
			this.author = author;
			return this;
		}
		public Builder page(int page) {
			this.page = page;
			return this;
		}
		public Builder price(int price) {
			this.price = price;
			return this;
		}
		
		// 최종적으로 Book 객체를 생성하는 메서드
		public Book build() {
			return new Book(this);
		}
	}
}
