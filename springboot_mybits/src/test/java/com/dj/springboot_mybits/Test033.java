package com.dj.springboot_mybits;

import com.dj.springboot_mybits.pojo.Test03;
import com.dj.springboot_mybits.service.Test03Service;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Test033 {

    @Autowired
    private Test03Service test03Service;

    @Test
    public void testList() {
        List<Test03> test03s = test03Service.testList();
        for (Test03 test03 : test03s) {
            System.out.println(test03.getId()+"======="+test03.getName());
        }
    }

    @Test
    public void test03() {
        Test03 test03s = test03Service.test03(1);
        System.out.println(test03s.getId()+"======="+test03s.getName());
    }

    @Test
    public void addTest() {
        Test03 test03 = new Test03();
        test03.setName("zsss");
        test03Service.addTest(test03);
    }

    @Test
    public void updateTest() {
        Test03 test03 = new Test03();
        test03.setId(1);
        test03.setName("lsss");
        test03Service.updateTest(test03);
    }

    @Test
    public void deleteTest() {
        test03Service.deleteTest(1);
    }
}
