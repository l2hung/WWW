package iuh.fit.se.bai2.xml_based_configuration;

import iuh.fit.se.bai2.xml_based_configuration.model.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        System.out.println("== Setter Injection ==");
        Employee empSetter = (Employee) context.getBean("employeeSetter");
        empSetter.displayInfo();

        System.out.println("\n== Constructor Injection ==");
        Employee empConstructor = (Employee) context.getBean("employeeConstructor");
        empConstructor.displayInfo();
    }
}
