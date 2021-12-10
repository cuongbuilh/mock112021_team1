package com.vti.mock.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Email;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "user", catalog = "mock_t11")
public class User {
    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "fullname", length = 64, nullable = false)
    private String fullname;

    @Column(name = "username", length = 64, nullable = false, unique = true)
    private String username;

    @Column(name = "password", length = 800, nullable = false)
    private String password;

    @Column(name = "email", length = 56, unique = true, nullable = false)
    @Email
    private String email;

    @Column(name = "phone", length = 16, unique = true, nullable = true)
    private String phone;

    @Column(name = "image", length = 800)
    private String img;

    @OneToMany(mappedBy = "user")
    List<Contribute> contributes;

}
