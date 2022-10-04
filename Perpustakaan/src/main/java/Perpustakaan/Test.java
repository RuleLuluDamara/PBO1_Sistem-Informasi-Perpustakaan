/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Perpustakaan;

/**
 *
 * @author PC
 */
public class Test {
     public static void main(String[] args){
        
        Mahasiswa maha = new Mahasiswa();
        maha.displayCustomer();
        
        Buku maha1 = new Buku("Negeri Para Bedebah", "Tereliye");
        System.out.println(maha1);
        
        Genre maha2 = new Genre("Action");
        System.out.println(maha2);
    }
}
