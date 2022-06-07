package com.poscoict.firstapp.Service;

import java.util.List;

import com.poscoict.firstapp.DTO.BoardDTO;

public interface BoardService {
	String create(BoardDTO boardDTO);
	BoardDTO selectDetail(BoardDTO boardDTO);
	int deleteById(BoardDTO boardDTO);
	int updateById(BoardDTO boardDTO);
	List<BoardDTO> selectBoards();
}
