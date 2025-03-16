/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.lqm.hibernatedemo;

import com.lqm.repositories.impl.CategoryRepositoryImpl;
import com.lqm.repositories.impl.ProductRepositoryImpl;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author admin
 */
public class HibernateDemo {

    public static void main(String[] args) {
        CategoryRepositoryImpl s = new CategoryRepositoryImpl();
        s.getCate().forEach(c -> System.out.println(c.getName()));
        
        ProductRepositoryImpl s2 = new ProductRepositoryImpl();
        Map<String, String> params = new HashMap<>();
        params.put("page", "2");
        
        s2.getProducts(params).forEach(p -> System.out.printf("%d - %s: %.1f\n", p.getId(), p.getName(), p.getPrice()));
        
    }
}
