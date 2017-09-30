package com.example.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentModel
{
	@NotNull
	@Size(min=1)
    private String npm;
	
	@NotNull
	@Size(min=1)
    private String name;
	
    private double gpa;

}
