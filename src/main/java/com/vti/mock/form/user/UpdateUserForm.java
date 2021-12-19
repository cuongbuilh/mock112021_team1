package com.vti.mock.form.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateUserForm {
    private String fullname;
    private String username;
    private String email;
    private String phone;
    private String img;
}
