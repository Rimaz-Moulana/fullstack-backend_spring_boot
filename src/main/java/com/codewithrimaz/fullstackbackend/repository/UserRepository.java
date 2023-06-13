package com.codewithrimaz.fullstackbackend.repository;

import com.codewithrimaz.fullstackbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
