package cz.engeto.wedding.controller;

import cz.engeto.wedding.model.Gift;
import cz.engeto.wedding.service.ReadService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class GiffController {

    private final List<Gift> listOfGiff = new ArrayList<>();

    private boolean isListOpen = true;

    private final ReadService readService;

    @GetMapping
    public Boolean getStateOfList() {
        return isListOpen;
    }

    @GetMapping(value = "/open")
    public Boolean openList() {
        this.isListOpen = true;
        return isListOpen;
    }

    @GetMapping(value = "/close")
    public Boolean closeList() {
        this.isListOpen = false;
        return isListOpen;
    }

    @GetMapping(value = "/list")
    public List<Gift> getAllGiffInList() {
        return listOfGiff;
    }

    @PutMapping(value = "/list")
    public ResponseEntity addOneGiff(@RequestBody Gift gift) {
        if (gift.getPrice() > readService.getPrice()) {
            return new ResponseEntity(HttpStatus.CONFLICT);
        }
        listOfGiff.add(gift);
        return new ResponseEntity(HttpStatus.OK);
    }

    @DeleteMapping(value = "/list")
    public void deleteOneGiff(@RequestBody Long idItem) {
        Optional<Gift> first = listOfGiff.stream()
                .filter((oneElement) ->
                        {
                            System.out.println(oneElement.getId() == idItem);
                            return oneElement.getId() == idItem;
                        }
                ).findFirst();

        System.out.println(first.isEmpty());
        this.listOfGiff.remove(listOfGiff.indexOf(first.get()));
    }

    @PutMapping(value = "/list/giff")
    public void updateGiff(@RequestBody Gift gift) {
        Optional<Gift> first = listOfGiff.stream()
                .filter((oneElement) ->
                        {
                            System.out.println(oneElement.getId() == gift.getId());
                            return oneElement.getId() == gift.getId();
                        }
                ).findFirst();

        this.listOfGiff.remove(first.get());
        this.listOfGiff.add(gift);
    }

    @GetMapping(value = "/list/giff/{id}")
    public Gift getOneGiff(@PathVariable("id") Long id) {
        Optional<Gift> first = listOfGiff.stream()
                .filter((oneElement) ->
                        {
                            System.out.println(oneElement.getId() == id);
                            return oneElement.getId() == id;
                        }
                ).findFirst();

        return first.get();
    }


}
