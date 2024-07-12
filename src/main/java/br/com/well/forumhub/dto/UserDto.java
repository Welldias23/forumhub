package br.com.well.forumhub.dto;

import jakarta.validation.constraints.NotBlank;

public record UserDto(
        @NotBlank
        String login,

        @NotBlank
        String password) {
}
