# Annotation 
@PostConstruct  : 생성자 호출 이후에 호출됨(자동)
@PreDestroy  :  객체 소멸되기 전에 호출(자동)

## 기본 설정
- byName 이용해서 이름이 같을 때 d1, d2에 자동주입 되도록 설정
-- @Bean(autowire = Autowire.BY_NAME)