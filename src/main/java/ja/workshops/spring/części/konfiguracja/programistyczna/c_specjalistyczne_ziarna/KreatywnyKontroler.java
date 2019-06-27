package ja.workshops.spring.części.konfiguracja.programistyczna.c_specjalistyczne_ziarna;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Kontroler - w aplikacjach webowych bramka wejściowa do aplikacji.
 * Pobiera dane od użytkownika, oraz zwraca odpowiedni widok - HTML.
 *
 * <p><i>W imię prezentacji HTML jest zaszyty w zmiennej. Na projekcie tak nie róbcie ;(</i></p>
 * <br/>
 *
 * Q: What did the server say to his client who was having a bad day?
 * <br/>...<br/>
 * A: Everything's going to be 200
 *
 * @author Wojciech Makiela
 */
@Controller
class KreatywnyKontroler {

    private static final String HTML = "<!DOCTYPE html>\n" +
           "<html>\n" +
            "<head>\n" +
            "    <title>Akademia Java</title>\n" +
            "</head>\n" +
            "<body>\n" +
            "\n" +
            "<h1>No siema %s</h1>\n" +
            "\n" +
            "</body>\n" +
            "</html>\n";

    private SuperSerwis serwis;
    private int idOsoby = 0;

    public KreatywnyKontroler(SuperSerwis superSerwis) {
        System.out.println(this.getClass().getName() + " - Konstruktor");
        this.serwis = superSerwis;
    }

    @GetMapping(path = "programistyczna")
    private ResponseEntity<?> pobierzDane() {
        return ResponseEntity.ok(String.format(HTML, serwis.pobierzImieOsoby(idOsoby++)));
    }

}
