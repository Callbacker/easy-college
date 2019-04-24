package com.weida.easycollege.repository;

import com.weida.easycollege.po.UserPo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserPo,Integer> {
}
