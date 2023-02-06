package org.stepdefinition;

import org.base.Base;
import org.junit.After;
import org.junit.Before;

public class Hooks extends Base {

	@Before
	public void bef() {
		System.out.println("Before Scenario");
		launchBrowser();
		maximize();

	}

	@Before
	public void bef1() {

	}

	@After
	public void aft() {
		System.out.println("After Scenario");
		Quit();
	}

}
