package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.MainDAO;
import vo.UserVO;

@Service
public class MainService {

	@Autowired
	MainDAO mainDAO;
	
	public List<UserVO> test(){
		
		List<UserVO> test = mainDAO.test();
		
		return test;
	}
}
