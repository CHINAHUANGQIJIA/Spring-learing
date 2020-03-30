package ioc.dao;


import com.soft1851.spring.orm.dao.PostDao;
import com.soft1851.spring.orm.entity.Post;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Arrays;
import java.util.List;

//指定单元测试环境
@RunWith(SpringJUnit4ClassRunner.class)
//指定配置文件路径
@ContextConfiguration(locations={"/beans.xml"})
public class PostDaoForumTest {
    @Autowired
    private PostDao postDao;

    @Test
    public void insert() {
        Post post=Post.builder().forumId(1).content("2020事件").title("2020").thumbnail("jhfdsoih").createTime(317).build();
        int count=postDao.insert(post);
        System.out.println(count);
    }

    @Test
    public void batchInsert() {
        Post[] posts =
                {Post.builder().forumId(3).title("测试论坛1").content("新闻性").thumbnail("图3").createTime(20210).build(),
                        Post.builder().forumId(3).title("测试论坛2").content("大撒大撒").thumbnail("图1").createTime(20210).build(),
                        Post.builder().forumId(3).title("测试论坛3").content("份时间都i附件").thumbnail("图2").createTime(20210).build(),
                } ;
        List<Post> postList = Arrays.asList(posts);
        int[] rows = postDao.batchInsert(postList);

    }

    @Test
    public void delete() {
        int n=postDao.delete(5);

    }

    @Test
    public void batchDelete() {
        int[] pide = {6,7,8};
        int[] shuxu = postDao.batchDelete(pide);

    }

    @Test
    public void get() {
        Post post=postDao.getBypostId(9);
        System.out.println(post);

    }

    @Test
    public void testGet() {
        List<Post> postList = postDao.getBykeywords("2020");
        System.out.println(postList);
    }

    @Test
    public void countPostByForumId() {
        int shu = postDao.countPostByForumId(3);
        System.out.println(shu);
    }
}