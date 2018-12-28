package com.crud.demo.mapper;

import com.crud.demo.domain.Autor;
import com.crud.demo.dto.AutorDto;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class AutorMapper {

    public AutorDto toAutorDto(Autor autor) {
        AutorDto autorDto = new AutorDto();
        autorDto.setCodigo(autor.getCodigo());
        autorDto.setNome(autor.getNome());
        return autorDto;
    }

    public Autor toAutor(AutorDto autorDto) {
        Autor autor = new Autor();
        autor.setCodigo(autorDto.getCodigo());
        autor.setNome(autorDto.getNome());
        return autor;
    }

    public Autor toAutorUpdate(Autor autor, AutorDto autorDto) {
        autor.setCodigo(autorDto.getCodigo());
        autor.setNome(autorDto.getNome());
        return autor;
    }

    public List<AutorDto> toListAutorDto(List<Autor> autores) {

        List<AutorDto> autorDto = new ArrayList<AutorDto>();
        for (Autor autor : autores
        ) {
            autorDto.add(toAutorDto(autor));
        }
        return autorDto;
    }
}
