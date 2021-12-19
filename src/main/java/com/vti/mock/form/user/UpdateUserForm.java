package com.vti.mock.form.user;

import com.vti.mock.model.User;
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
    private String avatar;

    public User toUser(){
        User user = new User();
        user.setFullname(fullname);
        user.setUsername(username);
        user.setEmail(email);
        user.setPhone(phone);
        user.setAvatar(avatar);
        return user;
    }
}
