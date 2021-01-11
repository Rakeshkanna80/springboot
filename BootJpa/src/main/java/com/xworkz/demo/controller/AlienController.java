package com.xworkz.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.xworkz.demo.dao.AlienDAO;
import com.xworkz.demo.dto.Alien;

@RestController
public class AlienController {

	@Autowired
	AlienDAO dao;

	@RequestMapping("/addAlien")
	public String addAlien(Alien alien) {
		dao.save(alien);
		return "home.jsp";
	}

	@GetMapping("/getAlien")
	public ModelAndView getAlien(@RequestParam int id) {
		ModelAndView mv = new ModelAndView("showAlien.jsp");
		Alien alien = dao.findById(id).orElse(new Alien());
		mv.addObject(alien);
		return mv;

	}

}
