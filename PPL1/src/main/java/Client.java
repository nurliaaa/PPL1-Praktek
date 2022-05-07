
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LIA
 */
public class Client {
    public static void main(String args[]){  
      Scanner in = new Scanner(System.in);
      FacadeDisplayToserba fdt = new FacadeDisplayToserba();  
      int pilih;
        
        System.out.println("==========LIST PRODUK TOSERBA===============");
        System.out.println("1. Alat Rumah Tangga  ");
        System.out.println("2. Alat Tulis ");
        System.out.println("3. Buah ");
        System.out.println("4. Daging ");
        System.out.println("5. Makanan Hewan ");
        System.out.println("6. Makanan Ringan ");
        System.out.println("7. Minuman ");
        System.out.println("8. Peralatan Bayi ");
        System.out.println("9. Perkakas ");
        System.out.println("10. Sayuran ");
        System.out.println("===========================================");
        System.out.print("Pilih produk : ");
        pilih = in.nextInt();
        
        switch (pilih) {
        case 1 :
        {
            System.out.println("Anda memilih  Alat Rumah Tangga");
            fdt.AlatRumahTanggaInfo();
            break;
        }
        case 2 :
        {
            System.out.println("Anda memilih  Alat Tulis");
            fdt.alatTulisInfo();
            break;
        }
        case 3 :
        {
            System.out.println("Anda memilih Buah");
            fdt.buahInfo();
            break;
        }
        case 4 :
        {
            System.out.println("Anda memilih Daging");
            fdt.dagingInfo();
            break;
        }
        case 5 :
        {
            System.out.println("Anda memilih Makanan Hewan");
            fdt.makananHewanInfo();
            break;
        }
        case 6 :
        {
            System.out.println("Anda memilih Makanan Ringan");
            fdt.MakananRinganInfo();
            break;
        }
        case 7 :
        {
            System.out.println("Anda memilih Minuman");
            fdt.minumanInfo();
            break;
        }
        case 8 :
        {
            System.out.println("Anda memilih Peralatan Bayi");
            fdt.peralatanBayiInfo();
            break;
        }
        case 9 :
        {
            System.out.println("Anda memilih Perkakas");
            fdt.perkakasInfo();
            break;
        }
        case 10 :
        {
            System.out.println("Anda memilih Sayuran");
            fdt.sayuranInfo();
            break;
        }
      }  
    }
}


