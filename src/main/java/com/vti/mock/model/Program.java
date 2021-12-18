package com.vti.mock.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "program", catalog = "mock_t11")
public class Program {
    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "title", length = 256, nullable = false)
    private String title;

    @Column(name = "content", nullable = false,length = 3600)
    private String content;

    @Column(name = "avatar", length = 800, nullable = false)
    private String avatar;

    @Column(name = "receiver", length = 256, nullable = false)
    private String receiver;

    @Column(name = "currentAmount")
    private BigDecimal currentAmount;

    @Column(name = "totalAmount")
    private BigDecimal totalAmount;

    @Column(name = "startDate")
    private LocalDate startDate;

    @Column(name = "endDate")
    private LocalDate endDate;

    @Column(name = "status", length = 24, nullable = false)
    private String status;

    @OneToMany(mappedBy = "program")
    List<Donate> contributes;

    @OneToMany(mappedBy = "program")
    List<Images> images;
}
