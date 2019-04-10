package hr.ag04.probnidan.service;

import hr.ag04.probnidan.domain.Radnik;
import hr.ag04.probnidan.repository.RadnikRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RadnikService {

    @Autowired
    private RadnikRepository radnikRepository;

    public Radnik saveRadnik(Radnik radnik) {
        return radnikRepository.save(radnik);
    }

    public List<Radnik> findAll() { return radnikRepository.findAll(); }
}
