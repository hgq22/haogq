package com.dj.springboot_mybits.service;

import com.dj.springboot_mybits.pojo.Test02;

import java.util.List;

public interface Test02Service {

    List<Test02> testList();

    Test02 test02(Integer id);

    Integer addTest(Test02 test02);

    void updateTest(Test02 test02);

    void deleteTest(Integer id);
}
