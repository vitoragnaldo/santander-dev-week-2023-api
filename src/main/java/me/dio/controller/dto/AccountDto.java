package me.dio.controller.dto;

import me.dio.domain.model.Account;

import java.math.BigDecimal;

public record AccountDto(Long id, String number, String agency, BigDecimal balance, BigDecimal limit) {

    public AccountDto(Account model) {
        this(model.getId(), model.getNumber(), model.getAgency(), model.getBalance(), model.getLimit());
    }

    public Account toModel() {
        // Utiliza o construtor do Account, evitando o uso de setters, garantindo imutabilidade
        return new Account(id, number, agency, balance, limit);
    }
}
