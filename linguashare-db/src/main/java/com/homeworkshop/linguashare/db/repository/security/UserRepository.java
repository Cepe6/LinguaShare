package com.homeworkshop.linguashare.db.repository.security;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.homeworkshop.linguashare.db.entity.security.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

}
