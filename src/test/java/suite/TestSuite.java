package suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import test.BuyProductTest;
import test.LoginTest;

@RunWith(Suite.class)
@SuiteClasses({
	LoginTest.class,
	BuyProductTest.class,
})
public class TestSuite {
	
}
