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
            "	a.id accountId,\r\n" +
            "	a.user_name userName,\r\n" +
            "	a.role_id roleId,\r\n" +
            "	a.password,\r\n" +
            "	GROUP_CONCAT(r.name) role\r\n" +
            "FROM account a \r\n" +
            "LEFT JOIN sys_role r ON (a.role_id = r.id)\r\n" +
            "WHERE\r\n" +
            "	a.user_name = :userName",nativeQuery=true)
    Map<String, Object> findUserAuthentic(@Param("userName")String userName);
}
