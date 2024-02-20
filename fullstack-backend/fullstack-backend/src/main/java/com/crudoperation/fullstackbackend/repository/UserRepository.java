package com.crudoperation.fullstackbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.crudoperation.fullstackbackend.model.User;

public interface UserRepository extends JpaRepository <User,Long>{

}
