package com.spring.jpa;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Jpacontroller {
	
		@RequestMapping("index")
		public ModelAndView name(Alien alien)
		{
			ModelAndView mv = new ModelAndView();
			mv.setViewName("index.jsp");
			mv.addObject("obj", alien);
			return mv;
		}
}
