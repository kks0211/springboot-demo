package com.speedquiz.mapper;

import com.speedquiz.domain.BoardVO;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
class BoardMapperTest {

    @Autowired
    private BoardMapper boardMapper;

    @Test
    void insert() {
        BoardVO vo = BoardVO.builder().title("test").content("test").writer("test").build();
        boardMapper.insert(vo);

    }
}