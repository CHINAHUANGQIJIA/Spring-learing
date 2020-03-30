package com.soft1851.spring.web.service.impl;




import com.soft1851.spring.web.dao.TopicDao;
import com.soft1851.spring.web.service.TopicService;
import com.soft1851.spring.web.util.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Transactional表示本类启动了事务，发生异常后回滚
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class TopicServiceImpl implements TopicService {
    @Autowired
    private TopicDao topicDao;
    @Override
    public List<Topic>queryAll() {
        return topicDao.selectAll();
    }

    @Override
    public void addTopic(Topic topic) {
        topicDao.insert(topic);
        try {
            int a = 1 / 0;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
    }

    @Override
    public int[] batchInsert(List<Topic> topics) {
        for (Topic t:topics) {
            System.out.println(t);
        }
        return topicDao.batchInsert(topics);
    }
}
