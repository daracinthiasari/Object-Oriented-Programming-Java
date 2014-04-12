/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_mingguan;
import java.util.Scanner;  // Import java untuk fungsi meminta inputan user
/**
 *
 * @author dara
 */
public class sistemakademik {
  // baris class dan nama class di sini harus sama dengan nama file .java
    public static void main(String[] args){  //baris awal program utama
    Scanner input=new Scanner(System.in); // kita masukan fungsi abstract Scanner kedalam sebuah object  yang bernama input
        int i,jumlahMk;  //mendeklarasikan i dan jumlahmk bertipe data integer
        String nama,npm,jurusan;   //mendeklarasikan nama,npm,jurusan bertipe data string
        String mataKuliah[]=new String[15]; //mendeklarasikan mataKuliah bertipe data string arrray memiliki maksimal 15 data
        String grade[]=new String[15];  //mendeklarasikan grade bertipe data string arrray memiliki maksimal 15 data
        int uts[]=new int[15];  //mendeklarasikan uts beripe data integer array memiliki maksimal 15 data
        int uas[]=new int[15];  //mendeklarasikan uas beripe data integer array memiliki maksimal 15 data
        double nilai[]=new double[15];  //mendeklarasikan nilai beripe data double array memiliki maksimal 15 data
        System.out.println("=================================="); //*perintah mencetak string
        System.out.println("   Menghitung Nilai Mahasiswa");      //*
        System.out.println("=================================="); //*
        System.out.print("   Masukan Jumlah Mata Kuliah: ");      //* dan bila tanpa ln maka kursor berada di sebelahnya
        jumlahMk=input.nextInt(); // untuk meminta inputan berupa integer ke variabel jumlahMk
        System.out.println("==================================");  //*
        System.out.print("  Nama     : "); //*
        nama=input.next(); //untuk meminta inputan berupa string ke variabel nama
        System.out.print("  NPM      : "); //*
        npm=input.next(); //untuk meminta inputan berupa string ke variabel npm
        System.out.print("  Jurusan  : "); //*
        jurusan=input.next(); //untuk meminta inputan berupa string ke variabel jurusan
        System.out.println("=================================="); //*
        for(i=1; i<=jumlahMk; i++){ //perintah perulangan dari i=1 sampai jumlahMk dengan step i=1
            System.out.print("\n Mata kuliah ke-"+i+" : "); //* dengan tambahan manipulasi string
            mataKuliah[i]=input.next(); //untuk meminta inputan berupa string ke variabel mataKuliah arrray pada saat i
            System.out.print(" Nilai UTS  : "); //*
            uts[i]=input.nextInt(); //untuk meminta inputan berupa integer ke variabel uts array pada saat i
            System.out.print(" Nilai UAS  : "); //*
            uas[i]=input.nextInt(); //untuk meminta inputan berupa integer ke variabel uas array pada saat i
            nilai[i]=((uts[i]*0.7)+(uas[i]*0.3)); //perhitungan di input ke nilai pada saat i
            if (nilai[i]>=85) grade[i]="A";  //jika nilai ke-i 85 keatas maka grade ke-i isinya A
                else if (nilai[i]>=75) grade[i]="B";  //jika nilai ke-i 75 keatas maka grade ke-i isinya B
                    else if (nilai[i]>=65) grade[i]="C";  //jika nilai ke-i 65 keatas maka grade ke-i isinya C
                        else if (nilai[i]>=50) grade[i]="D"; //jika nilai ke-i 50 keatas maka grade ke-i isinya D
                            else grade[i]="E"; //jika nilai ke-i dibawah 50 maka grade ke-i isinya E
            }
        System.out.println("\n=================================="); //*
        System.out.println("\n\n Nama: "+nama+"            NPM: "+npm); //* dengan tambahan manipulasi string
        System.out.println("========================================="); //*
        System.out.println(" Mata Kuliah             Nilai      Grade"); //*
        System.out.println("========================================="); //*
        for(i=1;i<=jumlahMk;i++){ //perintah perulangan dari i=1 sampai jumlahMk dengan step i=1
        System.out.println(" "+mataKuliah[i]+"      "+nilai[i]+"      "+grade[i]); //* dengan tambahan manipulasi string
            }
        System.out.println("\n\n============================================="); //*
        System.out.println(" Terima Kasih Telah Menggunakan Program Kami"); //*
        System.out.println("============================================="); //*
        System.exit(0); //keluar dari program dengan interasi 0 artinya program tidak ada eror
        }
   }


