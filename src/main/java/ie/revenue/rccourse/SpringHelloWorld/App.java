package ie.revenue.rccourse.SpringHelloWorld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
	
	public Something something;
	
    public Something getSomething() {
		return something;
	}
    @Autowired
	public void setSomething(Something something) {
		this.something = something;
	}
    
	public static void main( String[] args )
    {	
    	ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml"); 
    	
    	TestSpringObject t = context.getBean(TestSpringObject.class);
    	
    	t.doSomething();
    	
    	
    	
    	//App app = new App();
    	
    	//app.getSomething().doSomething();
    	
    	//something.doSomething();
    
    	//TestSpringObject tso = new TestSpringObject();
    	
    	// get the tso object from Spring
    	
   // ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml"); // spring will read the xml file and when we need object will get it from spring
    
  /*  String[] names = context.getBeanNamesForType(Something.class);
    
    for(String name: names) {
    	System.out.println(name);
    }
    
    Something s = (Something)context.getBean(names[0]); // uses interface
    s.doSomething();
    
    TestSpringObject tso = (TestSpringObject) context.getBean("testSpringObject"); // this is the same as the above way only the above way uses interfaces
    
 
    tso.doSomething();
    
    System.out.println(tso.getName());
    } */
	} // end of main
} // end of app
