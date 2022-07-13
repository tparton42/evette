package us.parton.evette.enums;

public enum Colors {
    WHITE ("White" ),
    BLACK ("Black"),
    BLUE ("Blue" ),
    BURNT_ORANGE ("Burnt Orange"),
    FORREST_GREEN ("Forrest Green"),
    GRAPHITE ("Graphite"),
    GREEN ("Green"),
    NAVY ("Navy" ),
    OBSIDIAN ("Obsidian"),
    OCEAN_BLUE ("Ocean Blue"),
    PASSION_RED_BM ("Passion Red / Black Metallic"),
    PEARL_WHITE ("Pearl White"),
    RED ("Red" ),
    SILVER ("Silver"),
    TESLA_SIG_RED ("Signature Red")
    ;


    private final  String description;

    private Colors(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
