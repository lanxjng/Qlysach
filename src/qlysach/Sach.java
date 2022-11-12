/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlysach;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Sach extends Qlysach implements Comparable<Sach>{
    private String Tentg,Tensach;
    private int Sotrang;
    
    public Sach(){}
    public int getSotrang(){
        return Sotrang;
    }
    
    public void Input(){
        Scanner sc = new Scanner (System.in);
        super.Input();
        System.out.println("Nhap ten tac gia: ");
        Tentg = sc.nextLine();
        System.out.println("Nhap ten sach: ");
        Tensach = sc.nextLine();
        System.out.println("Nhap so trang: ");
        Sotrang = Integer.parseInt(sc.nextLine());
    }
    public void Output(){
        super.Output();
        System.out.println("Ten tac gia: "+this.Tentg);
        System.out.println("Ten sach: "+this.Tensach);
        System.out.println("So trang: "+this.Sotrang);
        
    }
    
    @Override
    public int compareTo(Sach s1) {
        if(this.Sotrang == s1.Sotrang)
            return 0;
        else if(this.Sotrang >s1.Sotrang)
            return 1;
        else 
            return -1;
    }

    @Override
    public String toString() {
        return "Thong tin Sach@[ Ten tac gia = "+ Tentg + ", Ten sach=" + Tensach + ", So trang=" + Sotrang + "]";
    }
    
}
