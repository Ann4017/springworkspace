package com.springbook.biz.board.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbook.biz.board.BoardService;
import com.springbook.biz.board.BoardVO;

@Service("board_service")
public class BoardServiceImpl implements BoardService {

	@Autowired
	private BoardDAOSpring boardDAO;
//	private BoardDAO boardDAO;

	
	@Override
	public void insert_board(BoardVO _vo) {
		// TODO Auto-generated method stub

		boardDAO.insert_board(_vo);
	}

	@Override
	public void update_board(BoardVO _vo) {
		// TODO Auto-generated method stub

		boardDAO.update_board(_vo);

	}

	@Override
	public void delete_board(BoardVO _vo) {
		// TODO Auto-generated method stub

		boardDAO.delete_board(_vo);
	}

	@Override
	public BoardVO select_board(BoardVO _vo) {
		// TODO Auto-generated method stub

		return boardDAO.select_board(_vo);
	}

	@Override
	public List<BoardVO> select_board_list() {
		// TODO Auto-generated method stub

		return boardDAO.select_board_list();
	}

}
