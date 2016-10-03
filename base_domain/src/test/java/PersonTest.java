import cn.com.meng.base.domain.Fruit;
import cn.com.meng.base.domain.Person;
import cn.com.meng.base.util.BeanFactory;
import org.junit.Test;

/**
 * Created by meng on 2016/10/2.
 */
public class PersonTest {

    @Test
    public void hungry(){
        Person person = new Person();
        Fruit fruit = (Fruit) BeanFactory.getBean("fruit");
        person.hungry(fruit);
    }
}
