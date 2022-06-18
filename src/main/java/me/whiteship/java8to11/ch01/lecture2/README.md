# JAVA 8

## 함수형 인터페이스와 람다

### 함수형 인터페이스와 람다 표현식 소개

추상메서드가 하나: 함수형 인터페이스

2개 : x

- 익명 내부 클래스

### 자바에서 제공하는 함수형 인터페이스

- `java.lang.funcation` 패키지
- Function<T, R>
  - R apply(T t) : T를 받아서 R을 리턴한다. 우리는 apply라는 메서드만 구현하면 된다.

함수 조합하기
- compose() : 뒤의 함수를 적용 한 뒤 결과값을 다시 앞의 함수 적용
- andThen(): 앞의 함수를 적용한 뒤 뒤의 함수를 적용

BiFunction<T, U, R>
- 두개의 값(T,U)를 받아서 R타입을 리턴하는 함수 인터페이스
  - R apply(T t, U u)
  
Consumer<T>

- T 타입을 받아서 아무 값도 리턴하지 않는 함수 인터페이스   
  - void Accept(T t)

Supplier<T>

- T 타입의 값을 제공하는 함수 인터페이스
  - T get()
  - 즉, 받아올 값을 정의.
  - Supplier<Integer> get10 = () -> 10;  - 무조건 10을 리턴하는 함수

Predicate<T>

- T 타입을 받아서 boolean을 리턴하는 함수 인터페이스
  - boolean test(T t)
- 함수 조합용 메소드
  - And
  - Or
  - Negate


UnaryOperator<T>
  - Function<T,R>의 특수한 형태로, 입력값 하나를 받아서 동일한 타입을 리턴하는 함수 인터페이스
  - 위에서 Function<Integer, Integer> 로 구현했던 것을 UnaryOperator<Integer>로 바꿀 수 있다.


BinaryOperator<T> 

- BiFunction<T, U, R> 의 특수한 형태로, 동일한 타입의 입력값 두개를 받아 리턴하는 함수 인터페이스