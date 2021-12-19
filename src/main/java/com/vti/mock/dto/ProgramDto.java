package com.vti.mock.dto;

import com.vti.mock.model.Program;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProgramDto {
    private int id;
    private String title;
    private String content;
    private String receiver;
    private BigDecimal currentAmount;
    private BigDecimal totalAmount;
    private LocalDate startDate;
    private LocalDate endDate;
    private String status;
    private List<DonateDto> donates;
    private String headingImg;
    private List<String> images;

    public ProgramDto(Program program){
        this.id = program.getId();
        this.title = program.getTitle();
        this.content = program.getContent();
        this.receiver = program.getReceiver();
        this.currentAmount = program.getCurrentAmount();
        this.totalAmount = program.getTotalAmount();
        this.startDate = program.getStartDate();
        this.endDate = program.getEndDate();
        this.status = program.getStatus();
        headingImg = program.getHeadingImg();

        this.donates = new ArrayList<>();
        program.getDonates().forEach(donate -> {
            donates.add(new DonateDto(donate));
        });

        this.images = new ArrayList<>();
        program.getImages().forEach(image -> {
            images.add(image.getLink());
        });

    }
}
