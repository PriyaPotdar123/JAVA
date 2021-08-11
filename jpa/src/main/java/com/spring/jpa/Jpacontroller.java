package com.spring.jpa;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.spring.jpa.datarepo.Alienrepo;

@Controller
public class Jpacontroller {
	
		@Autowired
		Alienrepo repo;
	
		@RequestMapping("/")
		public String home() 
		{
			return "index.jsp";
		}
		
		@RequestMapping("addAlien")
		public String addAlien(Alien alien)
		{
			repo.save(alien);
			return "index.jsp";
		}
		
		@RequestMapping("getAlien")
		public ModelAndView getAlien(@RequestParam int id)
		{
			ModelAndView mv =new ModelAndView("Show.jsp");
			Alien alien=repo.findById(id).orElse(new Alien());
			mv.addObject(alien);
			return mv;
		}		
}
