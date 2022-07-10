package us.parton.evette;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import us.parton.evette.dtos.AutomobileDTO;
import us.parton.evette.recordsets.AutomobileRecord;

@SpringBootApplication
public class EvetteApplication {

    public static void main(String[] args) {
        SpringApplication.run(EvetteApplication.class, args);


        // Define an Automobile as a Java Record
        AutomobileRecord tm3Record = new AutomobileRecord("Tesla", "3", 2018, "blue");

        // Define an Automobile as a DTO (POJO)
        AutomobileDTO tm3DTO = new AutomobileDTO("Tesla", "3", 2018, "blue");

    }

}
