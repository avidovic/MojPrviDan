package hr.ag04.probnidan.controller;


import hr.ag04.probnidan.domain.Zanimanje;
import hr.ag04.probnidan.service.ZanimanjeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ZanimanjaController {

    @Autowired
    private ZanimanjeService service;

    @RequestMapping(value = "/zanimanja", method = RequestMethod.POST)
    public void dodajZanimanje(@RequestBody Zanimanje zanimanje) {
        service.saveZanimanje(zanimanje);
    }

}
