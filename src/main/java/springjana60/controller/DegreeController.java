package springjana60.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import springjana60.model.Degree;
import springjana60.repository.DegreeRepository;

@Controller
@RequestMapping("/degree")
public class DegreeController {
	
	@Autowired
	private DegreeRepository repo;
	
	@GetMapping
	public String Degree (Model model) {
		List <Degree> degreeList = (List<Degree>) repo.findAll();
		model.addAttribute("degreesList", degreeList); // "listadeipaesi" devo richiamarlo dentro al template
		return "degrees";
	}
	
}
 //List<Controller> controllerList = (List<Controller>)repo.find