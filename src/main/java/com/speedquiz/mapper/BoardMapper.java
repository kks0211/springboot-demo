package com.speedquiz.mapper;

import com.speedquiz.domain.BoardVO;

import java.util.List;

public interface BoardMapper {

    int save(BoardVO vo);
    BoardVO read(Long bno);
    int update(BoardVO vo);
    int delete(Long bno);
    List<BoardVO> listPage();
}
