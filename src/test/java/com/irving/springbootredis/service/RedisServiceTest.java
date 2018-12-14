package com.irving.springbootredis.service;

import com.irving.springbootredis.entity.Person;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * Development IDE: IntelliJ IDEA
 * Author: irving
 * Project Name: springboot-redis
 * Date: 2018-12-14
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisServiceTest {

    private static final Logger logger = LoggerFactory.getLogger(RedisServiceTest.class);

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    @Autowired
    private RedisService redisService;

    @Test
    public void saveObject() {
        Person p = new Person("irving", 21);
        redisTemplate.opsForValue().set("p", p);
        Person result = (Person) redisTemplate.opsForValue().get("p");
        logger.info(result.toString());
        System.out.println(result.toString());
    }

    @Test
    public void saveAndRetrive() {
        String key = "张一芯";
        String value = "I love you";
        redisService.pushPairs(key, value);
        Assert.assertEquals(value, redisService.popValue(key));
    }
}