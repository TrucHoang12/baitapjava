/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tinhchuvi;

import java.util.Scanner;
/**
 *
 * @author Thanh Truc
 */
public class TinhChuvi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        - Chu vi = 2 * π * r
        - Diện tích = π * r²
        */
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ban kinh: ");
        double banKinh = sc.nextDouble();
        
        double chuVi = 2 * Math.PI * banKinh;
        double dienTich = Math.PI * banKinh * banKinh;
        
        System.out.println("Chu vi = " + chuVi);
        System.out.println("Dien tich = " + dienTich);
    }
    
}
