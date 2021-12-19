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
    private String headingImg;

    public Program toProgram() {
        Program program = new Program();
        program.setTitle(title);
        program.setContent(content);
        program.setReceiver(receiver);
        program.setCurrentAmount(currentAmount);
        program.setTotalAmount(totalAmount);
        program.setStartDate(startDate);
        program.setEndDate(endDate);
        program.setStatus(status);
        program.setHeadingImg(headingImg);
        return program;
    }
}
