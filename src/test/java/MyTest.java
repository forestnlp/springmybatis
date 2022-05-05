import com.demo.entity.Book;
import com.demo.service.BookService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringJUnitConfig(locations = "classpath:spring/spring-service.xml")
public class MyTest {

    @Autowired
    private BookService bookService;
    @Test
    public void test01(){
        List<Book> all = bookService.findAll();
        System.out.println(all);

    }

    @Test
    public void test02(){
        bookService.transferAccounts(1,2,10);
    }

}
