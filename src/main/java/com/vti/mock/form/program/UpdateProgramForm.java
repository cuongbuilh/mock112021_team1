package com.vti.mock.form.program;

import com.vti.mock.model.Program;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UpdateProgramForm {
    private String title;
    private String content;
    private String receiver;
    private BigDecimal currentAmount;
    private BigDecimal totalAmount;
    private LocalDate startDate;
    private LocalDate endDate;
    private String status;

    public Program toProgram() {

        return new Program();
    }
}
