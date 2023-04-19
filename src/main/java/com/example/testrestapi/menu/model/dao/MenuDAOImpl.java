package com.example.testrestapi.menu.model.dao;


import com.example.testrestapi.menu.model.dto.Menu;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository("menuDAO")
public class MenuDAOImpl implements MenuDAO {

    @Autowired
    private SqlSessionTemplate sqlSession;

    //메뉴
    @Override
    public List<Menu> selectMenuRecommendation(Map<String, String> map) {
        return sqlSession.selectList("menu.selectMenuRecommendation", map);
    }

    @Override
    public List<Menu> selectMenuByfoodType(Map<String, String> map) {
        return sqlSession.selectList("menu.selectMenuByfoodType", map);
    }

}
