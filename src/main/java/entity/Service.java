package entity;

public enum Service {
    Manicure("MANICURE"),
    Pedicure("PEDICURE"),
    EyebrowColoring("EYEBROW COLORING"),
    LaminationOfEyebrows("LAMINATION OF EYEBROWS"),
    EyebrowCorrection("EYEBROW CORRECTION");

    private String name;

    Service(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
