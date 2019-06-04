package com.github.wojtechm.specjalistyczne_fasolki;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Wojciech Makiela
 */

@Controller
@ResponseBody
class PrzykładowyKontroler {

    @GetMapping(path = "/")
    private ResponseEntity<?> pobierzDane() {
        return ResponseEntity.ok("Witaj Świecie");
    }
}
