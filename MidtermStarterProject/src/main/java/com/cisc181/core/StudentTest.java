package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.UUID;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;

public class StudentTest extends Enrollment{

	private static ArrayList<Student> StudentList = new ArrayList<Student>(10);
	private static ArrayList<Course> CourseList = new ArrayList<Course>(3);
	private static ArrayList<Semester> SemesterList = new ArrayList<Semester>(2);
	private static ArrayList<Section> SectionList = new ArrayList<Section>(6);
	private static ArrayList<Double> GradeList = new ArrayList<Double>();

	public StudentTest(UUID StudentID, UUID SectionID) {
		super();
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		Course Math = new Course(null, "Math", 4);
		Course Econ = new Course(null, "Econ", 4);
		Course Cisc = new Course(null, "Cisc", 4);

		Course[] CourseList = { Math, Econ, Cisc };

		Calendar Start = Calendar.getInstance();
		Calendar End = Calendar.getInstance();

		Start.set(2015, 9, 2);
		End.set(2015, 12, 18);
		Semester Fall = new Semester(null, Start.getTime(), End.getTime());

		Start.set(2016, 1, 5);
		End.set(2016, 5, 22);
		Semester Spring = new Semester(null, Start.getTime(), End.getTime());

		Semester[] SemesterList = { Fall, Spring };

		ArrayList<Section> SectionList = new ArrayList<Section>(6);

		int i = 0;
		for (Semester Semester : SemesterList) {
			for (Course Course : CourseList) {
				i = 1;
				Section Section = new Section(Course.getCourseID(), Semester.getSemesterID(), null, i);
				SectionList.add(Section);
				i = i + 1;
			}
		}

		Start.set(1995, 1, 6);
		Student Student1 = new Student("ROY", "YL", "CHENG", Start.getTime(), eMajor.CHEM, null, null, null);
		Student Student2 = new Student("BEN", "YL", "CHENG", Start.getTime(), eMajor.CHEM, null, null, null);
		Student Student3 = new Student("TONY", "YL", "CHENG", Start.getTime(), eMajor.CHEM, null, null, null);
		Student Student4 = new Student("MIKE", "YL", "CHENG", Start.getTime(), eMajor.CHEM, null, null, null);
		Student Student5 = new Student("GREG", "YL", "CHENG", Start.getTime(), eMajor.CHEM, null, null, null);
		Student Student6 = new Student("MARK", "YL", "CHENG", Start.getTime(), eMajor.CHEM, null, null, null);
		Student Student7 = new Student("TYLER", "YL", "CHENG", Start.getTime(), eMajor.CHEM, null, null, null);
		Student Student8 = new Student("OSCAR", "YL", "CHENG", Start.getTime(), eMajor.CHEM, null, null, null);
		Student Student9 = new Student("BRIAN", "YL", "CHENG", Start.getTime(), eMajor.CHEM, null, null, null);
		Student Student10 = new Student("JOHN", "YL", "CHENG", Start.getTime(), eMajor.CHEM, null, null, null);

		Student[] StudentList = { Student1, Student2, Student3, Student4, Student5, Student6, Student7, Student8,
				Student9, Student10 };

	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		
		double CourseGrade = 2;
		double Total = 0;
		
		for (Section s : SectionList)
			Total = Total + CourseGrade;
			CourseGrade = CourseGrade + 1;
			if (CourseGrade == 5){
				CourseGrade = 2;
			}
			double average = Total / 6;
			
			assertEquals(average, 3.0, 0);
			
			
		double Grades = 2;
		double CourseTotal = 0;
		
		for (Student a : StudentList)
			CourseTotal = CourseTotal + Grades;
			Grades = Grades + 1;
			if (Grades == 5){
				Grades = 2;
			}
			
			double CourseAverage = CourseTotal / 10;
			
			assertEquals(CourseAverage, 2.9, 0);
		
		
			
	}

}
