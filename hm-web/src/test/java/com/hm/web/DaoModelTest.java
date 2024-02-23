package com.hm.web;

import com.hm.dao.mapper.T1Mapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author ZZH
 * @create 2024/2/22
 * @since 1.0.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class DaoModelTest {

    @Autowired
    private T1Mapper testMapper;

    @Test
    public void test(){
        testMapper.selectById(1);
    }
}