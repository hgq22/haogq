package com.dj.springboot_mybits.mapper;

import com.dj.springboot_mybits.pojo.Test01;

import java.util.List;

public interface Test01Mapper {


    List<Test01> testList();

    Test01 test01(Integer id);

    Integer addTest(Test01 test01);

    void updateTest(Test01 test01);

    void deleteTest(Integer id);
}
