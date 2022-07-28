package co.bm.mj.beans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class Test3 {
	
	public Test3() {
		System.out.println("test3");
	}

}
