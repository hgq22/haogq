package com.dj.springboot_mybits.mapper;

import com.dj.springboot_mybits.pojo.Test02;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface Test02Mapper {

    @Select("select * from test02")
    List<Test02> testList();

    @Select("select * from test02 where id = #{id}")
    Test02 test02(Integer id);

    @Delete("DELETE FROM test02 WHERE id = #{id}")
    void deleteTest(Integer id);

    @Insert("insert into test02 (name) values (#{name})")
    @SelectKey(before = false, keyProperty="id",resultType = Integer.class, statement = "SELECT LAST_INSERT_ID()")
    Integer addTest(Test02 test02);

    @Update("update test02 set name = #{name} where id = #{id}")
    void updateTest(Test02 test02);

}
