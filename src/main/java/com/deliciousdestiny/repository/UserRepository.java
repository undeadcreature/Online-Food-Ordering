package com.deliciousdestiny.repository;

import com.deliciousdestiny.model.user;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<user,Long> {

    public user findByEmail(String username);

}
