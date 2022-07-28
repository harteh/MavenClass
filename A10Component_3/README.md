# Component 3  
- @Component 로 빈을 정의한다
- BBean.java 를 @Configuration 로 명시한다
- @ComponentScan(basePackages = "패키지경로")를 설정해서 클래스를 스캔하여
- @@Component가 붙은 클래스를 빈에 등록한다
  
## 기본 

+ @Autowired  
    - 생성한 빈을 주입  
+ @Autowired	@Qualifier("o2") 
    - 	o2를 찾아서 주입  
+ @Resource(name="o3")  
    - 	o3 이름으로 찾아 주입  
+ 같은 타입 주입  
    - 	@Bean	public Data3 a1() { return new Data3();	}  
    - 	@Resource(name="a1")  private Data3 d4;  