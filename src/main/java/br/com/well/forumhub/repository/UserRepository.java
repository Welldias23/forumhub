package br.com.well.forumhub.repository;

import br.com.well.forumhub.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
