package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import service.MainService;
import vo.UserVO;

@Controller
public class MainController {

	@Autowired
	private MainService mainService;	
	
	
	@RequestMapping("/test.do")
	public String testPage(Model model, UserVO userVO) {
		
		List<UserVO> test = mainService.test();
		model.addAttribute("userVO", test);
		
		return "test";
	}
}
