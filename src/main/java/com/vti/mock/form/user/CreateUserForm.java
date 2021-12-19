package com.vti.mock.form.user;

import com.vti.mock.model.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateUserForm {
    private String fullname;
    private String username;
    private String password;
    private String email;
    private String phone;
    private String avatar;

    public User toUser(){
        User user = new User();
        user.setFullname(fullname);
        user.setUsername(username);
        user.setPassword(password);
        user.setEmail(email);
        user.setPhone(phone);
        user.setAvatar(avatar);
        return user;
    }
}
