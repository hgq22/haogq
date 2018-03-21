package com.dj.springboot_mybits;

import com.dj.springboot_mybits.pojo.Test01;
import com.dj.springboot_mybits.service.Test01Service;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Test011 {

    @Autowired
    private Test01Service test01Service;

    @Test
    public void testList() {
        List<Test01> test01s = test01Service.testList();
        for (Test01 test01 : test01s) {
            System.out.println(test01.getId()+"======="+test01.getName());
        }
    }

    @Test
    public void test01() {
        Test01 test01s = test01Service.test01(1);
        System.out.println(test01s.getId()+"======="+test01s.getName());
    }

    @Test
    public void addTest() {
        Test01 test01 = new Test01();
        test01.setName("zs");
        test01Service.addTest(test01);
    }

    @Test
    public void updateTest() {
        Test01 test01 = new Test01();
        test01.setId(1);
        test01.setName("ls");
        test01Service.updateTest(test01);
    }

    @Test
    public void deleteTest() {
        test01Service.deleteTest(1);
    }
}
