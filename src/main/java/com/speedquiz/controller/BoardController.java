package com.speedquiz.controller;

import com.speedquiz.domain.BoardVO;
import com.speedquiz.service.BoardService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/board/*")
@AllArgsConstructor
public class BoardController {
    private BoardService boardService;

    @GetMapping("/list")
    public String listGet(Model model) {

        model.addAttribute("list", boardService.listPage());
        return "/board/list";
    }

    @GetMapping("/regist")
    public String registGet() {
        return "/board/regist";
    }

    @PostMapping("/regist")
    public String registPost(BoardVO vo) {

        boardService.save(vo);
        return "redirect:/board/list";
    }

    @GetMapping("/get/{bno}")
    public String get(@PathVariable("bno") Long bno, Model model) {
        BoardVO vo = boardService.read(bno);
        model.addAttribute("board", vo);
        return "/board/get";
    }

    @PutMapping("/update/{bno}")
    public String update(@PathVariable("bno") Long bno, BoardVO vo) {

        if (boardService.read(bno).getBno() != null) {
            boardService.update(vo);
        } else {

        }

        return "redirect:/board/list";
    }

    @DeleteMapping("/delete/{bno}")
    public String delete(@PathVariable("bno") Long bno) {
        boardService.delete(bno);
        return "/board/list";
    }


}
