package spring.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.aop.entity.Exam;
import spring.aop.entity.NewlecExam;

public class Program {

	public static void main(String[] args) {
		
		ApplicationContext context =
				new ClassPathXmlApplicationContext("spring/aop/setting.xml");
//				new AnnotationConfigApplicationContext(NewlecDIConfig.class);
		
		Exam proxy = (Exam) context.getBean("proxy");

		System.out.printf("total is %d\n", proxy.total());
		System.out.printf("avg is %f\n", proxy.avg());
		

		/*
		Exam exam = new NewlecExam( 1,1,1,1);
		Exam proxy = (Exam) Proxy.newProxyInstance(NewlecExam.class.getClassLoader(), 
				new Class[] {Exam.class},
				new InvocationHandler() {
					
					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

						long start = System.currentTimeMillis();
						
						Object result = method.invoke(exam, args);
						
						long end = System.currentTimeMillis();
						String message = (end - start) + "ms 시간이 걸렸습니다";
						
						System.out.println(message);
						
						return result;
					}
				});
		*/
		
	}

}
