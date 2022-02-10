package io.httpmurilo.sales.dto;

import io.httpmurilo.sales.entity.User;

public class UserDTO {

    public UserDTO convertToUser(User user) {
        UserDTO dto = new UserDTO();
        dto.setName(user.getName());
        dto.setAge(user.getAge());
        dto.setEmail(user.getEmail());
        dto.setState(user.getState());
        dto.setOrderId(user.getOrderId());
        dto.setCountry(user.getCountry());
        return dto;
    }

    private String name;
    private Integer age;
    private String email;
    private String state;
    private Integer orderId;
    private String country;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
