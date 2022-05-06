import com.demo.dao.AccountDao;
import com.demo.dao.ImgMapper;
import com.demo.entity.Account;
import com.demo.entity.Img;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringJUnitConfig(locations = "classpath:spring/spring-service.xml")

public class MyTest3 {

    @Autowired
    private AccountDao accountDao;
    @Test
    public void test01(){
        int add = accountDao.insertOne(new Account(-1, "jie", 10000));
        System.out.println("inserted "+add+" records");
    }

    @Test
    public void test02(){
        Account account = new Account();
        account.setName("forest");
        account.setMoney(1000);
        int i = accountDao.insertOneWithPK(account);
        System.out.println("inserted "+i+" records");
        System.out.println("id="+account.getId());

    }
}
