package ja.workshop.spring.części.konfiguracja.xml.c_mvc;

/**
 * Serwis, który jest warstwą łączącą dane wyciągane z repozytorium {@link RepozytoriumSamochodów} oraz warstwą prezentacji {@link KomisKontroler}.
 *
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
}
