package com.github.wojtechm.specjalistyczne_fasolki;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Wojciech Makiela
 */

@RestController
class PrzykladowyKontroler {

    public PrzykladowyKontroler() {
        System.out.println(this.getClass().getName() + " - Konstruktor");
    }

    @GetMapping(path = "/index")
    private ResponseEntity<?> pobierzDane() {
        System.out.println(this.getClass().getName() + " - pobierz dane");
        return ResponseEntity.ok("Witaj Świecie");
    }
}
