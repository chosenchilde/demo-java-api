package chosenchilde.demoapi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class EmployeController {

	@Autowired
	private EmployeRepository employeRepository;

	@GetMapping
	public List<Employe> getAll() {
		return employeRepository.findAll();
	}
	
}
