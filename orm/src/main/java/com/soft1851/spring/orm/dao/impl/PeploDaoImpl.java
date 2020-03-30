package com.soft1851.spring.orm.dao.impl;

import com.soft1851.spring.orm.dao.PeploDao;
import com.soft1851.spring.orm.entity.Peplo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
@Repository
public class PeploDaoImpl implements PeploDao {

   @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int insert(Peplo peplo) {
        String sql="INSERT INTO t_peplo VALUES (NULL,?,?)";
        Object[] args={peplo.getName(),peplo.getAge()};
        return  jdbcTemplate.update(sql,args);
    }
}
