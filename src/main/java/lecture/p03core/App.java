package lecture.p03core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {

    public static void main(String[] args) {
        String configLocation = "file:src/main/java/lecture/p03core/context.xml";
        ApplicationContext context;
        context = new ClassPathXmlApplicationContext(configLocation);

        Servlet s = context.getBean(Servlet.class);

        System.out.println(s);

        System.out.println("프로그램 실행");
    }
}
