package com.dj.springboot_mybits.service.Impl;

import com.dj.springboot_mybits.mapper.Test01Mapper;
import com.dj.springboot_mybits.pojo.Test01;
import com.dj.springboot_mybits.service.Test01Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Test01ServiceImpl implements Test01Service{


    @Autowired
    private Test01Mapper test01Mapper;

    @Override
    public List<Test01> testList() {
        return test01Mapper.testList();
    }

    @Override
    public Test01 test01(Integer id) {
        return test01Mapper.test01(id);
    }

    @Override
    public Integer addTest(Test01 test01) {
        return test01Mapper.addTest(test01);
    }

    @Override
    public void updateTest(Test01 test01) {
        test01Mapper.updateTest(test01);
    }

    @Override
    public void deleteTest(Integer id) {
        test01Mapper.deleteTest(id);
    }
}
