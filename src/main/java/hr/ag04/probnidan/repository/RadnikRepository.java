package hr.ag04.probnidan.repository;

import hr.ag04.probnidan.domain.Radnik;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RadnikRepository extends CrudRepository<Radnik, Long> {

    Radnik save(Radnik radnik);
    List<Radnik> findAll();
}
