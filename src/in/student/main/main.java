package in.student.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.student.college_details;

public class main {

	public static void main(String[] args) 
	{
		String ref="in/student/resource/web.xml";
		ApplicationContext context=new ClassPathXmlApplicationContext(ref);
		college_details cd=(college_details)context.getBean("cdd");
		cd.display();
	}
}
