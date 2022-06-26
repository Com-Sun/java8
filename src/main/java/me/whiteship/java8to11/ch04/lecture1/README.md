# Optional

## Optional 소개

자바 프로그래밍에서 NullPointerException이 발생한다.
- why? null을 리턴하거나, null 체크를 안했으니까!

메소드에서 작업 중, 특별한 상황에서 값을 제대로 리턴할 수 없는 경우 선택할 수 있는 방법

- 예외를 던진다 (비싸다. why? 스택 트레이스를 찍으니까)
- null을 리턴한다. (코드를 사용하는 클라이언트 코드가 주의)
- 자바 8부터 Optional을 리턴한다. (클라이언트에 코드에게 명시적으로 빈 값일수도 있다는걸 알려주고, 빈 값인 경우에 대한 처리를 강제한다.)

### Optional

- 오직 값 한개가 들어있을 수도, 없을 수도 있는 컨테이너(Box).


### 주의

- 리턴값으로만 쓴다! (매개변수, 맵의 키, 인스턴스 필드로 쓰지말자)
- Optional을 리턴하는 메소드에서 null을 리턴하지 말자
- Primitive Type용 Optional은 따로 있다. -OptionalInt, Optional...
- Collection, Map, StreamArray, Optional은 Optional로 감싸지 말 것.