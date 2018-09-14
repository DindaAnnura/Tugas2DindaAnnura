/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dindaannuraprogram;

/**
 *
 * @author ASUS
 */
public class DindaAnnuraProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int nilaiAndroid = 85 ;
    String wajah = "Cantik";
    String asal = "Malang";
    
    
    System.out.println("Apakah mau menikah ?");
    
    char nilaiAndroidhuruf;
    if(nilaiAndroid >= 85){
        nilaiAndroidhuruf = 'A';
    }
    else if(nilaiAndroid >= 75){
        nilaiAndroidhuruf = 'B';
    }
    else if(nilaiAndroid >= 65){
        nilaiAndroidhuruf = 'C';
    }
    else if(nilaiAndroid >= 55){
        nilaiAndroidhuruf = 'D';
    }
    else{
        nilaiAndroidhuruf = 'E';
    }
    
    if(nilaiAndroidhuruf == 'A' && wajah == "Cantik" && asal == "Malang"){
        System.out.println("Mau Bangetlah");
    }
    else if ((nilaiAndroidhuruf == 'A' || nilaiAndroidhuruf == 'C')&& wajah == "Cantik" && asal == "Malang"){
        System.out.println("Bolehlah");
    } 
    else if (asal == "Malang"){
        System.out.println("Saya pikir-pikir dulu");
    }
    else {
        System.out.println("Absolutely NO");
    }
    }
    
}
