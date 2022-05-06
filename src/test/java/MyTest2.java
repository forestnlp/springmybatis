import com.demo.dao.BookDao;
import com.demo.dao.ImgMapper;
import com.demo.entity.Book;
import com.demo.entity.Img;
import com.demo.service.BookService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringJUnitConfig(locations = "classpath:spring/spring-service.xml")

public class MyTest2 {

    @Autowired
    private ImgMapper imgMapper;
    @Test
    public void test01(){
        Img img = imgMapper.selectByPrimaryKey(10000);
        System.out.println(img);
    }

}
