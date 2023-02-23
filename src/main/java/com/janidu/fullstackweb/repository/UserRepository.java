package com.janidu.fullstackweb.repository;

import com.janidu.fullstackweb.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {


}
