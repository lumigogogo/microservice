package com.imooc.thrift.user.dto;

public class TeacherDTO extends UserDTO {

    private String info;
    private int stars;

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }
}
