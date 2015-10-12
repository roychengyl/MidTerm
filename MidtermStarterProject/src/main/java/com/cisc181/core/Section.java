package com.cisc181.core;

import java.util.Date;
import java.util.UUID;

public class Section {
	
	private UUID CourseID;
	private UUID SemesterID;
	private UUID SectionID;
	private int RoomID;
	
	public UUID getCourseID()
    {
        return this.CourseID;
    }
    
    public UUID getSemesterID()
    {
        return this.SemesterID;
    }
    
    public UUID getSectionID()
    {
        return this.SemesterID;
    }
    
    public int getRoomID()
    {
        return this.RoomID;
    }

    public Section(UUID CourseID, UUID SemesterID, UUID SectionID, int RoomID){
		this.CourseID = CourseID;
		this.SemesterID = SemesterID;
		this.SectionID = SectionID;
		this.RoomID = RoomID;
	}

}
