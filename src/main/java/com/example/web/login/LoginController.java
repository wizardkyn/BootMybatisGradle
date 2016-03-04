package com.example.web.login;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.web.domain.UserVo;

@Controller
public class LoginController {
	@Resource
	private LoginService loginService;
	
	@RequestMapping(value="/login.do")
	public String userLogin(ModelMap model,@ModelAttribute("form") UserVo form) {
		if (form.getUserId() != null && !"".equals(form.getUserId())) loginService.getUser(form.getUserId());
		return "/login/login.jsp";
	}
}
