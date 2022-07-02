package com.example.bean;

//车辆信息
public class Car {
    @Override
    public String toString() {
        return "Car{" +
                "no=" + no +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price='" + price + '\'' +
                ", age='" + age + '\'' +
                ", distance='" + distance + '\'' +
                ", type='" + type + '\'' +
                ", register_time='" + register_time + '\'' +
                ", other='" + other + '\'' +
                ", image='" + image + '\'' +
                '}';
    }

    private int no;
    private String brand;
    private String model;
    private String price;
    private String age;
    private String distance;
    private String type;
    private String register_time;
    private String other;
    private String image;

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRegister_time() {
        return register_time;
    }

    public void setRegister_time(String register_time) {
        this.register_time = register_time;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
