package com.eliteevince.calculatoroperation;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ResponseBody
@RequestMapping
public class CalculatorOperationController {


    @RequestMapping("/sum/{a}/{b}")
    public Double addition(@PathVariable Double a, @PathVariable Double b) {
        if (null != a && null != b) {
            return a + b;
        }
        return 0.0;
    }

    @RequestMapping("/sub/{a}/{b}")
    public Double substraction(@PathVariable Double a, @PathVariable Double b) {
        if (null != a && null != b) {
            return a - b;
        }
        return 0.0;
    }

    @RequestMapping("/mul/{a}/{b}")
    public Double multiplication(@PathVariable Double a, @PathVariable Double b) {
        if (null != a && null != b) {
            return a * b;
        }
        return 0.0;
    }

    @RequestMapping("/div/{a}/{b}")
    public Double division(@PathVariable Double a, @PathVariable Double b) {
        if (null != a && null != b) {
            return a / b;
        }
        return 0.0;
    }
}
