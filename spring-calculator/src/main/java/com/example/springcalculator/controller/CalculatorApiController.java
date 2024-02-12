package com.example.springcalculator.controller;

import com.example.springcalculator.component.Calculator;
import com.example.springcalculator.dto.Req;
import com.example.springcalculator.dto.Res;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class CalculatorApiController {
    
    private final Calculator calculator = null;

    @GetMapping("")
    public int sum(@RequestParam int x, @RequestParam int y){
        return calculator.sum(x, y);
    }
    
//    @GetMapping("/minus")
    @PostMapping("/minus")
    public Res minus(@RequestBody Req req){

        int result = calculator.minus(req.getX(), req.getY());

        Res res = new Res();
        res.setResult(result);
        res.setResponse(new Res.Body());

        return res;
    }
}
