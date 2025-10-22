/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab8;

import java.util.Scanner;

/**
 *
 * @author ICT
 */
public class bai4 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int chon;
        do {
            System.out.println("+------------------------------------+");
            System.out.println("|  *** ***  MENU CHUC NANG  *** ***  |");
            System.out.println("+------------------------------------+");
            System.out.println("| 1. Tinh tong cac so                |");
            System.out.println("| 2. Tim so lon nhat va so nho nhat  |");
            System.out.println("| 3. Viet in hoa ki tu dau           |");
            System.out.println("| 4. Ket thuc                        |");
            System.out.println("+------------------------------------+");
            System.out.print("Ban chon chuc nang? ");
            chon=sc.nextInt();
            sc.nextLine();
            switch(chon) {
                case 1: System.out.println("Ban chon: Tinh tong cac so");
                    tong();
                    break;
                case 2: System.out.println("Ban chon: Tim so lon nhat va so nho nhat");
                    maxmin();
                    break;
                case 3: System.out.println("Ban chon: Viet in hoa ki tu dau");
                    inhoa();
                    break;
                case 4:
                    System.out.println("Ket thuc chuong trinh. Tam biet va hen gap lai!");
                    break;
                default: 
                    System.out.println("Chon sai. Vui long chon lai (1-4)");
                    break;
            }
        } while(chon!=4);
    }
    public static void tong() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap chuoi so: ");
        String chuoi=sc.nextLine();
        String[] mangchu=chuoi.trim().split(" ");
        double[] mangso=new double[mangchu.length];
        for(int i=0;i<mangchu.length;i++) {
            try {
                mangso[i]=Double.parseDouble(mangchu[i]);
            } catch(Exception e) {
                mangso[i]=0;
            }
        }
        double tong=XPoly.sum(mangso);
        System.out.println("Tong cac tham so la: "+tong);
        System.out.println("");
    }
    public static void maxmin() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap chuoi so: ");
        String chuoi=sc.nextLine();
        String[] mangchu=chuoi.trim().split(" ");
        double[] mangso=new double[mangchu.length];
        for(int i=0;i<mangchu.length;i++) {
            try {
                mangso[i]=Double.parseDouble(mangchu[i]);
            } catch(Exception e) {
                mangso[i]=0;
            }
        }
        double max=XPoly.max(mangso);
        double min=XPoly.min(mangso);
        System.out.println("So lon nhat la: "+max+" va So nho nhat la: "+min);
        System.out.println("");
    }
    public static void inhoa() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap chuoi chu: ");
        String chuoi=sc.nextLine();
        String ketqua=XPoly.toUpperFirstChar(chuoi);
        System.out.println("Sau khi in hoa: "+ketqua);
        System.out.println("");
    }
}
