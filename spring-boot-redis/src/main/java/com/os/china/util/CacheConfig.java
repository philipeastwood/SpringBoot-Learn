package com.os.china.util;

import com.google.common.cache.CacheBuilder;
import org.springframework.cache.CacheManager;
import org.springframework.cache.guava.GuavaCache;
import org.springframework.cache.support.SimpleCacheManager;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

@Configuration
public class CacheConfig {
    public CacheManager cacheManager() {
        GuavaCache guavaCache = new GuavaCache("GuavaCacheAll", CacheBuilder.newBuilder()
                .recordStats()
                .expireAfterWrite(10000, TimeUnit.SECONDS)
                .build());

        List list = new ArrayList();
        list.add(guavaCache);
        SimpleCacheManager simpleCacheManager = new SimpleCacheManager();
        simpleCacheManager.setCaches(list);
        return simpleCacheManager;
    }
}
