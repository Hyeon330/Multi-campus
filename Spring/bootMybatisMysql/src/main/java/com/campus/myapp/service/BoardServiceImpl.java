package com.campus.myapp.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.campus.myapp.dao.BoardDAO;
import com.campus.myapp.vo.BoardVO;

@Service
public class BoardServiceImpl implements BoardService {
	@Inject
	BoardDAO dao;

	@Override
	public List<BoardVO> allSelect() {
		return dao.allSelect();
	}

	@Override
	public int boardInsert(BoardVO vo) {
		return dao.boardInsert(vo);
	}

	@Override
	public BoardVO boardSelect(int no) {
		return dao.boardSelect(no);
	}

	@Override
	public int boardUpdate(BoardVO vo) {
		return dao.boardUpdate(vo);
	}

	@Override
	public int boardDelete(int no, String userid) {
		return dao.boardDelete(no, userid);
	}
}
