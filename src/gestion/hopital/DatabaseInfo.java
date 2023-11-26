/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion.hopital;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author adil3
 */
public class DatabaseInfo {
    Connection connection = DriverManager.getConnection("jdbc:derby://localhost:1527/HospitalJavaDB","User1","root");
    
}
