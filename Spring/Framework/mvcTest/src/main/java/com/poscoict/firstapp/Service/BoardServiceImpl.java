package com.poscoict.firstapp.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poscoict.firstapp.DAO.BoardDAO;
import com.poscoict.firstapp.DTO.BoardDTO;

@Service
public class BoardServiceImpl implements BoardService {
	@Autowired
	BoardDAO boardDAO;

	@Override
	public String create(BoardDTO boardDTO) {
		int affectRowCount = boardDAO.insert(boardDTO);
		if (affectRowCount == 1) {
			return boardDTO.getBoard_id().toString();
		}
		return null;
	}

	@Override
	public BoardDTO selectDetail(BoardDTO boardDTO) {
		
		BoardDTO detailDTO = boardDAO.detail(boardDTO);
		System.out.println("detailDTO"+ detailDTO);
		
		return detailDTO;
	}

	@Override
	public int deleteById(BoardDTO boardDTO) {

		
		return boardDAO.delete(boardDTO);
	}

	@Override
	public int updateById(BoardDTO boardDTO) {
		// TODO Auto-generated method stub
		return boardDAO.update(boardDTO);
	}

	@Override
	public List<BoardDTO> selectBoards() {

		
		return boardDAO.selectList();
	}
}
