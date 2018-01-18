package pl.coderslab.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ CalculatorTest.class, Calculator2Test.class, SimpleSampleTest.class,
	FirstTest.class, FactorsTest.class, MaxValueTest.class, UserRepositoryTest.class, SimpleCalculatorTest.class })
public class AllTests {

}
