package com.cisc181.core;

import java.util.UUID;

public class Enrollment {

	private UUID SectionID;
	private UUID StudentID;
	private UUID EnrollmentID;
	private double Grade;
	
	protected Enrollment(){
		
	}
	
	public UUID getSectionID()
    {
        return this.SectionID;
    }

	public UUID getStudentID()
    {
        return this.StudentID;
    }

	public UUID getEnrollmentID()
    {
        return this.EnrollmentID;
    }
	
	public double getGrade()
    {
        return this.Grade;
    }
	
	public void SetGrade(double Grade)
	{
		this.Grade = Grade;
	}
	
	public Enrollment(UUID StudentID, UUID SectionID){
		this.EnrollmentID = UUID.randomUUID();
		this.StudentID = StudentID;
		this.SectionID = SectionID;
	}
	
}
