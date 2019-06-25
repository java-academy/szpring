package ja.workshops.spring.części.konfiguracja.xml.c_mvc;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Warstwa kontrolera wzorca Model-Widok-Kontroler.
 * Poniższa implementacja jest odwzorowaniem warstwy odpowiedzialnej za przekazywanie, wymianę danych pomiędzy modelem (który łączy się z bazą danych) oraz widokiem,
 * czyli warstwą do prezentacji otrzymanych danych. Często obsługuje również zapytania użytkownika.
 *
 * W tym przypadku kontroler pobiera z modelu dane (samochód wyciągnięty przez serwis z bazy danych), a następnie wysyła je do warstwy widoku.
 * Warstwą widoku w tym wypadku (czyli tym, co jest prezentowane użytkownikowi) jest tak naprawdę plik {@code widok.jsp} w katalogu {@code webapp.WEB-INF.views.widok.jsp}.
 *
 * @author Wiktor Rup
 */
public class KomisKontroler extends AbstractController {

    private final SerwisSamochodowy serwisSamochodowy;
    private long carId = 0;

    public KomisKontroler(SerwisSamochodowy serwisSamochodowy) {
        this.serwisSamochodowy = serwisSamochodowy;
    }


    protected ModelAndView handleRequestInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {

        ModelAndView model = new ModelAndView("widok");
        model.addObject("message", serwisSamochodowy.wynajmijSamochódPoId(++carId));

        return model;
    }
}
