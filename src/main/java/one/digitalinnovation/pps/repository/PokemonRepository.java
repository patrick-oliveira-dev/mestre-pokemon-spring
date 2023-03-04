package one.digitalinnovation.pps.repository;

import one.digitalinnovation.pps.model.Pokemon;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PokemonRepository extends CrudRepository<Pokemon, Long> {
}
