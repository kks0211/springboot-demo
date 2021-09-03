package com.speedquiz.service;

import com.speedquiz.domain.BoardVO;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class BoardServiceTests {

    //private final Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private BoardService boardService;

    @Test
    public void save() {
        BoardVO vo = BoardVO.builder().title("작성").content("작성내용").writer("작성자").build();
        boardService.save(vo);
    }

    @Test
    public void read() {
        boardService.read(3L);
        //assertThat(boardService.read(3L), equ);
    }

    @Test
    public void update() {
        BoardVO vo = BoardVO.builder().title("수정제목1").content("수정내용1").build();
        vo.setBno(3L);

        boardService.update(vo);
    }

    @Test
    public void delete() {
        boardService.delete(3L);
    }

    @Test
    public void listPage() {
        List<BoardVO> list = boardService.listPage();
        //log.info("list => {}", list);
    }
}