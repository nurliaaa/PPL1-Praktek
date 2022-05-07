/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LIA
 */
public class FacadeDisplayToserba {
    private toserba MakananRingan;
    private toserba buah;
    private toserba minuman;
    private toserba sayuran;
    private toserba daging;
    private toserba alattulis;
    private toserba alatRumahTangga;
    private toserba perkakas;
    private toserba peralatanBayi;
    private toserba makananHewan;
    
    public FacadeDisplayToserba(){
        MakananRingan = new makananRingan();
        buah = new Buah();
        minuman = new Minuman();
        sayuran = new Sayuran();
        daging = new Daging();
        alattulis = new AlatTulis();
        alatRumahTangga = new AlatRumahTangga();
        perkakas = new Perkakas();
        peralatanBayi = new PeralatanBayi();
        makananHewan = new MakananHewan();
    }
    
    public void MakananRinganInfo(){
        MakananRingan.barang();
        MakananRingan.harga();
    }
    
    public void buahInfo(){
        buah.barang();
        buah.harga();
    }
    
    public void minumanInfo(){
        minuman.barang();
        minuman.harga();
    }
    
    public void sayuranInfo(){
        sayuran.barang();
        minuman.harga();
    }
    
    public void dagingInfo(){
        daging.barang();
        daging.harga();
    }
    
    public void alatTulisInfo(){
        alattulis.barang();
        alattulis.harga();
    }
    
    public void AlatRumahTanggaInfo(){
        alatRumahTangga.barang();
        alatRumahTangga.harga();
    }
    
    public void perkakasInfo(){
        perkakas.barang();
        perkakas.harga();
    }
    
     public void peralatanBayiInfo(){
        peralatanBayi.barang();
        peralatanBayi.harga();
    }
     
     public void makananHewanInfo(){
        makananHewan.barang();
        makananHewan.harga();
    }
}
