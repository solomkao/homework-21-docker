package com.solomka.docker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {

    private final Repository repository;
    private final SongRepository songRepository;

    @Autowired
    public Controller(Repository repository, SongRepository songRepository) {
        this.repository = repository;
        this.songRepository = songRepository;
    }

    @GetMapping(value = "/info")
    public List<Song> getSong(){
        var list = songRepository.findAll();
        return list;
    }

    @GetMapping(value = "/hello")
    public String getMessage(){
        return repository.getMessage();
    }
}
