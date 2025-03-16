/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lqm.repositories.impl;

import com.lqm.hibernatedemo.HibernateUtils;
import com.lqm.pojo.Category;
import jakarta.persistence.Query;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author admin
 */
public class CategoryRepositoryImpl {
    public List<Category> getCate() {
        try( Session s = HibernateUtils.getFACTORY().openSession()) {
            Query q = s.createQuery("From Category", Category.class);
            return q.getResultList();
        }
    }
}
