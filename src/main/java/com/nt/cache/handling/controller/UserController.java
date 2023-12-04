package com.nt.cache.handling.controller;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.cache.handling.adapter.persistence.entity.UserEntity;
import com.nt.cache.handling.serviceImpl.UserServiceImpl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping(value = "/v1/users", consumes = { MediaType.APPLICATION_JSON_VALUE }, produces = {
		MediaType.APPLICATION_JSON_VALUE })
@RequiredArgsConstructor
@Slf4j
public class UserController {

	private final UserServiceImpl userService;

	@GetMapping("/getUsers")
	public ResponseEntity<List<UserEntity>> getUserDetails() {
		return ResponseEntity.ok(userService.getUserDetails());
	}

}
