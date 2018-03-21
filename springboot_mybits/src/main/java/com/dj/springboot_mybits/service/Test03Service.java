package com.dj.springboot_mybits.service;

import com.dj.springboot_mybits.pojo.Test03;

import java.util.List;

public interface Test03Service {

    List<Test03> testList();

    Test03 test03(Integer id);

    void addTest(Test03 test03);

    void updateTest(Test03 test03);

    void deleteTest(Integer id);
}
