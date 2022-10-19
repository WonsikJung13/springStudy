package lecture.p11core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Example1 {
	private Example2 ex2;
	
	// 생성자 DI(dependency injection)
	@Autowired
	public Example1() {

	}
	public Example1(Example2 ex2) {
		this.ex2 = ex2;
	}

	// 코드 작성
	
	public Example2 getEx2() {
		return ex2;
	}
}
