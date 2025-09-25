package iuh.fit.se.bai2.annotation_based_configuration;


import iuh.fit.se.bai2.annotation_based_configuration.model.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Employee emp = context.getBean(Employee.class);
        emp.displayInfo();
    }
}
