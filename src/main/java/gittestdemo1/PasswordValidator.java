package gittestdemo1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Zarin Tasnim, 2026
 */
public class PasswordValidator {
 
    public static boolean isValidLength(String password)
    {   
        if(password.length()>=8)
        {
            return true;
        }
        return false;
    }

}
