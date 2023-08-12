package com.validator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.validator.entity.Registration;
import com.validator.repository.RegistrationRepository;

@Controller
public class RegistrationController {
	
	@Autowired
	private RegistrationRepository regisRepo;
	
	@RequestMapping("/createRegistration")
	public String createLeadPage() {
		return "registration_page";
	}
	
	@RequestMapping("/save")
	public String saveLead(@ModelAttribute("reg") Registration reg,ModelMap model ) {
		try {
			regisRepo.save(reg);
		} catch (Exception e) {
			String mes=e.getMessage();
			model.addAttribute("message",mes);
		}
		
		return "registration_page";
	}


}
