package ioc.dao;


//指定单元测试环境


import com.soft1851.spring.orm.dao.PeploDao;
import com.soft1851.spring.orm.entity.Peplo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
//指定配置文件路径
@ContextConfiguration(locations={"/beans.xml"})
public class PeploDaoForumTest {
    @Autowired
    private PeploDao peploDao;

    @Test
    public void insert() {
        Peplo peplo =Peplo.builder().name("环球港").age("52").build();
        int count=peploDao.insert(peplo);
        System.out.println(count);
    }
}
