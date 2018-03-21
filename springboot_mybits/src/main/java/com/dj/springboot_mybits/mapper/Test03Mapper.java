package com.dj.springboot_mybits.mapper;

import com.dj.springboot_mybits.pojo.Test03;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface Test03Mapper {

    @SelectProvider(type = Test03MapperSQL.class,method = "testList")
    List<Test03> testList();

    @SelectProvider(type = Test03MapperSQL.class,method = "test03")
    Test03 test03(Integer id);

    @DeleteProvider(type = Test03MapperSQL.class,method = "deleteTest")
    void deleteTest(Integer id);

    @InsertProvider(type = Test03MapperSQL.class,method = "addTest")
    void addTest(Test03 test03);

    @UpdateProvider(type = Test03MapperSQL.class,method = "updateTest")
    void updateTest(Test03 test03);

}
