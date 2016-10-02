package cn.com.meng.base.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by meng on 2016/10/2.
 */
public class BeanFactory {

    public static Object getBean(String beanName) {
        ApplicationContext ac = new FileSystemXmlApplicationContext("/base_domain/src/main/resources/applicationContext.xml");
        return ac.getBean(beanName);
    }
}
