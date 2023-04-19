package com.example.testrestapi.menu.model.dao;

import com.example.testrestapi.menu.model.dto.Menu;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;


public interface MenuDAO {

    List<Menu> selectMenuRecommendation(Map<String, String> map);
    List<Menu> selectMenuByfoodType(Map<String, String> map);


}
