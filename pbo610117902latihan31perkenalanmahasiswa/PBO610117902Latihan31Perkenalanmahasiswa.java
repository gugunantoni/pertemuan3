/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo610117902latihan31perkenalanmahasiswa;

/**
 *
 * @author
 NAMA       : Gugun Antoni
 KELAS      : PBO6
 NIM        : 10117902
 
 Description : Program Perkenalan Mahasiswa
 */
public class PBO610117902Latihan31Perkenalanmahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Mahasiswa mhs1 = new Mahasiswa ();
    mhs1.nim = "10117902";
    mhs1.name = "antoni";
    mhs1.introduceSelf(mhs1.nim, mhs1.name) ;
    
    Mahasiswa mhs3 = new Mahasiswa ();
    mhs3.nim="10117902";
    mhs3.name = "antoni" ;
    mhs3.introduceSelf (mhs3.nim, mhs3.name);
    
    
    
    
    
    }
    
    
    
    
}
