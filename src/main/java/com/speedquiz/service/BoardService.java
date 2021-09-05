package com.speedquiz.service;

import com.speedquiz.domain.BoardVO;
import com.speedquiz.domain.Criteria;

import java.util.List;

public interface BoardService {

    int save(BoardVO vo);
    BoardVO read(Long bno);
    int update(BoardVO vo);
    int delete (Long bno);
    List<BoardVO> listPage(Criteria cri);

}
