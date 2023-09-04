package pl.coderslab.task1;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/Cucumber/Features/Task1", plugin = {"pretty", "html:out.html"})

public class ShopAccountNewAddressTest {
}