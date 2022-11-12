/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlysach;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        ArrayList <Sach> listsach = new ArrayList<Sach>();
        int luachon=0;
        while(luachon !=4){
            System.out.println("Lua chon cong viec !!!");
            System.out.println("1.Nhap thong tin sach.");
            System.out.println("2.Dua ra cac quyen sach co so trang <100.");
            System.out.println("3.Sap xep theo chieu tang dan cua so trang.");
            System.out.println("4.Thoat >.< ");
            luachon= sc.nextInt();
            
            switch(luachon){
                case 1:
                    System.out.println("Nhap so luong sach: ");
                    int n = sc.nextInt();
                    for(int i =0; i<n; i++){
                        System.out.println("Nhap quyen sach thu "+i +":");
                        Sach ob = new Sach();
                        ob.Input();
                        listsach.add(ob);
                    }
                        System.out.println("Danh sach sach la :");
                        for(Sach s1 : listsach)
                            s1.Output();
                    
                    
                        
                        
                        
                    break;
                    
                case 2:
                    System.out.println("Cac quyen sach co so trang <100 la: ");
                    
                    for(Sach s1: listsach){
                        if(s1.getSotrang()<100){
                            s1.Output();
                        }
                    }
                    break;
                    
                case 3:
                    Collections.sort(listsach);
                    System.out.println("Danh sach quyen sach theo chieu tang dan cua so trang la: ");
                    for(Sach s1 : listsach)
                        s1.Output();
                    break;
                    
                case 4:
                    break;
                    
            }
            
        }
        
    }
    
}
