package ioc.dao;


import com.soft1851.spring.orm.config.JdbcConfig;
import com.soft1851.spring.orm.dao.ForumDao;
import com.soft1851.spring.orm.entity.Forum;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Arrays;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {JdbcConfig.class})
public class ForumDaoForumTest {
    @Autowired
    private ForumDao forumDao;
    @Test
    public void insert() {
        Forum forum=Forum.builder().forumName("黄启佳111").build();
        int count=forumDao.insert(forum);
        System.out.println(count);

    }
    /**批量新增Forum*/
    @Test
    public void batchInsert( ) {
        Forum[] forums = {Forum.builder().forumName("测试1").build(),
                Forum.builder().forumName("测试2").build(),
                Forum.builder().forumName("测试3").build()
        };
        List<Forum> forumList = Arrays.asList(forums);
        int[] rows = forumDao.batchInsert(forumList);

    }

    /**根据id删除Forum*/
        @Test
        public void delete() {
            int n = forumDao.delete(13);
        }

    /**修改Forum*/
        @Test
        public void update() {

            Forum forum = forumDao.get(14);

            forum.setForumName( "黄启佳" );
            int n = forumDao.update(forum);
        }

    /**根据id查询Forum*/
        @Test
        public void get(){

        Forum forum = forumDao.get(14);
        System.out.println(forum);
    }

    /**查询所有论坛信息*/
    @Test
    public void selectAll() {
        List<Forum> forums = forumDao.selectAll( );
        System.out.println(forums);
    }
}
