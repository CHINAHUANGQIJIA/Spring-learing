/*
package com.soft1851.spring.web.dao.impl;


import com.soft1851.spring.web.dao.ForumDAO;
import com.soft1851.spring.web.entity.Forum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

*/
/**
 * @author CRQ
 *//*

@Component
public class ForumDAOImpl extends ForumDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public int insert(Forum forum) {
        String sql = "INSERT INTO t_forum VALUES (NULL,?) ";
        Object[] args = {forum.getForumName()};
        return jdbcTemplate.update(sql,args);
    }

    @Override
    public int[] batchInsert(List<Forum> forums) {
        final List<Forum> forumList = forums;
        String sql = "INSERT INTO t_forum VALUES (NULL,?) ";
        return jdbcTemplate.batchUpdate(sql, new BatchPreparedStatementSetter() {
            @Override
            public void setValues(PreparedStatement preparedStatement, int i) throws SQLException {
                preparedStatement.setString(1,forumList.get(i).getForumName());
            }

            @Override
            public int getBatchSize() {
                return forumList.size();
            }
        });
    }

    @Override
    public int delete(int forumId) {
        String sql = "DELETE FROM t_forum WHERE forum_id = ? ";
        Object[] args = {forumId};

        return jdbcTemplate.update(sql,args);
    }

    @Override
    public int update(Forum forum) {
        String sql = "UPDATE t_forum SET forum_name = ? WHERE forum_id = ? ";
        Object[] args = {forum.getForumName(), forum.getForumId()};
        return jdbcTemplate.update(sql,args);
    }

    @Override
    public Forum get(int forumId) {
        String sql = "SELECT * FROM t_forum WHERE forum_id = ? ";
        Object[] args = {forumId};
        Forum forum=null;
        try{
             forum = jdbcTemplate.queryForObject(sql, args, new BeanPropertyRowMapper<>(Forum.class));
        }catch (Exception e){
            e.printStackTrace();
        }
        return forum;
    }

    @Override
    public List<Forum> selectAll() {
        String  sql = "SELECT * FROM t_forum ";
        System.out.println("fsejofosjedefojsd"+jdbcTemplate);
        return jdbcTemplate.query(sql,new BeanPropertyRowMapper<>(Forum.class));

    }
}
*/
