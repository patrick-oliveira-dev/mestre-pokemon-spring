package one.digitalinnovation.pps.service;

import one.digitalinnovation.pps.model.Pokemon;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "pokeapi", url = "https://pokeapi.co/api/v2/pokemon")
public interface PokeApiService {
    @GetMapping("/{id}/")
    Pokemon getPokemon(@PathVariable("id") Long id);
}
