package com.yash.exception.task1;

/**
 * author:ankesh.patil
 */
/**
 * WAP to take student marks of different subject in class StudentResult which is associated with 
   Student class in following way:-
Class Student
{
 int rollno;
 String sname;
String saddress;
StudentResult srobj;
Setter and getter for all class variable.
}
Create your own Exception class with name ResultException. This exception will be thrown when 
user is failed in more than 1 subject. 
You also need to throw exception when user mistakenly input the negative marks. 
If user total score is less than 40% you need to through fail exception.

 * 
 */
import java.util.Scanner;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import com.yash.exception.custom.NumNegative;
import com.yash.exception.custom.ResultException;

public class TestMain1 {

	static Logger logger = Logger.getLogger(TestMain1.class.getName());

	public static void main(String[] args) throws NumNegative {
		BasicConfigurator.configure();

		Scanner scr = new Scanner(System.in);
		logger.info("Enter the student Name");
		String name = scr.next();
		logger.info("Enter the Roll number");
		int rollnum = scr.nextInt();
		logger.info("Enter the address");
		String address = scr.next();

		logger.info("Enter the Subject Marks");

		logger.info("Science :");
		double science = scr.nextDouble();
		if (science < 0) {
			throw new NumNegative("You enter negative marks");
		}
		logger.info("Maths :");
		double maths = scr.nextDouble();
		if (maths < 0) {
			throw new NumNegative("You enter negative marks");
		}
		logger.info("Physics :");
		double physics = scr.nextDouble();
		if (physics < 0) {
			throw new NumNegative("You enter negative marks");
		}
		logger.info("Chemistry :");
		double chemistry = scr.nextDouble();
		if (chemistry < 0) {
			throw new NumNegative("You enter negative marks");
		}
		logger.info("English :");
		double english = scr.nextDouble();
		if (english < 0) {
			throw new NumNegative("You enter negative marks");
		}

		StudentResult result = new StudentResult(science, maths, chemistry, english, physics);
		Student student = new Student(rollnum, name, address, result);

		try {
			logger.info("Total Percentage >> "+result.getPercentage());
		} catch (ResultException e) {
			System.out.println(e);
		}

	}

}
