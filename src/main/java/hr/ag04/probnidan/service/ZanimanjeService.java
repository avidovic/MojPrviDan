package hr.ag04.probnidan.service;

import hr.ag04.probnidan.domain.Zanimanje;
import hr.ag04.probnidan.repository.ZanimanjeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ZanimanjeService {

    @Autowired
    private ZanimanjeRepository zanimanjeRepository;

    public Zanimanje saveZanimanje(Zanimanje zanimanje) {
        return zanimanjeRepository.save(zanimanje);
    }
}
