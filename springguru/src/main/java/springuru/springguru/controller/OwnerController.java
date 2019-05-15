package springuru.springguru.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import springuru.springguru.service.OwnerService;

@Controller
@RequestMapping("owners")
public class OwnerController {

	private final OwnerService ownerService;

	public OwnerController(OwnerService ownerService) {
		this.ownerService = ownerService;
	}

	@RequestMapping({ "/", "", "/index" })
	public String listOwners(Model model) {
		model.addAttribute("owners", ownerService.findAll());
		return "owners/ownerIndex";
	}

	@RequestMapping(value = "/find")
	public String findOwners() {
		return "notimplemented";
	}
}
