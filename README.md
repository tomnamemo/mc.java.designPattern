# mc.java.designPattern

## 프로젝트 개요

빌더 패턴, 템플릿 메서드 패턴, 스트래티지 패턴, 프록시 패턴의 구조 이해

### Builder Pattern

빌더 패턴은 복잡한 객체 생성 과정을 단순화하고, 가독성을 높이는 생성적 디자인 패턴이다. <br/>
다른 개체인 빌더를 사용하여 각 초기화 파라미터를 단계별로 수신한 다음 생성된 개체를 한 번에 반환

![대체 텍스트](/src/images/builder.jpg)

##### 장점

-   **가독성**: 메서드 체이닝을 통해 객체 생성 과정을 명확히 표현.

-   **불변 객체 생성**: setter 메서드 없이 객체의 불변성 보장.

-   **유연성**: 선택적으로 속성을 설정 가능.

##### 사용 예시

-   `Book` 클래스: 프라이빗 생성자를 통해 `Builder` 클래스를 이용해 생성됩니다.
-   `Builder` 클래스: `Book` 객체를 생성하는 메서드를 제공합니다.

#

### Template Method pattern

템플릿 메소드 패턴은 알고리즘 구조를 정의, 일부 단계를 하위클래스에서 구현하도록 하는 행동 디자인 패턴

![대체 텍스트](/src/images/templetemethod.jpg)

#### 장점

-   **코드 재사용**: 알고리즘의 공통 부분을 상위 클래스에 두어 코드 중복 감소.
-   **유연성**: 서브클래스에서 알고리즘의 세부 구현 변경 가능.
-   **일관성**: 알고리즘 구조 통일로 일관된 동작 보장.

#

### Strategy Pattern

객체의 행위를 동적으로 바꾸고 싶은 경우 -> 행위를 직접 수정하지 않고 전략을 바꿔 행위를 유연하게 확장. 알고리즘을 캡슐화하여 클라이언트에서 동적으로 선택할 수 있게 하는 행동 디자인 패턴이다.

![대체 텍스트](/src/images/strategy.jpg)

#### 장점

-   **유연성**: 알고리즘을 런타임에 선택하고 교체 가능.
-   **코드 분리**: 알고리즘을 별도의 클래스로 분리하여 가독성 향상.
-   **확장성**: 새로운 알고리즘 추가 시 기존 코드 수정 불필요.

#### 사용 예시

-   `Strategy` 인터페이스: 알고리즘의 기본 구조 정의.
-   `ConcreteStrategyA`, `ConcreteStrategyB`: 다양한 알고리즘 구현.
-   `Context` 클래스: 사용할 전략을 설정하고 실행.

#

### 프록시 패턴

프록시 패턴은 다른 객체에 대한 접근을 제어하는 구조적 디자인 패턴입니다. 클라이언트 요청을 실제 객체로 전달하기 전에 추가 작업을 수행할 수 있습니다.

![대체 텍스트](/src/images/proxy.jpg)

#### 장점

-   **접근 제어**: 보안 및 권한 관리 용이.
-   **지연 초기화**: 필요한 시점에 객체 생성으로 리소스 절약.
-   **로깅 및 통계**: 요청을 가로채 로깅 및 통계 수집 가능.

#### 사용 예시

-   `Developer` 인터페이스: 실제 개발자의 행위 정의.
-   `Man`, `Woman`, `Children`: 다양한 개발 방식 구현.
-   `DeveloperProxy`: 공통 작업을 수행하는 프록시 클래스.
-   `Run` 클래스: 프록시를 통해 개발자 객체를 사용하고 메서드를 호출.
