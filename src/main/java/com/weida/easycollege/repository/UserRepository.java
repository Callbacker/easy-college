package com.weida.easycollege.repository;

import com.weida.easycollege.po.UserPo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public interface UserRepository extends JpaRepository<UserPo,Integer> {

    @Query(value="SELECT\r\n" +
            "	u.id userId,\r\n" +
            "	u.phone phone,\r\n" +
            "	r.id roleId,\r\n" +
            "	u.password,\r\n" +
            "	GROUP_CONCAT(r.name) roleName\r\n" +
            "FROM user u \r\n" +
            "LEFT JOIN role r ON (a.role_id = r.id)\r\n" +
            "WHERE\r\n" +
            "	u.phone = :phone",nativeQuery=true)
    Map<String, Object> findUserAuthentic(@Param("phone")String phone);
}
