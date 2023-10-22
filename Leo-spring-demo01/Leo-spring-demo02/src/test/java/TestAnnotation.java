import lombok.extern.slf4j.Slf4j;
import org.javatop.basic.annotation.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * @author : Leo
 * @version 1.0
 * @date 2023-10-20 22:49
 * @description : 用于测试 @Component注解
 */
@Slf4j
public class TestAnnotation {

    /**
     * 用于测试 @Component注解
     */
    @Test
    public void test1() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

        User user1 = ctx.getBean("u", User.class);
        User user2 = ctx.getBean("u", User.class);


        log.info("{}", user1);
        log.info("{}", user2);
    }
}
