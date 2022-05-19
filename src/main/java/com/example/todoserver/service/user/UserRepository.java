package com.example.todoserver.service.user;

import com.example.todoserver.entity.TbUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface UserRepository extends JpaRepository<TbUser, Long> {
    @Query("SELECT u FROM TbUser u WHERE u.email = :email")
    TbUser findByEmail (String email);
}
