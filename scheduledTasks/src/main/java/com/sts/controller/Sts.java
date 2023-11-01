package com.sts.controller;

import com.alibaba.druid.support.logging.Log;
import com.alibaba.druid.support.logging.LogFactory;
import com.sts.dto.User;
import com.sts.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Component
@Configuration
@EnableScheduling
public class Sts {

    private static Log logger = LogFactory.getLog(Sts.class);

    @Resource
    UserMapper userMapper;

    /**
     * 2秒一次获取信息
     *
     */
    @Async
    @Scheduled(cron = "*/5 * * * * ?")
    @Transactional
    public void doMsgPro() {
        List<User> users =  userMapper.queryLs();
        logger.info(users.toString());
        logger.info("111111");
    }
}
