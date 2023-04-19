package com.example.testrestapi.menu.controller;

import com.example.testrestapi.menu.model.dto.Menu;
import com.example.testrestapi.menu.model.service.MenuService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller("menuController")
public class MenuController {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private MenuService menuService;

    @RequestMapping(value="/", method= RequestMethod.GET)
    public String menuJsp() {
        return "menu/menu";
    }


    @RequestMapping(value="/menu/menu", method= RequestMethod.GET)
    @ResponseBody
    public List<Menu> menu(@RequestParam("foodType")String foodType,
                           @RequestParam ("taste") String taste){
        Map<String,String> map = new HashMap<>();
        map.put("foodType", foodType);
        map.put("taste", taste);
        logger.debug(map.toString());
        logger.info(menuService.selectMenuRecommendation(map).toString());
        return menuService.selectMenuRecommendation(map);
    }

    @RequestMapping(value="/menu/{foodType}", method=RequestMethod.GET)
    public List<Menu> menuByfoodType(@PathVariable("foodType")String foodType){
        Map<String,String> map = new HashMap<>();
        map.put("foodType", foodType);
        logger.debug(map.toString());
        return menuService.selectMenuByfoodType(map);
    }

}
