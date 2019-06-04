package com.github.wojtechm.specjalistyczne_fasolki;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Wojciech Makiela
 */

@Controller
@ResponseBody
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

    @Autowired
    private SuperSerwis serwis;
    private int idOsoby = 0;

    public KreatywnyKontroler() {
        System.out.println(this.getClass().getName() + " - Konstruktor");
    }

    @GetMapping(path = "/index")
    private ResponseEntity<?> pobierzDane() {
        return ResponseEntity.ok(String.format(HTML, serwis.pobierzImieOsoby(idOsoby++)));
    }

    public void setSerwis(SuperSerwis serwis) {
        this.serwis = serwis;
    }
}
