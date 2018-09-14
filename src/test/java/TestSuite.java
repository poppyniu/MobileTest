import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

/**
 * Created by poppy zhang on 2018/8/9..
 */
//@RunWith(Cucumber.class)
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        format = {"pretty", "html:target/html/"},
        features = {"src/test/resources" },
       tags = {"@RegisterLogin"}
)
public class TestSuite {
}
