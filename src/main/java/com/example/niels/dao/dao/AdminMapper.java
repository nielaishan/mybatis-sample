package com.example.niels.dao.dao;

import com.example.niels.dao.domain.Admin;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.*;

@Mapper
public interface AdminMapper  {

    @Select("select id, username as username, password as password from admin where id = #{id}")
    Admin findAdmin(@Param("id") Integer id);
}
