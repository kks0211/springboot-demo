package com.speedquiz.service;

import com.speedquiz.domain.BoardVO;
import com.speedquiz.mapper.BoardMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class BoardServiceImpl implements BoardService {

    private BoardMapper boardMapper;

    @Override
    public int save(BoardVO vo) {
        return boardMapper.save(vo);
    }

    @Override
    public BoardVO read(Long bno) {
        return boardMapper.read(bno);
    }

    @Override
    public int update(BoardVO vo) {
        return boardMapper.update(vo);
    }

    @Override
    public int delete(Long bno) {
        return boardMapper.delete(bno);
    }

    @Override
    public List<BoardVO> listPage() {
        return boardMapper.listPage();
    }
}
