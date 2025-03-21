package me.dio.controller.dto;

import me.dio.domain.model.Card;

import java.math.BigDecimal;

public record CardDto(Long id, String number, BigDecimal limit) {

    public CardDto(Card model) {
        this(model.getId(), model.getNumber(), model.getLimit());
    }

    public Card toModel() {
        // Se a classe Card tiver um construtor adequado, use-o diretamente.
        return new Card(id, number, limit);
    }
}
