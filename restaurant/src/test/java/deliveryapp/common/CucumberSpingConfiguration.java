package deliveryapp.common;

import deliveryapp.RestaurantApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { RestaurantApplication.class })
public class CucumberSpingConfiguration {}
