package one.digitalinnovation.pps.repository;

import one.digitalinnovation.pps.model.MestrePokemon;
import one.digitalinnovation.pps.service.MestrePokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

@Repository
public interface MestrePokemonRepository extends CrudRepository<MestrePokemon, Long> {
}
