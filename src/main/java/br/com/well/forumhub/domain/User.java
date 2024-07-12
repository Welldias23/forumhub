package br.com.well.forumhub.domain;

import br.com.well.forumhub.dto.UserDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Table(name = "users")
@Entity(name = "User")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String login;
    private String password;
    @OneToMany
    private List<Topic> topics = new ArrayList<>();
    public User(UserDto user) {
        this.login = user.login();
        this.password = user.password();
    }
}
