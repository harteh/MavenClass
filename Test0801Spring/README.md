# 생성자 주입  
- Computer 인터페이스를 만들고 이를 상속받는 AComputer를 만든다
- MainClass 에서 DI 후의 결과를 출력한다
  
## xml을 통한 DI 
+ Hi 클래스 
	- String 값 하나와 AComputer의 객체 값 하나를 선언
	- 생성자와 set메소드를 만든다  
  
+ Beans.xml
	- 임의의 값으로 setter를 통한 주입
	- 생성자를 통한 주입을 각각 구현한다  

 
## 어노테이션을 통한 DI
+ Hello 클래스
	- String 값 하나와 AComputer의 객체 값 하나를 선언
	- @Autowired, @Qualifier를 통해 DI  
	
+ BBean.java
	- @Qualifier를 통해 주입할 때 이름은 “oo2”라고 정의한다