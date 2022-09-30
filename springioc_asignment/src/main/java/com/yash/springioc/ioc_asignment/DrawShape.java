package com.yash.springioc.ioc_asignment;
/**
 * @author ankesh.patil
 */
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawShape {

	public static void main(String[] args) {
		 ApplicationContext ac = new ClassPathXmlApplicationContext("application-context.xml");
	        Shape s = (Shape) ac.getBean("sh");
	          s.draw();
	          
	          Rectangle r = (Rectangle) ac.getBean("rt");
	          r.draw();
	          
	          Triangle t = (Triangle) ac.getBean("tr");
	          t.draw();
	          
	          Parallelogram p = (Parallelogram) ac.getBean("pr");
	          p.draw();
	          

}
}