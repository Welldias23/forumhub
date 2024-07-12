package br.com.well.forumhub.dto;

import br.com.well.forumhub.domain.User;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.Date;

public record TopicDto(
        @NotBlank
        String titulo,
        @NotBlank
        String mensagem,
        @NotNull
        Date dataDeCriacao,
        @NotNull
        Integer usuarioId,
        @NotBlank
        String curso
) {
}
