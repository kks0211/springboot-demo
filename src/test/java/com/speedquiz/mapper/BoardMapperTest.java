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
        boardMapper.save(vo);

    }

    @Test
    void read() {
        System.out.println(boardMapper.read(2L));
    }

    @Test
    void update() {
        BoardVO vo = BoardVO.builder().title("수정제목").content("수정내용").build();
        vo.setBno(2L);
        boardMapper.update(vo);
    }

    @Test
    void delete () {
        boardMapper.delete(1L);
    }

    @Test
    void listPage(){
        boardMapper.listPage();
    }

}