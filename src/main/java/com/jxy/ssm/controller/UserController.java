/**        
 * @author: 焦祥宇 
 * @date:   createDate：2017年7月11日 下午2:40:37   
 * @Description:  
 * 
 */  
package com.jxy.ssm.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jxy.ssm.entity.User;
import com.jxy.ssm.service.IUserService;

/**
 * @author Administrator
 *
 */
@Controller
@RequestMapping("/user")
public class UserController {
	@Resource
	private IUserService userService;
	
	@RequestMapping("/showUser")
	public String toIndex(HttpServletRequest request,Model model){
		int userId = Integer.parseInt(request.getParameter("id"));
		User user = this.userService.getUserById(userId);
		model.addAttribute("user", user);
		return "showUser";
	}
	
}
