# 싱글톤(Singleton) 패턴 
## 인스턴스를 오직 한개만 제공하는 클래스 
- 시스템 런타임, 환경 셋팅에 대한 정보등, 인스턴스가 여러개 일 때 문제가 발생할 수 있는 경우가 있다. 이럴경우 인스턴스를 오직 한개만 만들어 제공하는 클래스
## 싱글톤 패턴 구현 방법 
- 동기화 `syhronized`를 사용해 멀티쓰레드 환경에 안전하게 만드는 방법 
- 이른 초기화`eager initialization` 을 사용하는 방법 
  - 단점 
    - 사용하지 않는 객체를 미리 만들어 두므로 쓸모없는 메모리를 사용한다.
- `double checked locking`으로 동기화 블럭 만들기 
  - `synchronized` 키워드를 메서드가 아닌 메서드내 에 추가하는 케이스
- static inner 클래스를 사용하는 방법 
- enum을 사용하는 방법
- 스프링 빈 스코프중에 하나로 싱글톤 스코프
- `java.lnag.Runtime`
- 빌더, 퍼사드, 추상팩토리등에 구현체에 쓰이기도 한다.

# 팩토리 메소드(Factory method) 패턴 
## 구체적으로 어떤 인스턴스를 만들지는 서브 클래스가 정한다.
- 다양한 구현체(Product)가 있고, 그 중에서 특정한 구현체를 만들 수 있는 다양한 팩토리(Creator)를 제공할 수 있다.
- OCP 원칙을 따른다. 
  - 확장에 열려 있고 변경에 닫혀 있는 객체 지향 원칙
  - 기존 코드를 변경하지 않고 새로운 기능을 추가(확장)할 수 있다.
- 장점
  - OCP 원칙을 따른다. 기존 코드를 건드리지 않고 새로운 인스턴스를 다른 방법으로 확장이 가능하다. 
  - product와 creator의 관계를 느슨하게 결합하기 때문에 OCP를 따를 수 있다.
- 단점
  - 역활을 나누다 보니 클래스의 갯수가 늘어난다.
- 자바8에 추가된 default 메서드에 대해 설명하세요.
  - 인터페이스에 기본 구현체를 만들 수 있는 기능 
- 자바9에 추가된 인터페이스의 private 메서드 기능 
  - 인터페이스에 private 메서드를 추가하여 사용할 수 있다.

- 단순한 팩토리 패턴 
  - 매개변수의 값에 따라 또는 메소드에 따라 각기 다른 인스턴스를 리턴하는 단순한 버전의 팩토리 패턴 
- java.lang.Calendar 또는 java.lang.NumberFormat
- 스프링의 BeanFactory
  - Object 타입이 Product를 만드는 BeanFactory라는 Creator!

# 추상 팩토리(Abstract factory) 패턴 
## 서로 관련 있는 여러 객체를 만들어 주는 인터페이스
- 구체적으로 어떤 클래스의 인스턴스를(concreate product)를 사용하는지 감출 수 있다.
- 추상클래스나 인터페이스로 정의하고 만드는건 팩토리랑 비슷하지만 클라이언트와 같이 봐야한다.
- Spring에서 FactoryBean

## 팩토리 메소드 vs 추상팩토리의 차이 
- 둘다 구체적인 객체 생성 과정을 추상화한 인터페이스 제공 
- 관점이 다르다.
  - 팩토리 메소드 패턴은 `팩토리를 구현하는 방법(inheritance)` 에 초점 
  - 추상 팩토리 패턴은 `팩토리를 사용하는 방법(composition)` 에 초점 
- 목적이 조금 다른다.
  - 팩토리 메소드 패턴은 구체적인 객체 생성 과정을 하위 또는 구체적인 클래스로 옮기는 것이 목적 
  - 추상 팩토리 패턴은 관련 있는 여러 객체를 구체적인 클래스에 의존하지 않고 만들 수 있게 해주는것이 목적

# 빌더(Builder) 패턴
- 동일한 프로세스를 거쳐 다양한 구성의 인스턴스를 만드는 방법
- 복잡한 객체를 만드는 프로세스를 독립적으로 분리할 수 있다.
- 장점 
  - 만들기 복잡한 객체를 순차적으로 만들 수 있다.
  - 복잡한 객체를 만드는 구체적인 과정을 숨길 수 있다.
  - 동일한 프로세스를 통해서 각기 다른 객체를 만들 수 있다.
  - 불완전한 객체를 사용하지 못하도록 방지할 수 있다.
- 단점 
  - 원하는 객체를 만들려면 빌더부터 만들어야한다.
  - 구조가 복잡해 진다.(트레이드 오프)
- `StringBuilder`, `StringBuffer(멀티쓰레드)`
- `Stream.Builder API`
- `lombok @Bulder`
- 스프링 
  - `UriComponentsBuilder`
  - `MockMvcWebClientBuiler`..

