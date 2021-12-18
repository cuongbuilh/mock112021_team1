package com.vti.mock.dto;

import com.vti.mock.model.Donate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DonateDto {
    private int id;
    private UserDto user;
    private BigDecimal amount;
    private LocalDateTime time;
    private String method;

    public DonateDto(Donate donate) {
        this.id = donate.getId();
        this.user = new UserDto(donate.getUser());
        this.amount = donate.getAmount();
        this.time = donate.getTime();
        this.method = donate.getMethod();
    }
}
