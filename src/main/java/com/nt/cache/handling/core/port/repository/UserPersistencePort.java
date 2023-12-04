package com.nt.cache.handling.core.port.repository;

import java.util.List;
import com.nt.cache.handling.adapter.persistence.entity.UserEntity;

public interface UserPersistencePort {

	List<UserEntity> getUserDetails();

	void deleteById(Long id);

}
