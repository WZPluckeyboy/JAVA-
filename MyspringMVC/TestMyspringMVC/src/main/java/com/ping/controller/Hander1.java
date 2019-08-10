package com.ping.controller;

import com.ping.VO.Items;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

public  class Hander1 implements Controller {
    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
       /**模拟数据库
        *
        */
        List<Items> itemsList=new ArrayList <> (  );
        Items items1 = new Items();
        items1.setItemsId(1);
        items1.setItemsName("arvin");
        items1.setItemsPrice(200);

        Items items2 = new Items();
        items2.setItemsId(2);
        items2.setItemsName("arvin2");
        items2.setItemsPrice(200);

        Items items3 = new Items();
        items3.setItemsId(3);
        items3.setItemsName("arvin3");
        items3.setItemsPrice(200);

        itemsList.add(items1);
        itemsList.add(items2);
        itemsList.add(items3);

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("itemsListKey",itemsList);
        modelAndView.setViewName("showItemsList");
        return modelAndView;
    }
}
