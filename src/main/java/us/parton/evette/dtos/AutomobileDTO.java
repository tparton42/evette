package us.parton.evette.dtos;

import java.util.UUID;

public class AutomobileDTO {

    // brand, i.e. Honda, Tesla
    private String brand;

    // model: i.e. Odyssey, S, 3, X, Y
    private String model;

    // Model year of this vehicle
    private int modelYear;

    private String color;

    public AutomobileDTO(String brand, String model, int modelYear, String color) {
        this.brand = brand;
        this.model = model;
        this.modelYear = modelYear;
        this.color = color;
    }

    /*** Getter and Setters ***/
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
