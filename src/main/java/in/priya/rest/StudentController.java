package in.priya.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.priya.bindings.Student;
import in.priya.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService studService;
	
	@PostMapping("/save")
	public String saveStudent(@RequestBody Student student)
	{
		 boolean status = studService.saveStudent(student);
		 if(status)
		 {
			 return "student saved";
		 }
		 else
		 {
			 return "Failed to save";
		 }
	}
	
	@GetMapping("/students")
	public List<Student> getStudents()
	{
		return studService.getAllStudent();
	}

}
