package in.priya.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.priya.bindings.Student;
import in.priya.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository studRepo;
	
	public boolean saveStudent(Student student)
	{
		Student save = studRepo.save(student);
		if(save!=null)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
	public List<Student> getAllStudent()
	{
		Iterable<Student> findAll = studRepo.findAll();
		
		List<Student> list=new ArrayList<>();
		
		findAll.forEach(e->list.add(e));
		
		return list;
	}

}
