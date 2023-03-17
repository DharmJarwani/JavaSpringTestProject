package com.johnson.app.rest1.Repo;

import com.johnson.app.rest1.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo  extends JpaRepository<User, Long> {
}


