# Optional API

### Optional 만들기

- Optional.of(): 반드시 값이 있는 객체 생성. null인경우 NPE
- Optional.ofNullable(): value가 null인 경우 비어있는 Optional 반환
- Optional.empty(): 비어있는 옵셔널 객체 생성.

### Optional에 값이 있는지 없는지 확인하기

- isPresent()
- isEmpty

### Optional에 있는 값 가져오기

- get()
- 비어있는 Optional에서 값을 꺼내면 RuntimeException 발생 
- 즉, 이런 경우를 대비해 밑에 ifPresnet()를 사용하라.

### Optional에 값이 있는 경우에 그 값을 가지고 ~~를 하라.

- ifPresent(Consumer)
- optionalSpring.ifPresent(oc -> System.out.println(oc.getTitle()));

### Optional에 값이 있으면 가져오고 없는 경우에 ~~를 리턴하라.

- orElse(T)
- 그런데, 해당 Optional이 있는 경우에도 무조건 실행됨.
- 이게 찝찝하면 orElseGet()을 사용함.
- orElse는 상수를 가져올 떄 적합하다.

### Optional에 값이 있으면 가져오고 없는 경우에 ~~를 하라.

- orElseGet(Supplier)
- 동적으로 무언가를 생성할 때 적합하다. 

### Optional에 값이 있으면 가져오 없는 경우 에러를 던져라.

- orElseThrow()
- Supplier 이니까 lambda expression을 사용하라.
- OnlineClass onlineClass = optionalSpring.orElseThrow(IllegalArgumentException::new);

### Optional에 들어있는 값 걸러내기

- Optional filter(Predicate)
- Optional<OnlineClass> onlineClass2 = optionalSpring.filter(oc -> !oc.isClosed());

### Optional에 들어있는 값 변환하기 

- Optional map(Function)
- Optional flatMap(Function) - Optional 안에 인스턴스가 Optional인 경우 사용

### 만약 Optional을 map으로 get하면?

Optional 안에 Optional이 들어가서 매우 귀찮아짐.
이 경우 flatMap을 사용하자!

### Stream의 flatMap과 Optional의 flatMap은 다르다!

- Stream에서 제공하는 map은 1:1 맵핑이다. 
- 인풋은 하나지만 아웃풋이 여러개일 떄 flatMap 을 사용한다.


### 정리

get() 보다는 orElse, orElseGet, orElseThrow , filter를 사용하자.