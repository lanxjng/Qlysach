/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package qlysach;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Qlysach {
    
private String Matailieu,Tennxb;
private int Soban;

 public Qlysach(){}
 public void Input(){
     Scanner sc = new Scanner(System.in);
     System.out.println("Nhap ma tai lieu: ");
     Matailieu = sc.nextLine();
     System.out.println("Nhap ten NXB: ");
     Tennxb = sc.nextLine();
     System.out.println("Nhap So ban phat hanh: ");
     Soban = Integer.parseInt(sc.nextLine());
     
 }
 public void Output(){
     System.out.println("Ma tai lieu: "+this.Matailieu);
     System.out.println("Ten NXB: "+this.Tennxb);
     System.out.println("So ban phat hanh"+this.Soban);
     
 }

 
}
