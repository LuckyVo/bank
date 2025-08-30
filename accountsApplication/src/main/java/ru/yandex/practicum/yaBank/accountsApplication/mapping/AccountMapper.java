package ru.yandex.practicum.yaBank.accountsApplication.mapping;

import org.springframework.stereotype.Component;
import ru.yandex.practicum.yaBank.accountsApplication.dto.AccountDto;
import ru.yandex.practicum.yaBank.accountsApplication.entities.Account;

@Component
public class AccountMapper {

    public AccountDto toDto(Account account) {
        if (account == null) {
            return null;
        }

        return AccountDto.builder()
                .balance(account.getBalance().doubleValue())
                .accountNumber(account.getNumber())
                .currency(account.getCurrency())
                .build();
    }
}
