package com.apress.prospringmvc.pizzarus.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.apress.prospringmvc.pizzarus.service.PizzaService;

@Controller
public class PizzasController {

    @Autowired
    private PizzaService pizzaService;

    @RequestMapping(value = "/pizzas.htm")
    public ModelAndView menu() {
        ModelAndView mav = new ModelAndView("pizzas");
        mav.addObject("pizzaList", this.pizzaService.findAll());
        return mav;
    }
}
