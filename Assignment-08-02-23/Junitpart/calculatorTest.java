package com.junit;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Assumptions.assumeFalse;
import static org.junit.jupiter.api.Assumptions.assumeTrue;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledOnJre;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.EnabledForJreRange;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;
public class CalculatorTest {

	Calculator cal;
@BeforeAll//before all is used which is executed before all test cases.
	static void beforeAllInit()
	{
		System.out.println("Before all:This will execute before all test cases.");
	}
@AfterAll//after all is used which is executed after all test cases.
	static void afterAllInit()
	{
		System.out.println("After all:This will execute after all test cases.");
	}
@BeforeEach//before each is used which is executed before every each test method.
void beforEachInit()
{
 cal = new Calculator();
}
@AfterEach//after each is used which is executed after every each test method.

	void cleanup()
	{
	    cal=null;//null reference
		System.out.println("Clean up......");
	}

@Test
@DisplayName("Testing Addition Method")
void TestAddition()
{
	Calculator cal=new Calculator();
	assertEquals(11, cal.addition(5, 6),
	"This test method is to test addition of two values");
}
@Test
void TestMultiply()
{
	//Calculator cal=new Calculator();
	//assertEquals(30, cal.multiplication(5, 6));
	assertAll(
			()->assertEquals(12, cal.multiplication(2, 6)),
			()->assertEquals(45, cal.multiplication(5, 9)),
			()->assertEquals(16, cal.multiplication(2, 8)),
			()->assertEquals(100, cal.multiplication(10, 10))
	);
}
@Test
void TestSubtraction()
{
	
	assertEquals(7, cal.subtraction(8, 1),
			"This test method is to test subtraction of two values");
}
@Test
//we are disabling this test case to run on mac and linux

@DisabledOnOs(value= {OS.MAC,OS.LINUX})
//we are enabling this test case to run on system that has
//JRE between 11 and 19.
@EnabledForJreRange(min=JRE.JAVA_11,max=JRE.JAVA_19)
//we are disabling this test who have system java 10.
@DisabledOnJre(value= {JRE.JAVA_10})
void TestDivision() {
	assertEquals(5, cal.division(25, 5),
			"This test method is to test division of two values");
}
@Test
//@DisplayName("Division testing with Exception")
void TestDivisionwithException()
{
	assertThrows(ArithmeticException.class, ()->cal.division(25, 0),
			"This test method is to test division of two values while throws exception");
}
@Test
void TestFactorial()
{
	System.setProperty("Job", "Developer");
	//assumeTrue("Developer".equals(System.getProperty("Job")));
	assumeFalse("Developer".equals(System.getProperty("Job")),CalculatorTest::message);
	assertEquals(120, cal.factorial(5));
}
private static String message()
{
	return "Test execution has failed!!";
}
@Test
@DisplayName("Disabled method")
@Disabled
void testdisabled()
{
	fail("This test should be disabled");
}
}
