package alibek.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import alibek.spring.impls.computer.CompProdesk;

public class Start {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("all_context.xml");

		CompProdesk prodesk = (CompProdesk) context.getBean("prodesk1");
		CompProdesk prodesk2 = (CompProdesk) context.getBean("prodesk2");

		prodesk.work();
		prodesk2.work();
	}
}
