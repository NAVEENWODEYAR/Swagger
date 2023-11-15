package com.swager.modal;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

import com.swager.dto.StudentDTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "Student")
public class Student 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int stId;
	
//	@Type(type = "uuid-char")
	private UUID regNumber = UUID.randomUUID();
	
	private String stName;
	private String stClass;
	private double stMarks;
	
		// DTO object for transfering the data,
		public Student(StudentDTO studentDTO)
		{
			this.stName = studentDTO.getStName();
			this.stClass = studentDTO.getStClass();
			this.stMarks = studentDTO.getStMarks();
		}
	}
