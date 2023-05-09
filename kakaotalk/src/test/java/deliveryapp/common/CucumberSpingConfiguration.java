package deliveryapp.common;

import deliveryapp.KakaotalkApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { KakaotalkApplication.class })
public class CucumberSpingConfiguration {}
