import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(plugin = {"pretty"}, features ="C:\\Users\\Pavan.Kopparapu\\Downloads\\Exam2503 (1)\\Exam2503\\src\\test\\resources\\Features", glue = "StepDefinition")
public class CucumberSuite {
}
