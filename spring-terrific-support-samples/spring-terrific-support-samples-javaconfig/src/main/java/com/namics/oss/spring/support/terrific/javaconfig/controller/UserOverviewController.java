/*
 * Copyright 2000-2013 Namics AG. All rights reserved.
 */

package com.namics.oss.spring.support.terrific.javaconfig.controller;

import com.namics.oss.spring.support.terrific.javaconfig.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.inject.Inject;

/**
 * UserController.
 *
 * @author aschaefer, Namics AG
 * @since 22.05.2013
 */
@Controller
public class UserOverviewController {

	@Inject
	private UserService userService;

	@RequestMapping(value = "/users")
	public String view(Model model) {
		model.addAttribute("users", this.userService.getUsers());
		return "views/users-overview";
	}

}
