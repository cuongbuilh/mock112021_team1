package com.vti.mock.form.donate;

import com.vti.mock.model.Donate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UpdateDonateForm {
    private int userID;
    private int programId;
    private BigDecimal amount;
    private LocalDateTime time;
    private String method;

    public Donate toDonate(){
        return new Donate();
    }
}
