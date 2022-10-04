/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package Perpustakaan;

/**
 *
 * @author PC
 */
public class Mahasiswa {
    
    public String nama;
    public String NRP;
    public String tanggalPinjam;
    public String tanggalKembali;
   
    public Mahasiswa(){
        this.nama = "Rusali";
        this.NRP = "502521100";
        this.tanggalPinjam = "4 Oktober 2022";
        this.tanggalKembali = "11 Oktober 2022";
    }
    
    public void displayCustomer(){
        System.out.println ("Nama   : " + nama); 
        System.out.println ("NRP    : " + NRP); 
        System.out.println ("tanggalPinjam  : " + tanggalPinjam); 
        System.out.println ("tanggalKembali : " + tanggalKembali);
    }
    
    @Override
    public String toString(){
        return ("");
    }
    
}
