package us.parton.evette.dtos;

import java.util.UUID;

public class MileageDTO {
    private UUID autoId;
    private int year;
    private int month;
    private int mileage;

    public MileageDTO(UUID autoId, int year, int month, int mileage) {
        this.autoId = autoId;
        this.year = year;
        this.month = month;
        this.mileage = mileage;
    }
}
