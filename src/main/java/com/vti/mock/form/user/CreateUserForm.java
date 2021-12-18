package com.vti.mock.form.user;

import lombok.Data;

@Data
public class CreateUserForm {
    private String fullname;
    private String username;
    private String email;
    private String phone;
    private String img;
}
