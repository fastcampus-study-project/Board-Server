package com.fastcampus.board_server.dto;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class UserDto {
    public enum Status {
        DEFAULT, ADMIN, DELETED
    }

    private int id;
    private String userId;
    private String password;
    private String nickName;
    private boolean isAdmin;
    private Date createTime;
    private boolean isWithDraw;
    private Status status;
    private Date updateTime;

    public UserDto() {
    }

    public UserDto(String id, String password, String name, String phone, String address, Status status,
            Date createTime, Date updateTime, boolean isAdmin) {
        this.userId = id;
        this.password = password;
        this.nickName = name;
        this.status = status;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.isAdmin = isAdmin;
    }

    public static boolean hasNullDataBeforeSignup(UserDto userDto) {
        return userDto.getUserId() == null || userDto.getPassword() == null
                || userDto.getNickName() == null;
    }
}
