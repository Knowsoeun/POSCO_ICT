package com.example.framework.Service;


import java.util.List;

import org.springframework.stereotype.Service;

import com.example.framework.Dto.BoardDTO;



public interface BoardService {
	String create(BoardDTO boardDTO);
	BoardDTO selectDetail(BoardDTO boardDTO);
	int deleteById(BoardDTO boardDTO);
	int updateById(BoardDTO boardDTO);
	List<BoardDTO> selectBoards();
	
}
