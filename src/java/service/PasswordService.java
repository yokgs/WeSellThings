/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author user
 */
public class PasswordService {

    public static String hash(String password) {
        return BCrypt.hashpw(password, BCrypt.gensalt(10));
    }
    
    public static boolean verify(String password, String hash){
        return BCrypt.checkpw(password, hash);
    }
}
