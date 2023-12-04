package com.nt.cache.handling.serviceImpl;

import java.util.List;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import com.nt.cache.handling.adapter.persistence.entity.UserEntity;
import com.nt.cache.handling.core.port.repository.UserPersistencePort;
import com.nt.cache.handling.service.UserServiceUseCase;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserServiceUseCase{
	
	private final UserPersistencePort userPersistencePort;

    @Cacheable(value = "userinfo")
	@Override
	public List<UserEntity> getUserDetails() {
		
		return userPersistencePort.getUserDetails();
	}

}
