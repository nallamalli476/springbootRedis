package com.nt.cache.handling.adapter.persistence.api;

import java.util.List;
import org.springframework.stereotype.Component;
import com.nt.cache.handling.adapter.persistence.entity.UserEntity;
import com.nt.cache.handling.adapter.persistence.repository.UserReposistory;
import com.nt.cache.handling.core.port.repository.UserPersistencePort;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * @author Ravi kumar
 */
@Component
@RequiredArgsConstructor
@Slf4j
public class UserPersistenceAdapter implements UserPersistencePort {
	
	private final UserReposistory userReposistory;

	@Override
	public List<UserEntity> getUserDetails() {
		return userReposistory.findAll();
	}

	@Override
	public void deleteById(Long id) {
		userReposistory.deleteById(id);
	}

}
