package com.crud.demo.controller;

import com.crud.demo.dto.AutorDto;
import com.crud.demo.service.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/app")
public class AutorController {

    @Autowired
    private AutorService autorService;

    @GetMapping("/autores")
    public List<AutorDto> listAutores() {
        return autorService.listAutores();
    }

    @GetMapping("/autor/{codigo}")
    public AutorDto getAutor(@PathVariable Integer codigo) {
        return autorService.getAutor(codigo);
    }

    @PostMapping("/autor/delete/{codigo}")
    public Integer deleteAutor(@PathVariable Integer codigo) {
        return autorService.deleteAutor(codigo);
    }

    @PostMapping("/autor/update")
    public AutorDto updateAutor(@RequestBody AutorDto autor) {
        return autorService.updateAutor(autor);
    }

    @PostMapping("/autor/save")
    public AutorDto saveAutor(@RequestBody AutorDto autor) {
        return autorService.saveAutor(autor);
    }
}
