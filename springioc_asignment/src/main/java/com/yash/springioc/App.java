package com.yash.springioc;
/**
 * @author ankesh.patil
 */
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yash.springioc.ioc_asignment.ConstructorMessage;
import com.yash.springioc.ioc_asignment.Employee;
import com.yash.springioc.ioc_asignment.PrintMessage;
import com.yash.springioc.ioc_asignment.SetterMessage;

public class App {
	public static void main(String[] args) {
		ApplicationContext c = new ClassPathXmlApplicationContext("application-context.xml");
		//spring asignment 1
		Employee e = (Employee) c.getBean("employee");
		System.out.println("Assignment 1:"+e.getEmpId() + " " + e.getEmpName() + " " + e.getEmpRole());
	
		//spring asignment 2
		PrintMessage pm = (PrintMessage) c.getBean("p");
		System.out.println("Assignment 2:"+pm.print(pm.getMessage()));
		  
		//spring asignment 4
		ConstructorMessage cm=(ConstructorMessage) c.getBean("asign4");
		System.out.println("Assignment 4:"+cm);
		
		//spring asignment 5
		SetterMessage sm=(SetterMessage) c.getBean("asign5");
		System.out.println("Assignment 5:"+sm.getMessage());
		 

	}
}
