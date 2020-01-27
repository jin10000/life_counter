package org.king.life_counter.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.king.life_counter.service.UserService;
import org.king.life_counter.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

	@Autowired
	private UserService userService;

	@RequestMapping(value = "", method = RequestMethod.GET)
	public ModelAndView homeController() throws Exception {

		ModelAndView mav = new ModelAndView();
		mav.setViewName("login");
		return mav;
	}

	@PostMapping(value = "login")
	public void loginController(User user, HttpServletRequest request, HttpServletResponse response)
			throws IOException {
		boolean isLogined = userService.login(user);
		if (isLogined) {
			request.getSession().setAttribute("userInfo", user);
			
			
			System.out.println(request.getSession().getAttribute("userInfo"));
			
			
			response.sendRedirect("main");
		} else {
			System.out.println("hi");
			response.sendRedirect("/");
		}
	}

	@GetMapping(value = "main")
	public String mainController(HttpServletRequest request, HttpServletResponse response) throws Exception {
		if(request.getSession(true).getAttribute("userInfo") == null) {
			//잘가 어딜 감히 
			response.sendRedirect("/");
		}
		
		String viewName = "main";
		return viewName;

	}
	
	

}
