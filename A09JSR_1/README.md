# Annotation 
@PostConstruct  : 생성자 호출 이후에 호출됨(자동)  
@PreDestroy  :  객체 소멸되기 전에 호출(자동)  

## 기본 설정
+ byName 이용해서 이름이 같을 때 d1, d2에 자동주입 되도록 설정  
    - @Bean(autowire = Autowire.BY_NAME)   
+ @Autowired / @Qualifier("d2")
    - BBean 에서 d2를 찾아서 자동 주입  

+ @Resource
    - 이름을 기준으로 찾는다.이름이 없으면 타입으로 찾는다.  
    - @Autowired + @Qualifier와 같은 효과  
+ @Resource(name="d1")  /  private Data dd;
    - 'd1' 이름으로 등록된 빈을 찾아서 빈 객체의 주소값을 가져와 Data dd에 주입한다   