package com.example.testrestapi.menu.model.service;

import com.example.testrestapi.menu.model.dao.MenuDAOImpl;
import com.example.testrestapi.menu.model.dto.Menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Map;

@Service("menuService")
public class MenuServiceImpl implements MenuService{

    @Autowired
    private MenuDAOImpl menuDAO;

    @Override
    public List<Menu> selectMenuRecommendation(Map<String, String> map) {
        return menuDAO.selectMenuRecommendation(map);
    }

    @Override
    public List<Menu> selectMenuByfoodType(Map<String, String> map) {
        return menuDAO.selectMenuByfoodType(map);
    }

}