# 프로토타입(Prototype) 패턴 
## 기존 인스턴스를 복제하여 새로운 인스턴스를 만드는 방법
- 복제 기능을 갖추고 있는 기존 인스턴스를 프로토타입으로 사용해 새 인스턴스를 만들 수 있다.
- 인스턴스를 만드는데 시간이 오래 걸리는 경우 기존에 만들어진 객체를 복사해서 새로운 인스턴스를 만든다. 
  - 디비 접속 
  - 네트워크 연결 
- `Objects.clone` 은  `Shallow copy` `얕은 복사`
- 장점
  - 복잡한 객체를 만드는 과정을 숨길 수 있다.
  - 기존 객체를 복제하는 과정이 새 인스턴스를 만드는 것보다 비용(시간 또는 메모리) 적인 면에서 효율적일 수 도 있다.
  - 추사적인 타입을 리턴할 수 있다.
- 단점 
  - 복제한 객체를 만드는 과정 자체가 복잡할 수 있다.(특히, 순환 참조가 있는 경우)
  - 참조하는 객체를 직접 구현할 수 도 있다.

# 어댑터 패턴
## 기존 코드를 클라이언트가 사용하는 인터페이스의 구현체로 바꿔주는 패턴 
- 클라이언트가 사용하는 인터페이스를 따르지 않는 기존 코드를 재사용할 수 있게 해준다.
- 타켓인터페이스를 직접 구현해주는 구현 클래스(어댑터)를 따로 만든다.
- OCP 원칙에 가까운 패턴 (확장에는 열려 있고 변경에는 닫혀 있다.)
- SRP 입장에서 보면 클래스를 나누는게 객체지향 기법에 가깝지만 실용적인 선택을 할때 적용할 수 있다.
- 장점 
  - 기존 코드를 변경하지 않고 원하는 인터페이스 구현체를 만들어 재사용 가능.
  - 기존 코드가 하던 일과 특정 인터페이스 구현체로 변환하는 작업을 각기 다른 클래스로 분리하여 관리할 수 있다.
- 단점
  - 새 클래스가 생겨 복잡도가 증가할 수 있다. 경우에 따라서는 기존 코드가 해당 인터페이스를 구현하도록 수정하는 것이 좋은 선택이 될 수도 있다.

# 브릿지(Bridge) 패턴 
## 추상적인 것과 구체적인 것을 분리하여 연결하는 패턴
- 하나의 계층 구조일 때 보다 각기 나누었을 때 독립적인 게층 구조로 발전 시킬 수 있다.
- 장점 
  - 추상적인 코드를 구체적인 코드 변경 없이도 독립적으로 확장할 수 있다.
  - 추상적인 코드와 구체적인 코드를 분리할 수 있다.
  - OCP, SRP 를 지킬 수 있다.
- 단점 
  - 게층 구조가 늘어나 복잡도가 증가 할 수 있다.

# 컴포짓패턴 
## 그룹 전체와 개별 객체를 동일하게 처리 할 수 있는 패턴 
- 클라이언트 입장에서는 전체나 부분이나 모두 동일한 컴포넌트로 인식할 수 있는 계층 구조를 만든다.
- 장점 
  - 복잡한 트리 구조를 편리하게 사용할 수 있다.
  - 다형성과 재귀를 활용할 수 있다.
  - 클라이언트 코드를 변경하지 않고 새로운 엘리먼트 타입을 추가할 수 있다.
- 단점 
  - 트리를 만들어야하 하기 때문에(공통된 인터페이스를 정의해야 하기 때문에) 지나치게 일반화 해야하는 경우도 생길 수 있다.

# 데코레이터 패턴
## 기존 코드를 변경하지 않고 부가 기능을 추가하는 패턴
- 상속이 아닌 위임을 사용해서 보다 유연하게(런타임에) 부가 기능을 추가하는 것도 가능하다.

![데코레이터패턴 객체 관계도](https://user-images.githubusercontent.com/310264/201913673-b55dec71-e90e-4d90-892d-5663079e3f44.png)

- 장점 
  - 새로운 클래스를 만들지 않고 기존 기능을 조합할 수 있다.
  - 컴파일 타임이 아닌 런타임에 동적으로 기능을 변경할 수 있다.
  - SRP 
  - OCP 
  - DI 
- 단점 
  - 데코레이터를 조합하는 코드가 복잡할 수 있다.


# 퍼사트 패턴
## 복잡한 서브 시스템 의존성을 최소화하는 방법 
- 클라이언트가 사용해야 하는 복잡한 서브 시스템 의존성을 간단한 인터페이스로 추상화 할 수 있다.

- 장점 
  - 서브 시슽메에 대한 의존성을 한곳으로 몰아 둘 수 있다.
- 단점 
  - 퍼사드 클래스가 서브 시스템에 대한 모든 의존성을 가지게 된다.

<img src="https://user-images.githubusercontent.com/310264/202069451-1497e1ef-70db-4aae-bbdb-0a465917c70d.png" width="200" height="300" />