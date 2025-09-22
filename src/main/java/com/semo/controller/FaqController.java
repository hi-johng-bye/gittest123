// src/main/java/com/semo/web/FaqController.java
package com.semo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FaqController {

    @GetMapping("/faq")
    public String faq() {
        return "faq/index"; // templates/faq/index.html
    }
}
