package com.vti.mock.dto;

import com.vti.mock.model.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
    private int id;
    private String fullname;
    private String username;
    private String email;
    private String phone;
    private String img;

    public UserDto(User user){
        this.id = user.getId();
        this.fullname = user.getFullname();
        this.username = user.getUsername();
        this.email = user.getEmail();
        this.phone = user.getPhone();
        this.img = user.getImg();
    }
}
