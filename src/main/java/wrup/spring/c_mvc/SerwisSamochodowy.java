package wrup.spring.c_mvc;

/**
 * @author Wiktor Rup
 */
public class SerwisSamochodowy {

    private final RepozytoriumSamochodów repozytoriumSamochodów;

    SerwisSamochodowy(RepozytoriumSamochodów repozytoriumSamochodów) {
        this.repozytoriumSamochodów = repozytoriumSamochodów;
    }

    Samochód wynajmijSamochódPoId(Long id) {
        return repozytoriumSamochodów.wynajmijSamochódPoId(id);
    }

    public Samochód wynajmijSamochódPoNazwie(String name) {
        return repozytoriumSamochodów.wynajmijSamochódPoNazwie(name);
    }
}
