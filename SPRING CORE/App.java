package spring_demo.springid;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hibernate.spring_beans.Car;



public class App {
    public static void main(String[] args) {
        //System.out.println("Hello World!");
        ApplicationContext context=new ClassPathXmlApplicationContext();
    	Car bean= context.getBean(Car.class);
    	System.out.println("car1");
    }
}
