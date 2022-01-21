package io.dmitrikonnov.mushroomsapp;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController("/v*/mushrooms")
public class MushroomController {
/*

    @GetMapping("/")
    public Flux<ResponseEntity<Mushroom>> getAllMushrooms (){
        return mushroomService.findAllMushrooms;
    }

    @GetMapping("/{id}/")
    public Mono<ResponseEntity<Mushroom>> getMushroomById(@PathVariable("id") int id){
        return mushroomService.getById();
    }
*/

}
