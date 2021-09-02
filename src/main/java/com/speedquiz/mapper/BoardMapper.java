package com.speedquiz.mapper;

import com.speedquiz.domain.BoardVO;

public interface BoardMapper {
    int save(BoardVO vo);

    BoardVO read(Long bno);


}
