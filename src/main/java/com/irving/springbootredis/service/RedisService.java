package com.irving.springbootredis.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

/**
 * Development IDE: IntelliJ IDEA
 * Author: irving
 * Project Name: springboot-redis
 * Date: 2018-12-14
 */
@Service
public class RedisService {
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    public void pushPairs(String key, String value) {
        stringRedisTemplate.opsForValue().set(key, value);
    }

    public String popValue(String key) {
        return stringRedisTemplate.opsForValue().get(key);
    }
}
