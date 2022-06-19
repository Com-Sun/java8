# 인터페이스의 변화

## 인터페이스 기본 메서드와 스태틱 메소드

하나의 인터페이스가 있다.

```
public interface Foo {

    void printName();
}

```

이를 구현한 클래스가 여럿 있다. 그런데 만약, 새로운 기능을 이 인터페이스에 추가한다고 하자.

```
public interface Foo {

    void printName();

    void printNameUpperCase();
}

```

이렇게 되면 인터페이스를 구현한 클래스에 모두 에러가 날 것이다.

해당 인터페이스를 구현한 클래스를 깨트리지 않기 위해 default 메서드를 정의할 수 있다.

즉, 인터페이스에 메서드 선언이 아니라 구현체를 제공하는 것이다.

- default method는 구현체가 모르게 추가된 기능이다.
- 그러므로 런타임에러가 날 가능성이 있다.
- 반드시 문서화 할  - @implSpec 자바독 태그 사


Object에 있는 것들은 재정의할 수 없다.

유틸리티나 헬퍼 메서드를 제공하고 싶은 경우

- Static 메서드 사용
