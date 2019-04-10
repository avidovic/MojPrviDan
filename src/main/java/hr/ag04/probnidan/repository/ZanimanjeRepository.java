package hr.ag04.probnidan.repository;

import hr.ag04.probnidan.domain.Zanimanje;
import org.springframework.data.repository.CrudRepository;

public interface ZanimanjeRepository extends CrudRepository<Zanimanje, Long> {

    Zanimanje save(Zanimanje zanimanje);
}
