# JAVA 8

## 함수형 인터페이스와 람다 표현식 3 

### 변수 캡쳐

- 로컬 변수 캡쳐
  - 람다에서 Scope 밖에 있는 로컬 변수 참조
  - final 이거나 effective final인 경우에만 참조할 수 있다.

그런데 자바 8 부터 final을 생략할 수 있는 경우가 있음.

어떤 경우 ? 사실상 final 인 경우 - final 키워드는 없지만 변수를 변경하지 않는 경우 (effective final)

```
        // 로컬 클래스
        class LocalClass {
            void printBaseNum() {
                System.out.println(baseNumber);
            }
        }
        
        // 익명 클래스
        Consumer<Integer> integerConsumer = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(baseNumber);
            }
        };
        
        // 람다
        IntConsumer printInt = (i) -> System.out.println(i + baseNumber);
```

세 가지의 공통점 : 지역변수 참조

다른점 : 쉐도윙

Scope
- field : name
- local var: name

이 있을 때, field의 name은 local에 가려진다. 이것은 local class나 익명 클래스도 같이 적용된다. - 즉, 쉐도윙

하지만 람다는 쉐도윙 적용 안된다.


즉, 람다는 스콥이 같다. 쉐도윙이 일어나지 않는다. 나머지 두 개는 스콥이 다르다.

스콥이 같으니, 같은 변수명을 정의할 수없다. 즉, (baseNumber)가 불가능하다는 말임. 

effective final : 값이 바뀌지 않고, fianl이 없는 변수. 즉, 명시적 final.

