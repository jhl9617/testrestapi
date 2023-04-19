package com.example.testrestapi.menu.model.service;

import com.example.testrestapi.menu.model.dto.Menu;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


public interface MenuService {

    List<Menu> selectMenuRecommendation(Map<String, String> map);
    List<Menu> selectMenuByfoodType(Map<String, String> map);

    //서비스 주석 추가
}
