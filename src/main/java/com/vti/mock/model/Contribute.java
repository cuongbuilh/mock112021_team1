package com.vti.mock.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "contribute", catalog = "mock_t11")
@NoArgsConstructor
@AllArgsConstructor
public class Contribute {
    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "userId", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "programId", nullable = false)
    private Program program;

    @Column(name = "amount")
    private BigDecimal amount;

    @Column(name = "time")
    private LocalDateTime time;

    @Column(name = "method", length = 56, nullable = false)
    private String method;
}
