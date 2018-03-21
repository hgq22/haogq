package com.dj.springboot_mybits.service.Impl;

import com.dj.springboot_mybits.mapper.Test02Mapper;
import com.dj.springboot_mybits.pojo.Test02;
import com.dj.springboot_mybits.service.Test02Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Test02ServiceImpl implements Test02Service{


    @Autowired
    private Test02Mapper test02Mapper;

    @Override
    public List<Test02> testList() {
        return test02Mapper.testList();
    }

    @Override
    public Test02 test02(Integer id) {
        return test02Mapper.test02(id);
    }

    @Override
    public Integer addTest(Test02 test02) {
        return test02Mapper.addTest(test02);
    }

    @Override
    public void updateTest(Test02 test02) {
        test02Mapper.updateTest(test02);
    }

    @Override
    public void deleteTest(Integer id) {
        test02Mapper.deleteTest(id);
    }
}
