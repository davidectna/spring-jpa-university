package springjana60.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/")
public class MainController {
	
	@GetMapping
	public String departments (Model model) {
		List<String> departmentsList = List.of("Dipartimento di Ingegneria", "Dipartimento di Beni Culturali", "Dipartimento di Medicina", "Dipartimento di Scienze Politiche", "Dipartimento di Economia", "Dipartimento di Lingue");
		model.addAttribute("departmentsList", departmentsList);
		return "index";		
	}


}
