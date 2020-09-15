package utilities;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
//        features ="/Users/gangeshsingh/Desktop/Gangesh/Java/IdeaProjects/CucumberProject/src/test/java/Features",
        features="src/test/java/Features",

        glue={"StepDefinitions"},
//       tags={"~@End2End , ~@Sanity , ~@SmokeTest"},  // Exclude End2End, Sanity OR Smoke test
//       tags={"~@End2End"},                               // Exclude the End2End test
//       tags={"@sanity"},                                // Run the Sanity tags
//        tags={"@SmokeTest , @RegressionTest"},           // Run Smoke Test OR Regression Test
//       tags={"@SmokeTest" , "@RegressionTest"},         // Run Smoke Test AND Regression Test

       dryRun = false,          // Run the tests
//      dryRun = true,           // To check the mapping between feature file and Step definition
//        tags = {},
        monochrome = true,       // To display the output in readable format
        strict = true,           // To check if any step is not defined in step definition file
        format = {"pretty", "html:target/destination" + ""}
)

public class TestRunner {


}
