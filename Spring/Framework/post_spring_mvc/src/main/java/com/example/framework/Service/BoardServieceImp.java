package com.example.framework.Service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.framework.Dao.BoardDAO;
import com.example.framework.Dto.BoardDTO;

@Service
public class BoardServieceImp implements BoardService {
	@Autowired
	BoardDAO boardDAO;

	@Override
	public String create(BoardDTO boardDTO) {
		int affectRowCount = boardDAO.insert(boardDTO);
		if(affectRowCount == 1) {
			return boardDTO.getBoard_id().toString();
		}
		
		return null;
	}

	@Override
	public BoardDTO selectDetail(BoardDTO boardDTO) {
	      BoardDTO detailDTO = boardDAO.detail(boardDTO);
	      detailDTO.setContent(detailDTO.getContent()+"12345"); //재가공
		
		return boardDAO.detail(boardDTO);
	}

	@Override
	public int deleteById(BoardDTO boardDTO) {
		// TODO Auto-generated method stub
		System.out.println("삭제 서비스");
		return boardDAO.delete(boardDTO);
	}

	@Override
	public int updateById(BoardDTO boardDTO) {
		// TODO Auto-generated method stub
		return boardDAO.update(boardDTO);
	}

	@Override
	public List<BoardDTO> selectBoards() {
		// TODO Auto-generated method stub
		return boardDAO.selectList();
	}
	

	
}
