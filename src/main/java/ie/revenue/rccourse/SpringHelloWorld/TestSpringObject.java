package ie.revenue.rccourse.SpringHelloWorld;

import org.springframework.stereotype.Component;

@Bean
public class TestSpringObject implements Something {
	
	protected String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public TestSpringObject(){
		
	}
	
	public TestSpringObject(String name){
		
		this.name = name;
	}
	
	public void doSomething(){
		System.out.println("doing something...");
	}
}
