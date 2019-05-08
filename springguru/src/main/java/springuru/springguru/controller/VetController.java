package springuru.springguru.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import springuru.springguru.service.VetService;

@Controller
@RequestMapping("vets")
public class VetController {

	private final VetService vetService;

	// no need to autowire with use of constructor injection

	public VetController(VetService vetService) {
		this.vetService = vetService;
	}

	@RequestMapping({ "", "/index", "vetsIndex" })
	public String listVets(Model model) {
		System.out.println(vetService.findAll().size());
		model.addAttribute("vets", vetService.findAll());
		return "vets/vetIndex";
	}
}
