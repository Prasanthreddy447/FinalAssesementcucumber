package RunnerFile;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		//features=".//src//test//resources/Features//ArticleNegative.feature",
		//features=".//src//test//resources/Features//Article.feature",
		features=".//src//test//resources/Features//",
		glue="StepDefinitions",
				monochrome=true,
			    dryRun=false,
		plugin= {"pretty",
				"html:target/reports/htmlreports.html",}
		
				
		)

public class ArticleCreationRunner extends AbstractTestNGCucumberTests{

}
