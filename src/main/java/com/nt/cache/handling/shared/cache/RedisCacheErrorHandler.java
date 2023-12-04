package com.nt.cache.handling.shared.cache;

import org.springframework.cache.Cache;
import org.springframework.cache.interceptor.CacheErrorHandler;
import io.lettuce.core.RedisCommandTimeoutException;
import io.lettuce.core.RedisConnectionException;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RedisCacheErrorHandler implements CacheErrorHandler {

	@Override
	public void handleCacheGetError(RuntimeException exception, Cache cache, Object key) {
		handleRuntimeException(exception);
		log.error("Unable to get from cache " + cache.getName() + " : " + exception.getMessage());

	}

	@Override
	public void handleCachePutError(RuntimeException exception, Cache cache, Object key, Object value) {
		handleRuntimeException(exception);
		log.error("Unable to put into cache " + cache.getName() + " : " + exception.getMessage());
	}

	@Override
	public void handleCacheEvictError(RuntimeException exception, Cache cache, Object key) {
		handleRuntimeException(exception);
		log.error("Unable to evict from cache " + cache.getName() + " : " + exception.getMessage());
	}

	@Override
	public void handleCacheClearError(RuntimeException exception, Cache cache) {
		handleRuntimeException(exception);
		log.error("Unable to clean cache " + cache.getName() + " : " + exception.getMessage());
	}

	private void handleRuntimeException(RuntimeException exception) {
		if (exception instanceof RedisCommandTimeoutException || exception instanceof RedisConnectionException) {
			return;
		}
	}

}
