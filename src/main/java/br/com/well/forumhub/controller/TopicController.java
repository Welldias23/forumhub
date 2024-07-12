package br.com.well.forumhub.controller;

import br.com.well.forumhub.domain.Topic;
import br.com.well.forumhub.dto.TopicDto;
import br.com.well.forumhub.repository.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("topics")
public class TopicController {

    @Autowired
    private TopicRepository repository;

    @PostMapping
    public void registerTopic(@RequestBody TopicDto topic) {
        repository.save(new Topic(topic));
    }
}
