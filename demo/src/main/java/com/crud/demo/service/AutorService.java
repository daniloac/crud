package com.crud.demo.service;

import com.crud.demo.domain.Autor;
import com.crud.demo.dto.AutorDto;
import com.crud.demo.mapper.AutorMapper;
import com.crud.demo.repository.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AutorService {

    @Autowired
    private AutorRepository autorRepository;
    @Autowired
    private AutorMapper autorMapper;

    public List<AutorDto> listAutores() {
        return autorMapper.toListAutorDto(autorRepository.findAll());
    }

    public AutorDto getAutor(final Integer codigo) {
        return autorMapper.toAutorDto(autorRepository.findByCodigo(codigo));
    }

    public Integer deleteAutor(final Integer codigo) {
        autorRepository.deleteAutorByCodigo(codigo);
        return codigo;
    }

    public AutorDto updateAutor(final AutorDto autorDto) {
        Autor autor = autorRepository.findByCodigo(autorDto.getCodigo());
        return autorMapper.toAutorDto(autorRepository.save(autorMapper.toAutorUpdate(autor, autorDto)));
    }

    public AutorDto saveAutor(final AutorDto autor) {
        return autorMapper.toAutorDto(autorRepository.save(autorMapper.toAutor(autor)));
    }
}
