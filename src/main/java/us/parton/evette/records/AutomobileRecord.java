package us.parton.evette.records;

import us.parton.evette.enums.Brand;
import us.parton.evette.enums.Colors;

import java.io.Serializable;

public record AutomobileRecord(Brand brand, String model, int modelYear, Colors color) implements Serializable {

}
