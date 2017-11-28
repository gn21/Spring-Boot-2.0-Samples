package com.bee.sample.ch14.cfg;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.autoconfigure.cache.CacheManagerCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.RedisCacheManager;
/**
 * 配置缓存
 * @author xiandafu
 *
 */
//@Configuration
public class RedisCacheManagerCustomizer {
	@Bean
	public CacheManagerCustomizer<RedisCacheManager> cacheManagerCustomizer() {
	    return new CacheManagerCustomizer<RedisCacheManager>() {
	        @Override
	        public void customize(RedisCacheManager cacheManager) {
		        	Map<String, Long> expires = new HashMap<String, Long>();
		        	//设置menu缓存一分钟过期
		        	expires.put("menu", 60l);
	        }
	    };
	}
}
