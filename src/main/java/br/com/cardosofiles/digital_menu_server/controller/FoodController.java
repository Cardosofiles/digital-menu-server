package br.com.cardosofiles.digital_menu_server.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("food")
public class FoodController {
    @GetMapping
    public void getAll(){

    }
}
