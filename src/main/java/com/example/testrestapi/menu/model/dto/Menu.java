package com.example.testrestapi.menu.model.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@Getter
@Data
@Setter
@ToString
@EntityScan
public class Menu {
    private int foodno;
    private String restaurant;
    private String foodname;
    private String foodtype;
    private String taste;
    private String price;

}
