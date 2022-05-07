import com.demo.dao.AccountDao;
import com.demo.dao.CityDao;
import com.demo.entity.Account;
import com.demo.entity.City;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringJUnitConfig(locations = "classpath:spring/spring-service.xml")

public class MyTest4 {

    @Autowired
    private CityDao dao;
    @Test
    public void test01(){
        City byId = dao.findById(1);
        System.out.println(byId);
    }
    @Test
    public void test02(){
        City byId = dao.findById2(1);
        System.out.println(byId);
    }

    @Test
    public void test03(){
        List<City> citys = dao.findById3("W");
        System.out.println(citys);
    }
}
