package com.vti.mock.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "images", catalog = "mock_t11")
public class Images {
    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "link", length = 800)
    private String link;

    @ManyToOne
    @JoinColumn(name = "programId", nullable = false)
    private Program program;
}
