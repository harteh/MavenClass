# 생성자 주입  
- [Computer](https://github.com/harteh/MavenClass/blob/73fcb8c81258db5f1402acb36b52126381991dcd/Test0801Spring/src/main/java/co/bm/beans/Computer.java) 인터페이스를 만들고 이를 상속받는 [AComputer](https://github.com/harteh/MavenClass/blob/73fcb8c81258db5f1402acb36b52126381991dcd/Test0801Spring/src/main/java/co/bm/beans/AComputer.java)를 만든다
- [MainClass](https://github.com/harteh/MavenClass/blob/73fcb8c81258db5f1402acb36b52126381991dcd/Test0801Spring/src/main/java/co/bm/main/MainClass.java) 에서 DI 후의 결과를 출력한다
  
## xml을 통한 DI 
+ [Hi](https://github.com/harteh/MavenClass/blob/73fcb8c81258db5f1402acb36b52126381991dcd/Test0801Spring/src/main/java/co/bm/beans/Hi.java) 클래스 
	- String 값 하나와 AComputer의 객체 값 하나를 선언
	- 생성자와 set메소드를 만든다  
  
+ [Beans.xml](https://github.com/harteh/MavenClass/blob/73fcb8c81258db5f1402acb36b52126381991dcd/Test0801Spring/src/main/java/co/bm/config/Beans.xml)
	- 임의의 값으로 setter를 통한 주입
	- 생성자를 통한 주입을 각각 구현한다  

 
## 어노테이션을 통한 DI
+ [Hello](https://github.com/harteh/MavenClass/blob/73fcb8c81258db5f1402acb36b52126381991dcd/Test0801Spring/src/main/java/co/bm/beans/Hello.java) 클래스
	- String 값 하나와 AComputer의 객체 값 하나를 선언
	- @Autowired, [@Qualifier](https://github.com/harteh/MavenClass/blob/73fcb8c81258db5f1402acb36b52126381991dcd/Test0801Spring/src/main/java/co/bm/beans/Hello.java#L11)를 통해 DI  
	
+ [BBean.java](https://github.com/harteh/MavenClass/blob/73fcb8c81258db5f1402acb36b52126381991dcd/Test0801Spring/src/main/java/co/bm/config/BBean.java)  
	- @Qualifier를 통해 주입할 때 이름은 “oo2”라고 정의한다