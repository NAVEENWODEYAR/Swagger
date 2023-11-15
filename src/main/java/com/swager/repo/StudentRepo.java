package com.swager.repo;

import java.util.List;

import org.springframework.data.jpa.repository.*;

import com.swager.modal.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> 
{
	@Query(value = "SELECT * FROM student ORDER BY student.st_Marks",nativeQuery = true)
	List<Student> getSudentOrderByName();
}
