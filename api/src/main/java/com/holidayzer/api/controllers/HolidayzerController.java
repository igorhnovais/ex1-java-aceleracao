package com.holidayzer.api.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/holidays")
public class HolidayzerController {
    
    String[] datas = {"01-01-2024", "12-02-2024", "13-02-2024", "29-03-2024", "21-04-2024", "01-05-2024", "30-05-2024", "07-09-2024", "12-10-2024", "02-11-2024", "15-11-2024", "20-11-2024", "25-12-2024"};
    String[] names = {"Confraternização Mundial", "Carnaval", "Carnaval", "Sexta-feira Santa", "Tiradentes", "Dia do Trabalho", "Corpus Christi", "Independência do Brasil", "Nossa Senhora Aparecida", "Finados", "Proclamação da República", "Dia Nacional de Zumbi e da Consciência Negra", "Natal"};
        

    @GetMapping
    public List<String> getHolidays() {

        ArrayList<String> list = new ArrayList<String>();

        for (int i = 0; i < datas.length; i++){
            String p = datas[i]+" => "+names[i];
            list.add(p);
        }
        return list;
    }

    @GetMapping("/{data}")
    public String getHolidayByData(@PathVariable String data){
        
        for (int i = 0; i < datas.length; i++){
            if(datas[i].equals(data)){
                return "Dia "+datas[i]+" é "+names[i]+"! 🎉";
            }
        }
        
        return "Dia "+data+" não é feriado 🥲";
    } 

}
