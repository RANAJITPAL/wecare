package com.wecare.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wecare.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, String>{

}
