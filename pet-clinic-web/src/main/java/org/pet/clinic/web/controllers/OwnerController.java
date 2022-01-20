package org.pet.clinic.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import guru.springframework.sfgpetclinic.services.OwnerService;

@RequestMapping("/owners")
@Controller
public class OwnerController {
	
	private final OwnerService ownerService;
	
	public OwnerController(OwnerService ownerService ) {
		this.ownerService = ownerService;
	}
	
	//@RequestMapping({"/owners","/owners/index","/owners/index.html"})
	@RequestMapping({"","/","/index","/index.html"})
	public String listOwners(Model model) {  //by declaring that Spring MVC automatically going to add a model when it calls this method to list
		model.addAttribute("owners", ownerService.findAll());
		return "owners/index";
	}

}
