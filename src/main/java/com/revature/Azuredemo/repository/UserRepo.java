package com.revature.Azuredemo.repository;

import com.revature.Azuredemo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository()
public interface UserRepo extends JpaRepository<User, Integer> {

}
