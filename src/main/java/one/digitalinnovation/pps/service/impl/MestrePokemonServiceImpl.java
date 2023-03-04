package one.digitalinnovation.pps.service.impl;

import one.digitalinnovation.pps.model.MestrePokemon;
import one.digitalinnovation.pps.model.Pokemon;
import one.digitalinnovation.pps.repository.MestrePokemonRepository;
import one.digitalinnovation.pps.repository.PokemonRepository;
import one.digitalinnovation.pps.service.MestrePokemonService;
import one.digitalinnovation.pps.service.PokeApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MestrePokemonServiceImpl implements MestrePokemonService {
    @Autowired
    private MestrePokemonRepository mestrePokemonRepository;
    @Autowired
    private PokemonRepository pokemonRepository;
    @Autowired
    private PokeApiService pokeApiService;

    @Override
    public Iterable<MestrePokemon> findAll() {

        return mestrePokemonRepository.findAll();
    }

    @Override
    public MestrePokemon findById(Long id) {

        Optional<MestrePokemon> mestrePokemon = mestrePokemonRepository.findById(id);
        return mestrePokemon.get();
    }

    @Override
    public void save(MestrePokemon mestrePokemon) {
        saveMasterPokemonWithPokemon(mestrePokemon);
    }

    @Override
    public void update(Long id, MestrePokemon mestrePokemon) {
        // Buscar Cliente por ID, caso exista:
        Optional<MestrePokemon> mestrePokemonBd = mestrePokemonRepository.findById(id);
        if (mestrePokemonBd.isPresent()) {
            saveMasterPokemonWithPokemon(mestrePokemon);
        }
    }

    @Override
    public void delete(Long id) {
        mestrePokemonRepository.deleteById(id);
    }

    private void saveMasterPokemonWithPokemon(MestrePokemon mestrePokemon) {
        Long pokeId = mestrePokemon.getPokemon().getId();
        Pokemon pokemon = pokemonRepository.findById(pokeId).orElseGet(() -> {
            Pokemon newPokemon = pokeApiService.getPokemon(pokeId);
            pokemonRepository.save(newPokemon);
            return newPokemon;
        });

        mestrePokemon.setPokemon(pokemon);
        mestrePokemonRepository.save(mestrePokemon);
    }
}
