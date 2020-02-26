# Java-Refactoring

- ~~0장 리팩토링이란~~ (02/23)

## 소규모 리팩토링

- ~~1장 매직 넘버를 기호 상수로 치환~~ (02/23)
  - type code
  - enum
- ~~2장 제어 플래그 삭제~~ (02/24)
  - break, return
  - initialized, debug, error, done, interrupted, recurse
  - java.util.regex
- ~~3장 어서션 도입~~ (02/25)
  - assert *expr*: *option*;
- ~~4장 널 객체 도입~~ (02/26)
  - @override
  - factory method pattern
  - singleton pattern
    - `private static final Object singleton = new Object();`

## 중간규모 리팩토링

- 5장 메서드 추출
- 6장 클래스 추출
- 7장 분류코드를 클래스로 치환
- 8장 분류코드를 하위클래스로 치환
- 9장 분류코드를 상태/전략으로 치환
- 10장 분류코드를 예외로 치환

## 대규모 리팩토링

- 11장 생성자를 팩토리 메서드로 치환
- 12장 관측 데이터 복제
- 13장 상속을 위임으로 치환
- 14장 대리자 은폐
- 15장 상속구조 정리

