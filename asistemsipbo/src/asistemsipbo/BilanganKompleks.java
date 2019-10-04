/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asistemsipbo;

import java.util.Scanner;

/**
 *
 * @author Hellau
 */
public class BilanganKompleks {
    double real;
    double img;
    
    public BilanganKompleks(double real, double img){
        this.real=real;
        this.img=img;
    }
    public double getReal() {
        return this.real;
    }
    public double getImg() {
        return this.img;
    }
    
    public BilanganKompleks perkalian(BilanganKompleks temp){
        double a  = real * temp.getReal() - img * temp.getImg();
        double b  = img * temp.getReal() + real * temp.getImg();
        return new BilanganKompleks(a, b);
    }
    public BilanganKompleks add(BilanganKompleks temp){
        double a  = real + temp.getReal();
        double b  = img + temp.getImg();
        return new BilanganKompleks(a, b);
    }
    public String toString(){
        String result;
        if(img == 0){
            result = real + "";
        }
        else if(real == 0){
            result = img + "i";
        }
        else if (img < 0){
            result = real + " - " + (img * (-1)) + "i";
        }
        else{
            result = real + " + " + img + "i";
        }
        return result;
    }       
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Bilangan Real 1 = ");
        double R1 = input.nextDouble();
        System.out.print("Masukkan Bilangan Img 1 = ");
        double I1 = input.nextDouble();
        System.out.print("Masukkan Bilangan Real 2 = ");
        double R2 = input.nextDouble();
        System.out.print("Masukkan Bilangan Img 2 = ");
        double I2 = input.nextDouble();
        
        BilanganKompleks temp1   = new BilanganKompleks(R1, I1);
        BilanganKompleks temp2   = new BilanganKompleks(R2, I2);
        System.out.println("input :\"" + temp1 + "\" , \"" + temp2 + "\"");
        System.out.println("output :\"" + temp1.perkalian(temp2) + "\"");   
    }
}
