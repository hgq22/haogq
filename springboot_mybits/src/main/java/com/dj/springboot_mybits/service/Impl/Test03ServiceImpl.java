package com.dj.springboot_mybits.service.Impl;

import com.dj.springboot_mybits.mapper.Test03Mapper;
import com.dj.springboot_mybits.pojo.Test03;
import com.dj.springboot_mybits.service.Test03Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Test03ServiceImpl implements Test03Service{


    @Autowired
    private Test03Mapper test03Mapper;

    @Override
    public List<Test03> testList() {
        return test03Mapper.testList();
    }

    @Override
    public Test03 test03(Integer id) {
        return test03Mapper.test03(id);
    }

    @Override
    public void addTest(Test03 test03) {
        test03Mapper.addTest(test03);
    }

    @Override
    public void updateTest(Test03 test03) {
        test03Mapper.updateTest(test03);
    }

    @Override
    public void deleteTest(Integer id) {
        test03Mapper.deleteTest(id);
    }
}
