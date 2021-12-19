package com.vti.mock.form.donate;

import com.vti.mock.model.Donate;
import com.vti.mock.repository.ProgramRepository;
import com.vti.mock.repository.UserRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class UpdateDonateForm {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private ProgramRepository programRepository;

    private int userID;
    private int programId;
    private BigDecimal amount;
    private LocalDateTime time;
    private String method;

    public Donate toDonate(){
        Donate donate = new Donate();
        donate.setUser(userRepository.getById(userID));
        donate.setProgram(programRepository.getById(programId));
        donate.setAmount(amount);
        donate.setTime(time);
        donate.setMethod(method);
        return donate;
    }
}
