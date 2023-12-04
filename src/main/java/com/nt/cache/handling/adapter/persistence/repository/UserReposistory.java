package com.nt.cache.handling.adapter.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.nt.cache.handling.adapter.persistence.entity.UserEntity;

/**
 * @author Ravikumar
 */
public interface UserReposistory extends JpaRepository<UserEntity, Long> {

}
