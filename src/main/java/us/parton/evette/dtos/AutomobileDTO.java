package us.parton.evette.dtos;

import com.fasterxml.jackson.databind.ObjectMapper;
import us.parton.evette.enums.Brand;
import us.parton.evette.enums.Colors;

public class AutomobileDTO {

    // brand, i.e. Honda, Tesla
    private Brand brand;

    // model: i.e. Odyssey, S, 3, X, Y
    private String model;

    // Model year of this vehicle
    private int modelYear;

    private Colors color;

    public AutomobileDTO(Brand brand, String model, int modelYear, Colors color) {
        this.brand = brand;
        this.model = model;
        this.modelYear = modelYear;
        this.color = color;
    }

    /*** Getter and Setters ***/
    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getModelYear() {
        return modelYear;
    }

    public void setModelYear(int modelYear) {
        this.modelYear = modelYear;
    }

    public Colors getColor() {
        return color;
    }

    public void setColor(Colors color) {
        this.color = color;
    }

    @Override
    public String toString() {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writerWithDefaultPrettyPrinter();
        String strOut = "{}";

        try {
            strOut = objectMapper.writeValueAsString(this);
        } catch (Exception ex) {
            System.out.println("Unable to convert _this_ to JSON via ObjectMapper.");
        }

        return strOut;
    }
}
