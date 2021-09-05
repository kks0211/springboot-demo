package com.speedquiz.controller;

import com.speedquiz.domain.BoardVO;
import com.speedquiz.domain.Criteria;
import com.speedquiz.service.BoardService;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/board/*")
@AllArgsConstructor
public class BoardController {

    private BoardService boardService;

    @GetMapping("/list")
    public String listGet(Model model, Criteria cri) {

        model.addAttribute("list", boardService.listPage(cri));
        return "/board/list";
    }

    @GetMapping("/regist")
    public String registGet() {

        return "/board/regist";
    }

    @PostMapping("/regist")
    public ResponseEntity<String> registPost(@RequestBody BoardVO vo, RedirectAttributes rttr) {

        boardService.save(vo);

        return new ResponseEntity<>("success", HttpStatus.OK);
    }

    @GetMapping("/get/{bno}")
    public String get(@PathVariable("bno") Long bno, Model model) {
        BoardVO vo = boardService.read(bno);
        model.addAttribute("board", vo);
        return "/board/get";
    }

    @PutMapping("/update/{bno}")
    public ResponseEntity<String> update(@PathVariable("bno") Long bno, @RequestBody BoardVO vo) {

        if (boardService.read(bno).getBno() != null) {
            boardService.update(vo);
        } else {

        }
        return new ResponseEntity<>("success", HttpStatus.OK);
    }

    @DeleteMapping("/delete/{bno}")
    public ResponseEntity<String> delete(@PathVariable("bno") Long bno) {
        boardService.delete(bno);
        return new ResponseEntity<>("success", HttpStatus.OK);
    }

}
