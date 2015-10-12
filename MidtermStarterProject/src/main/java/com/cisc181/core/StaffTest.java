package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

import com.cisc181.eNums.eTitle;

public class StaffTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
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

	@org.junit.Test
	public void test() {
		Calendar cal = Calendar.getInstance();
		Staff staff1 = new Staff("ROY", "YL", "CHENG", null, null, null, null, 
				null, 0, 10000, null, eTitle.PROFESSOR);
		Staff staff2 = new Staff("ROY", "YL", "CHENG", null, null, null, null, 
				null, 0, 20000, null, eTitle.PROFESSOR);
		Staff staff3 = new Staff("ROY", "YL", "CHENG", null, null, null, null, 
				null, 0, 30000, null, eTitle.PROFESSOR);
		Staff staff4 = new Staff("ROY", "YL", "CHENG", null, null, null, null, 
				null, 0, 40000, null, eTitle.PROFESSOR);
		Staff staff5 = new Staff("ROY", "YL", "CHENG", null, null, null, null, 
				null, 0, 50000, null, eTitle.PROFESSOR);
		Date today = new Date();
		
		Staff[] StaffList = {staff1, staff2, staff3, staff4, staff5};
		double average = 0;
		
		average = (staff1.getSalary() + staff2.getSalary() + staff3.getSalary() + staff4.getSalary() 
		+ staff5.getSalary()) / 5.0;
		
		//System.out.println(average == 30000.0);
		assertEquals(average, 30000.0, 0);
	}

}
