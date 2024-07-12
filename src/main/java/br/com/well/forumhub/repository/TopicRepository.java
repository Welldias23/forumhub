package br.com.well.forumhub.repository;

import br.com.well.forumhub.domain.Topic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TopicRepository extends JpaRepository<Topic, Long> {
}
