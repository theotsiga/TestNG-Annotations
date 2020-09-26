package test;

import org.testng.Reporter;
import org.testng.annotations.Test;

import generics.BaseTest;

public class TestActitimeLogInAnnotation extends BaseTest {

	@Test
	public void login() 
	{
	 Reporter.log("login is executing",true);
	 Reporter.log("reports printing",true);
	}

	 
	}

