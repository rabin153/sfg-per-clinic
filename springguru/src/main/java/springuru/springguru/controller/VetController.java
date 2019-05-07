package springuru.springguru.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("vets")
public class VetController {

	@RequestMapping({ "", "/index", "vetsIndex" })
	public String listVets() {
		return "vets/vetIndex";
	}
}
