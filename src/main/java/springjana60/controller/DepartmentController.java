package springjana60.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import springjana60.repository.DepartmentRepository;


@Controller
@RequestMapping("/")
public class DepartmentController {
	
	@Autowired
	private DepartmentRepository repo;
	
	@GetMapping
	public String departments (Model model) {
		 model.addAttribute("departmentList", repo.findAll());
		    return "departments";
		  }

}
