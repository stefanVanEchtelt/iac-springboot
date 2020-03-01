package com.springboot.iac;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.Map;

@RestController
public class TestController {

    @RequestMapping("/current-date")
    public LocalDate getAllPages() {
        return LocalDate.now();
    }

    @RequestMapping(value = "/welcome", method = RequestMethod.POST)
    public String welcome(@RequestBody Map<String, Object> payload) {
        return "Welkom " + payload.get("name");
    }
}
