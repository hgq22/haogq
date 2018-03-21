package com.dj.springboot_mybits;

import com.dj.springboot_mybits.pojo.Test02;
import com.dj.springboot_mybits.service.Test02Service;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Test022 {

    @Autowired
    private Test02Service test02Service;

    @Test
    public void testList() {
        List<Test02> test02s = test02Service.testList();
        for (Test02 test02 : test02s) {
            System.out.println(test02.getId()+"======="+test02.getName());
        }
    }

    @Test
    public void test02() {
        Test02 test02s = test02Service.test02(1);
        System.out.println(test02s.getId()+"======="+test02s.getName());
    }

    @Test
    public void addTest() {
        Test02 test02 = new Test02();
        test02.setName("zs");
        test02Service.addTest(test02);
    }

    @Test
    public void updateTest() {
        Test02 test02 = new Test02();
        test02.setId(1);
        test02.setName("ls");
        test02Service.updateTest(test02);
    }

    @Test
    public void deleteTest() {
        test02Service.deleteTest(3);
    }
}
