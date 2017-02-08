package com.vektorel.hibswingapp;

import com.vektorel.hibswingapp.entity.Kullanici;
import com.vektorel.hibswingapp.ui.frmLogin;
import com.vektorel.hibswingapp.service.KullaniciService;
import java.util.logging.Level;
import java.util.logging.Logger;

public class App {

    public static void main(String[] args) {
        System.out.println("App is start..");

//        try {
//            KullaniciService kullaniciService = new KullaniciService();
//            kullaniciService.save(new Kullanici("emre", "123", "Emre AYTAÇ"));
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
        
        frmLogin login = new frmLogin(null, true);
        login.setVisible(true);
    }
}
