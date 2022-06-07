package com.example.framework.Dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.framework.Dto.BoardDTO;

@Repository
public class BoardDAO {
	@Autowired
	SqlSessionTemplate sqlSessionTemplate;
	
	public int insert(BoardDTO boardDTO) {
		return sqlSessionTemplate.insert("board.insert", boardDTO);
	}
	public BoardDTO detail(BoardDTO boardDTO) {
		return sqlSessionTemplate.selectOne("board.select_detail",boardDTO);
	}
	public int delete(BoardDTO boardDTO) {
		System.out.println("ªË¡¶ dto");
		return sqlSessionTemplate.delete("board.deleteById",boardDTO);
	}
	public int update(BoardDTO boardDTO) {
		return sqlSessionTemplate.update("board.updateById",boardDTO);
	}
	public List<BoardDTO> selectList() {
		return sqlSessionTemplate.selectList("board.selectList");
	}
	
}
