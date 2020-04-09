package dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import vo.UserVO;

@Repository
public class MainDAO {

	@Autowired
	SqlSessionTemplate sqlSession;	
	
	public List<UserVO> test(){
		
		return sqlSession.selectList("pp.test");
	}  
}
