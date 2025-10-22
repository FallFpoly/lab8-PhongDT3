/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab8;

/**
 *
 * @author Nitro
 */
public final class XPoly {
    public static double sum(double... x) {
        double tong=0;
        for(double so:x) {
            tong+=so;
        }
        return tong;
    }
    public static double max(double... x) {
        double max=x[0];
        for(double so:x) {
            if(so>max) {
                max=so;
            }
        }
        return max;
    }
    public static double min(double... x) {
        double min=x[0];
        for(double so:x) {
            if(so<min) {
                min=so;
            }
        }
        return min;
    }
    public static String toUpperFirstChar(String s) {
        String[] chu=s.trim().split(" ");
        for(int i=0;i<chu.length;i++) {
            if(chu[i].isEmpty()) {
                continue;
            }
            char chudau=chu[i].charAt(0);
            String inhoa=String.valueOf(chudau).toUpperCase();
            chu[i]=inhoa+chu[i].substring(1);
        }
        String ketqua=String.join(" ", chu);
        return ketqua;
    }
}
