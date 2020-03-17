package com.eliteevince.calculatorservices;

import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

@Controller
@RequestMapping("/")

public class CalculatorController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/")
    public String viewPage() {
        return "viewPage";
    }

    @RequestMapping(value = "/math-sum", method = RequestMethod.GET)
    public String sum(@RequestParam Double a, @RequestParam Double b, Map<String, Object> model) {
        Double forObject = restTemplate.getForObject("http://localhost:8080/calculator-operation/sum/" + a + "/" + b, Double.class);
        model.put("answer", "Addition:- " + forObject);
        return "viewPage";
    }

    @RequestMapping(value = "/math-sub", method = RequestMethod.GET)
    public String sub(@RequestParam Double a, @RequestParam Double b, Map<String, Object> model) {
        Double forObject = restTemplate.getForObject("http://localhost:8080/calculator-operation/sub/" + a + "/" + b, Double.class);
        model.put("answer", "Substraction:- " + forObject);
        return "viewPage";
    }

    @RequestMapping(value = "/math-multi", method = RequestMethod.GET)
    public String multi(@RequestParam Double a, @RequestParam Double b, Map<String, Object> model) {
        Double forObject = restTemplate.getForObject("http://localhost:8080/calculator-operation/mul/" + a + "/" + b, Double.class);
        model.put("answer", "Multiplication:- " + forObject);
        return "viewPage";
    }

    @RequestMapping(value = "/math-div", method = RequestMethod.GET)
    public String div(@RequestParam Double a, @RequestParam Double b, Map<String, Object> model) {
        Double forObject = restTemplate.getForObject("http://localhost:8080/calculator-operation/div/" + a + "/" + b, Double.class);
        model.put("answer", "Division:- " + forObject);
        return "viewPage";
    }
}
