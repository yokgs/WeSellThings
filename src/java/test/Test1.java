/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import org.hibernate.Hibernate;
import service.UserService;
import util.HibernateUtil;

/**
 *
 * @author a
 */
public class Test1 {
    public static void main(String[] args) {
        ///HibernateUtil.getSessionFactory().openSession();
        System.out.println((new UserService()).findByEmail("hamza"));
    }
}
