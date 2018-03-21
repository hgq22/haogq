package com.dj.springboot_mybits.mapper;

import com.dj.springboot_mybits.pojo.Test03;

public class Test03MapperSQL {

    public String testList(){
        return "select * from test03";
    }

    public String test03(Integer id){
        return "select * from test03 where id = " + id;
    }

    public String deleteTest(Integer id){
        return "DELETE FROM test03 WHERE id = " + id;
    }

    public String addTest(Test03 test03){
        return "insert into test03 (name) values (#{name})";
    }

    public String updateTest(Test03 test03){
        return "update test03 set name = #{name} where id = " + test03.getId();
    }
}
