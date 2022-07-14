package us.parton.evette;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import us.parton.evette.dtos.AutomobileDTO;
import us.parton.evette.enums.Brand;
import us.parton.evette.enums.Colors;
import us.parton.evette.records.AutomobileRecord;

import java.util.HashMap;

@SpringBootApplication
public class EvetteApplication {

    public static void main(String[] args) {
        SpringApplication.run(EvetteApplication.class, args);


        // Get a map of Tesla models as Java Records
        HashMap<String, AutomobileRecord> teslaModels = getTeslaModels();

        // Get a map of Nissan's EV's as based on AutomobileDTO
        HashMap<String, AutomobileDTO> nissanModels = getNissanModels();

        // Print out our Tesla and Nissan Models
        System.out.println("Tesla Models:\n" + teslaModels);

        System.out.println("Nissan Models:\n" + nissanModels);
    }

    private static HashMap<String, AutomobileRecord> getTeslaModels() {
        HashMap<String, AutomobileRecord> teslaModels = new HashMap<>();
        teslaModels.put("S", new AutomobileRecord(Brand.TESLA, "S", 2012, Colors.TESLA_SIG_RED) );
        teslaModels.put("3", new AutomobileRecord(Brand.TESLA, "3", 2017, Colors.NAVY) );
        teslaModels.put("X", new AutomobileRecord(Brand.TESLA, "X", 2016, Colors.BLACK) );
        teslaModels.put("Y", new AutomobileRecord(Brand.TESLA, "Y", 2020, Colors.WHITE) );

        return teslaModels;
    }

    private static HashMap<String, AutomobileDTO> getNissanModels() {
        HashMap<String, AutomobileDTO> nissanModels = new HashMap<>();
        nissanModels.put("Leaf", new AutomobileDTO(Brand.NISSAN, "SL", 2010, Colors.OCEAN_BLUE) );
        nissanModels.put("Ariya", new AutomobileDTO(Brand.NISSAN, "Platinum+", 2023, Colors.PASSION_RED_BM) );

        return nissanModels;
    }

}
