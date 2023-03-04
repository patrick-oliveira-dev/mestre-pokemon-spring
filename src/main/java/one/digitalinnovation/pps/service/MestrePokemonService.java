package one.digitalinnovation.pps.service;

import one.digitalinnovation.pps.model.MestrePokemon;
import one.digitalinnovation.pps.model.Pokemon;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public interface MestrePokemonService {

    Iterable<MestrePokemon> findAll();

    MestrePokemon findById(Long id);

    void save(MestrePokemon mestrePokemon);

    void update(Long id, MestrePokemon mestrePokemon);

    void delete(Long id);

}
