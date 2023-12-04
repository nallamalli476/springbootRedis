package com.nt.cache.handling.service;

import java.util.List;

import com.nt.cache.handling.adapter.persistence.entity.UserEntity;

public interface UserServiceUseCase {

      List<UserEntity> getUserDetails();
}
