package steps;

import base.BaseUtil;
import cucumber.api.CucumberOptions;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * @author edufelizardo1@gmail.com
 * @version 1.0.0
 * Created by BRP...-PC on 30/10/2021
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features/Login.feature",
        glue = {"steps"},
        plugin = "pretty",
        monochrome = true
        )
public class Hook extends BaseUtil {

//    private BaseUtil base;
//
//    public Hook(BaseUtil base) {
//        this.base = base;
//    }
//
//    @Before
//    public void InitializeTest(Scenario scenario) {
//        System.out.println("Opening the browser: Mock");
//
//        base.StepInfo = "GoogleChromeDriver";
//    }
//    @After
//    public void TearDownTest(Scenario scenario) {
//        if (scenario.isFailed()) {
//            System.out.println(scenario.getName());
//        }
//        System.out.println("Close the browser: Mock");
//    }
}
