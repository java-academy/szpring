package ja.workshops.spring.części.konfiguracja.xml.c_mvc;

/**
 * Łącznik, który wyciąga dane z repozytorium {@link RepozytoriumSamochodów} i udostępnia je warstwie prezentacji poprzez {@link KomisKontroler}.
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
