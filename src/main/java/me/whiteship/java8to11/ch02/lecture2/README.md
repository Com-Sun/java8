# JAVA 8

## 자바 8 API의 기본 메소드와 스태틱 메소

자바 8 에서 추가한 기본메서드로 인한 API 변화

Iterable의 기본 메소드

- foreach()
- spliterator() - iterator와 비슷한데, 쪼갤 수 있음.

Collection의 기본 메소드

Comparator의 기본 메소드 및 스태틱 메소드

- reversed()
- thenComparing()
- static reverseOrder()/ naturalOrder()
- static nullsFirst()/ nullsLast()
- static comparing()

spliterator.tryAdvance - 있으면 true, 없으면 false


자바 8 이전에서는 추상 클래스에서 구현을 다 했었음. 예를 들어 WebMvcConfigurerAdapter

그런데 이제는 그럴 필요가 전혀 없음.
인터페이스에서 default 메소드를 제공하기 때문. 

즉, default method를 사용해서 api를 좀 더 간결하게 제공할 수 있다. 
