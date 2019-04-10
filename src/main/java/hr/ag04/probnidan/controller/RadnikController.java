package hr.ag04.probnidan.controller;

import hr.ag04.probnidan.domain.Radnik;
import hr.ag04.probnidan.service.RadnikService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class RadnikController {

    @Autowired
    private RadnikService service;


    @RequestMapping(value = "/radnici", method = RequestMethod.POST)
    public void dodajRadnika(@RequestBody Radnik radnik) {
        service.saveRadnik(radnik);
    }

    @RequestMapping(value = "/izvjestaj", method = RequestMethod.GET)
    public List<Radnik> izvjestaj() {
        return service.findAll();
    }

    @RequestMapping(value= "/all")
    public String all(Model model) {
        List<Radnik> listaRadnika = service.findAll();
        model.addAttribute("lista", listaRadnika);
        return "all.html";
    }

}
