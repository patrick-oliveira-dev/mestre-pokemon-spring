package one.digitalinnovation.pps.controller;

import one.digitalinnovation.pps.model.MestrePokemon;
import one.digitalinnovation.pps.service.MestrePokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("mestres" )
public class MestrePokemonController {
    @Autowired
    private MestrePokemonService mestrePokemonService;

    @GetMapping
    public ResponseEntity<Iterable<MestrePokemon>> findAllMestres() {
        return ResponseEntity.ok(mestrePokemonService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<MestrePokemon> findById(@PathVariable Long id) {
        return ResponseEntity.ok(mestrePokemonService.findById(id));
    }

    @PostMapping
    public ResponseEntity<MestrePokemon> save(@RequestBody MestrePokemon mestrePokemon) {
        mestrePokemonService.save(mestrePokemon);
        return ResponseEntity.ok(mestrePokemon);
    }

    @PutMapping("/{id}")
    public ResponseEntity<MestrePokemon> update(@PathVariable Long id, @RequestBody MestrePokemon mestrePokemon) {
        mestrePokemonService.update(id, mestrePokemon);
        return ResponseEntity.ok(mestrePokemon);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        mestrePokemonService.delete(id);
        return ResponseEntity.ok().build();
    }
}
