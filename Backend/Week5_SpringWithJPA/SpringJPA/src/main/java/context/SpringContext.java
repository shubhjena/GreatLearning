package context;

import dao.ProductDao;
import entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringContext {
//    used to instantiate, configure and assemble beans by using xml or annotation or java code
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:/");
    }
}
