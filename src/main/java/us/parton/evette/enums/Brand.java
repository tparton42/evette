package us.parton.evette.enums;

public enum Brand {
    BMW ("BMW"),
    BYD ("BYD"),
    CADILLAC ("Cadillac"),
    CHRYSLER ("Chrysler"),
    FISKER ("Fisker"),
    FORD ("Ford"),
    GM ("General Motors"),
    HONDA ("Honda"),
    HYUNDAI ("Hyundai"),
    JEEP ("Jeep"),
    LORDSTOWN ("Lordstown Motors"),
    NIKOLA ("Nikola"),
    NISSAN ( "Nissan" ),
    RIVIAN ("Rivian"),
    TESLA ("Tesla"),
    TOYOTA ("Toyota")
    ;

    private String description;

    private Brand(String description) {
        this.description = description.trim();
    }

    public String getDescription() {
        return description;
    }
}
