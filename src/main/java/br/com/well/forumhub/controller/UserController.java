package br.com.well.forumhub.controller;

import br.com.well.forumhub.domain.User;
import br.com.well.forumhub.dto.UserDto;
import br.com.well.forumhub.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserRepository repository;

    @PostMapping
    @Transactional
    public void registerUser(@RequestBody UserDto user) {
        repository.save(new User(user));
    }
}
