package springjana60.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import springjana60.model.Department;
import springjana60.repository.DepartmentRepository;


@Controller
@RequestMapping("/")
public class DepartmentController {
	
	@Autowired
	private DepartmentRepository repo;
	
	@GetMapping
	public String Department (Model model) {
		List<Department> departmentsList = (List<Department>) repo.findAll();
		model.addAttribute("DepartmentsList", departmentsList);
		    return "departments";
		  }
}



/*	@GetMapping
	public String Degree (Model model) {
		List <Degree> degreeList = (List<Degree>) repo.findAll();
		model.addAttribute("listaDeiPaesi", degreeList); // "listadeipaesi" devo richiamarlo dentro al template
		return "degrees";
	}
*/