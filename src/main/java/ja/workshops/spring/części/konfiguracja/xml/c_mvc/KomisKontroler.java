package ja.workshops.spring.części.konfiguracja.xml.c_mvc;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Kontroler, w którym wyszukany w bazie samochód zostaje przekazany jako atrybut modelu. Model zostaje zwrócony jako widok strony {@code widok.jsp}
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
