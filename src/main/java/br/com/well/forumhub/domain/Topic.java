package br.com.well.forumhub.domain;

import br.com.well.forumhub.dto.TopicDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;

@Table(name = "topcs")
@Entity(name = "Topc")
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Topic {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String mensagem;
    private Date dataDeCriacao;
    @ManyToOne
    private User usuarioId;
    private String curso;

    public Topic(TopicDto topic) {
        this.titulo = topic.titulo();
        this.mensagem = topic.mensagem();
        this.dataDeCriacao = topic.dataDeCriacao();
        this.usuarioId = topic.usuarioId();
        this.curso = topic.curso();
    }
}
