# Component 
 - 개발자가 직접 정의한 객체 클래스(인터페이스) 자체를 빈등록할 때   
 - 타입을 통한 빈등록(타입 같으면 주입)  
  
## xml 
(beans.xml)  
+ beans.xml 설정  
    - ' context:component-scan base-package="패키지" / '   
    - 빈으로 등록 될 준비를 마친 클래스들을 스캔하여, 빈으로 등록해주는 것이다.

+ @Component("b4")  /  public class Test4 {}
    - Test4 타입의 객체가 생성되고 'b4' 이름으로 IoC 컨테이너에 빈이 등록된다
    - 같은 타입으로 여러개를 줄때는 xml 파일에 <bean class="co.bm.mj.beans2.Test4" id="a4" />  
  
## 어노테이션 
(BBean.java)
+ @Configuration 명시하고, @Bean으로 등록   
+ @Component 를 통해서 생성, 등록
    - @ComponentScan(basePackages = "패키지경로")  
    - 스캔해서 빈을 등록해준다
+ 같은 타입 여러개 줄때
    - 	@Bean	public Test4 tt3() {...}  