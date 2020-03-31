package com.qingcheng.controller;

import com.qingcheng.service.order.CartService;
import jdk.nashorn.internal.ir.annotations.Reference;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/cart")
public class CartController {
    @Reference
    private CartService cartService;

    @GetMapping("/findCartList")
    public List<Map<String, Object>> findCartList() {
        String username = SecurityContextHolder.getContext().getAuthentication().getName();
        if(username==null){
            System.out.println("数据不存在...");
        }
        List<Map<String, Object>> cartList = cartService.findCartList(username);
        return cartList;


    }
}
