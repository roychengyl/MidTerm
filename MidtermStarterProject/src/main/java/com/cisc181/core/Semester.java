package com.cisc181.core;

import java.util.Date;
import java.util.UUID;

public class Semester {
	
	private UUID SemesterID;
	private Date StartDate;
	private Date EndDate;
	
	public UUID getSemesterID()
    {
        return this.SemesterID;
    }

    public Date getStartDate()
    {
        return this.StartDate;
    }

    public Date getEndDate ( )
    {
        return this.EndDate;
    }

    public Semester(UUID SemesterID, Date StartDate, Date EndDate){
		this.SemesterID = SemesterID;
    	this.StartDate = StartDate;
		this.EndDate = EndDate;
	}
    
}
