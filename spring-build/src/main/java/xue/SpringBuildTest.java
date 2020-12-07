package xue;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


/**
 * 测试类
 *
 * @author ：HUANG ZHI XUE
 * @date ：Create in 2020-12-03
 */
public class SpringBuildTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(JavaConfig.class);
		System.out.println(ac.getBean(JavaConfig.class));
	}
}
