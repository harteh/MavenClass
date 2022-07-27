package co.bm.mj.main;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.bm.mj.beans.Data;
import co.bm.mj.beans.Test;

public class MClass {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext ctx =
				new ClassPathXmlApplicationContext("co/bm/mj/config/beans.xml");
		
		Test t1 = ctx.getBean("t1", Test.class);
		
		System.out.println("========== List<String> l1 ===========");
		for(int i=0; i<t1.getL1().size(); i++) {
			System.out.println(t1.getL1().get(i));
		}
		
		System.out.println("========= List<Data> l2 ============");
		List<Data> l2 = t1.getL2();
		for(Data d : l2) {
			System.out.println(d);
		}
		
		System.out.println("========= Set<String> s1 ============");
		//중복이 허용되지 않기때문에 중복은 삭제되어 출력됨
		Set<String> s1 = t1.getS1();
		for(String str : s1) {
			System.out.println(str);
		}
		System.out.println("========= Set<Data> s2 ============");
		Set<Data> s2 = t1.getS2();
		for(Data str : s2) {
			System.out.println(str);
		}
		
		System.out.println("====== Map<String, Object> m1 =========");
		// key= a1 ~ a4
		Map<String, Object> m1 = t1.getM1();
		String a1 = (String) m1.get("a1");
		Data a2 = (Data) m1.get("a2");
		Data a3 = (Data) m1.get("a3");
		List<String> a4 = (List<String>) m1.get("a4");

		System.out.println(a1 +" / "+a2+" / "+a3+" / "+a4);
		
	}

}
