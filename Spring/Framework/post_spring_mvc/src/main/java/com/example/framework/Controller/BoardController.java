package com.example.framework.Controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.framework.Dto.BoardDTO;
import com.example.framework.Service.BoardServieceImp;

@Controller
public class BoardController {
	
	@Autowired
	BoardServieceImp boardService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView home() {
		List<BoardDTO> boardList = boardService.selectBoards();
		ModelAndView mav = new ModelAndView();
		mav.addObject("list", boardList);
		mav.setViewName("board/home");
		
		return mav;
	}
	@RequestMapping(value = "/create", method = RequestMethod.GET)
	public String create() {
		return "board/create";
	}
	
	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public ModelAndView createPost(
			@RequestParam(value="content") String content,
			@RequestParam(value="title") String title,
			@RequestParam(value="user") String user) {
		ModelAndView mav = new ModelAndView();
		BoardDTO boardDTO = new BoardDTO();
		boardDTO.setContent(content);
		boardDTO.setTitle(title);
		boardDTO.setUser(user);
		
		String boardId = boardService.create(boardDTO);
		if(boardId == null) {
			mav.setViewName("redirect:/create");
		}else {
			mav.setViewName("redirect:/detail?board_id="+boardId);
		}
		return mav;
	}
	@RequestMapping(value = "/detail", method = RequestMethod.GET)
	public ModelAndView detail(@RequestParam(value="board_id") Integer board_id) {
		BoardDTO boardDTO = new BoardDTO();
		boardDTO.setBoard_id(board_id);
		BoardDTO detailMap =  boardService.selectDetail(boardDTO);
		//System.out.println(detailMap.toString());
		ModelAndView mav = new ModelAndView();
		mav.addObject("data", detailMap);
		mav.addObject("board_id", boardDTO.getBoard_id());
		mav.setViewName("/board/detail");
		return mav;
	}
	@RequestMapping(value = "/update", method = RequestMethod.GET)
	public ModelAndView update(@RequestParam(value="board_id") Integer board_id) {
		System.out.println(board_id);
		ModelAndView mav = new ModelAndView();
		mav.addObject("board_id", board_id);
		mav.setViewName("/board/update");
		return mav;
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public ModelAndView updatePost(
			@RequestParam(value="board_id") Integer board_id,
			@RequestParam(value="content") String content,
			@RequestParam(value="title") String title,
			@RequestParam(value="user") String user) {

		ModelAndView mav = new ModelAndView();
		BoardDTO boardDTO = new BoardDTO();
		boardDTO.setBoard_id(board_id);
		boardDTO.setContent(content);
		boardDTO.setTitle(title);
		boardDTO.setUser(user);
		int boardUpdate = boardService.updateById(boardDTO);
		if(boardUpdate == 0) {
			mav.setViewName("redirect:/update?board_id="+board_id);
		}else {
			mav.setViewName("redirect:/detail?board_id="+board_id);
		}
		
		return mav;
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	public ModelAndView updatePost(@RequestParam(value="board_id") Integer board_id) {
		System.out.println(board_id);
		
		ModelAndView mav = new ModelAndView();
		BoardDTO boardDTO = new BoardDTO();
		boardDTO.setBoard_id(board_id);
		
		int boardUpdate = boardService.deleteById(boardDTO);
		if(boardUpdate != 0) {
			System.out.println("삭제완료");
			mav.setViewName("redirect:/create");
		}else {
			System.out.println("삭제실패");
			mav.setViewName("redirect:/detail?board_id="+board_id);
		}
		
		return mav;
	}
}
