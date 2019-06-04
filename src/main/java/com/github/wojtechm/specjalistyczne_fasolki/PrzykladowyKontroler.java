package com.github.wojtechm.specjalistyczne_fasolki;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Wojciech Makiela
 */

@RestController
class PrzykładowyKontroler {

    public PrzykładowyKontroler() {
        System.out.println("`````````````````````````````````````````````````````````````````````````````````````````Wonsz``````````````````````````````````````````````");
    }

    @GetMapping(path = "/index")
    private ResponseEntity<?> pobierzDane() {
        System.out.println("`````````````````````````````````````````````````````````````````````````````````````````HEHEHESZKI``````````````````````````````````````````````");
        return ResponseEntity.ok("Witaj Świecie");
    }
}
