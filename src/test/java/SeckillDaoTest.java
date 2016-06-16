import org.apache.ibatis.javassist.ClassPath;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.seckill.dao.SeckillDao;
import org.seckill.entity.Seckill;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * Created by Wutl on 2016/6/12.
 * 配置Spring和junit整合
 */
@RunWith(SpringJUnit4ClassRunner.class)//启动junit的时候加载Spring容器
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class SeckillDaoTest {

    @Resource
    private SeckillDao seckillDao;
    @Test
    public void reduceNumberTest (){
        Seckill s = seckillDao.queryById(1000);
        System.out.println(s);
    }

    @Test
    public void queryByIdTest(){
    }

    @Test
    public void queryAllTest(){

    }
}
