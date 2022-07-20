package springjana60.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import springjana60.model.Teacher;
import springjana60.repository.TeacherRepository;

@Controller
@RequestMapping("/teacher")
public class TeacherController {

	@Autowired
	private TeacherRepository repo;
	
	@GetMapping
	public String teacher (Model model) {
		List <Teacher> listOfTeachers = (List <Teacher>)repo.findAll();
		model.addAttribute("TeachersList", listOfTeachers);
		return "teachers";
	}
	@GetMapping ("/details/{id}")
    public String teachersDetail (@PathVariable (name = "id") Integer id , Model model) {
		Optional<Teacher> queryResult = repo.findById(id);
		model.addAttribute("teachersContact", queryResult.get());
		return "teacherDetails";
    }
	
	
}

