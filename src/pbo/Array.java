/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Maulana Ahmad
 */
public class Array {
    public static void main (String [] args){
        
        ArrayList<data> RT1kel1 = new ArrayList<>();
        ArrayList<data> RT2kel1 = new ArrayList<>();
        ArrayList<data> RT3kel1 = new ArrayList<>();
        ArrayList<data> RT4kel1 = new ArrayList<>();
        ArrayList<data> RT1kel2 = new ArrayList<>();
        ArrayList<data> RT2kel2 = new ArrayList<>();
        ArrayList<data> RT3kel2 = new ArrayList<>();
        ArrayList<data> RT4kel2 = new ArrayList<>();
        
        do{
            
            Scanner m = new Scanner(System.in);
            System.out.println("Menu E-KTP");
            System.out.println("===============");
            System.out.println("1. Tambah data Form");
            System.out.println("2. Tampilkan data Form");
            System.out.println("===============");
            System.out.println("Pilihan : ");
            int mn = m.nextInt();
            
            if(mn==1){
                
            Scanner scan = new Scanner(System.in);
            System.out.println(" ");    
            System.out.println("NIK : ");
            String NIK = scan.nextLine();
            System.out.println("Nama : ");
            String nama = scan.nextLine();
            System.out.println("Tempat Tanggal Lahir : ");
            String TTL = scan.nextLine();
            System.out.println("Alamat : ");
            String Alamat = scan.nextLine();
            System.out.println("Gol. Darah : ");
            String golDarah = scan.nextLine();
            System.out.println("Jenis Kelamin : ");
            String jenisKelamin = scan.nextLine();
            System.out.println("Agama : ");
            String agama = scan.nextLine();
            System.out.println("Status Perkawinan : ");
            String status = scan.nextLine();
            System.out.println("Pekerjaan : ");
            String pekerjaan = scan.nextLine();
            System.out.println("Kota : ");
            String Kota = scan.nextLine();
            System.out.println("Kewarganegaraan : ");
            String kewarganegaraan = scan.nextLine();
            System.out.println(" ");

            data data = new data();
            data.setNIK(NIK);
            data.setNama(nama);          
            data.setTTL(TTL);
            data.setAlamat(Alamat);
            data.setjenisKelamin(jenisKelamin);
            data.setgolDarah(golDarah);
            data.setagama(agama);
            data.setstatus(status);
            data.setpekerjaan(pekerjaan);
            data.setKota(Kota);
            data.setkewarganegaraan(kewarganegaraan);
            

            boolean menu = true;

            Scanner inp = new Scanner(System.in);
                
            System.out.println(" ");
            System.out.println("Pilih Kelurahan : ");
            System.out.println("1. Kelurahan Satu");
            System.out.println("2. Kelurahan Dua");
            System.out.println("Pilihan : ");
            String in = inp.nextLine();
            if(in.equals("1")){
                System.out.println(" ");
                System.out.println("Kelurahan Satu");
                System.out.println("Masukkan RT (1-4) : ");
                int rt = inp.nextInt();
                if(rt==1){
                    data.setRT("RT 01");
                    data.setKel("Kelurahan Satu");
                    RT1kel1.add(data);
                    System.out.println("Data dimasukkan");
                    Scanner aa=new Scanner(System.in);
                aa.nextLine();
                }else if(rt==2){
                    data.setRT("RT 02");
                    data.setKel("Kelurahan Satu");
                    RT2kel1.add(data);
                    System.out.println("Data dimasukkan");
                    Scanner aa=new Scanner(System.in);
                aa.nextLine();
                }else if(rt==3){
                    data.setRT("RT 03");
                    data.setKel("Kelurahan Satu");
                    RT3kel1.add(data);
                    System.out.println("Data dimasukkan");
                    Scanner aa=new Scanner(System.in);
                aa.nextLine();
                }else if(rt==4){
                    data.setRT("RT 04");
                    data.setKel("Kelurahan Satu");
                    RT4kel1.add(data);
                    System.out.println("Data dimasukkan");
                    Scanner aa=new Scanner(System.in);
                aa.nextLine();
                }else{
                    System.out.println("Maaf RT hanya 1 sampai 4 !!");
                   
                }  
            }
            else if(in.equals("2")){
                System.out.println(" ");
                System.out.println("Kelurahan Dua");
                System.out.println("Masukkan RT (1-4)");
                int rtt = inp.nextInt();
                if(rtt==1){
                    data.setRT("RT 01");
                    data.setKel("Kelurahan Dua");
                    RT1kel2.add(data);
                    Scanner aa=new Scanner(System.in);
                }else if(rtt==2){
                    data.setRT("RT 02");
                    data.setKel("Kelurahan Dua");
                    RT2kel2.add(data);
                    Scanner aa=new Scanner(System.in);
                }else if(rtt==3){
                    data.setRT("RT 03");
                    data.setKel("Kelurahan Dua");
                    RT3kel2.add(data);
                    Scanner aa=new Scanner(System.in);
                }else if(rtt==4){
                    data.setRT("RT 04");
                    data.setKel("Kelurahan Dua");
                    RT4kel2.add(data);
                    Scanner aa=new Scanner(System.in);
                }else{
                    System.out.println("Maaf RT hanya 1 sampai 4 !!");
                }
            }
                
            }
            else if(mn==2){
                Scanner q = new Scanner(System.in);
                System.out.println(" ");
                System.out.println("Pilih Data yg akan ditampilkan ");
                System.out.println("1) Kelurahan Satu");
                System.out.println("2) Keluranan Dua");
                System.out.println("Pilihan : ");
                int input = q.nextInt();
                if(input==1){
                    System.out.println(" ");
                    System.out.println("Kelurahan Satu");
                    System.out.println("Pilih RT 1 sampai 4 : ");
                    int r = q.nextInt();
                    if(r==1){
                        for(data is : RT1kel1){
                            System.out.println(" ");
                            System.out.println("NIK : "+is.getNIK());
                            System.out.println("Nama : "+is.getNama());
                            System.out.println("Tempat/Tgl Lahir : "+is.getTTL());
                            System.out.println("Jenis Kelamin : "+is.getjenisKelamin());
                            System.out.println("Golongan Darah : "+is.getgolDarah());
                            System.out.println("Alamat : "+is.getAlamat());
                            System.out.println("Kelurahan : "+is.getKel());
                            System.out.println("RT : "+is.getRT());
                            System.out.println("Kota : "+is.getKota());
                            System.out.println("Agama : "+is.getagama());
                            System.out.println("Status : "+is.getstatus());
                            System.out.println("Pekerjaan : "+is.getpekerjaan());
                            System.out.println("Kewarganegaraan : "+is.getkewarganegaraan());
                        }
                    }
                    else if(r==2){
                        for(data is : RT2kel1){
                            System.out.println(" ");
                            System.out.println("NIK : "+is.getNIK());
                            System.out.println("Nama : "+is.getNama());
                            System.out.println("Tempat/Tgl Lahir : "+is.getTTL());
                            System.out.println("Jenis Kelamin : "+is.getjenisKelamin());
                            System.out.println("Golongan Darah : "+is.getgolDarah());
                            System.out.println("Alamat : "+is.getAlamat());
                            System.out.println("Kelurahan : "+is.getKel());
                            System.out.println("RT : "+is.getRT());
                            System.out.println("Kota : "+is.getKota());
                            System.out.println("Agama : "+is.getagama());
                            System.out.println("Status : "+is.getstatus());
                            System.out.println("Pekerjaan : "+is.getpekerjaan());
                            System.out.println("Kewarganegaraan : "+is.getkewarganegaraan());
                        }
                    }
                    else if(r==3){
                        for(data is : RT3kel1){
                            System.out.println(" ");
                            System.out.println("NIK : "+is.getNIK());
                            System.out.println("Nama : "+is.getNama());
                            System.out.println("Tempat/Tgl Lahir : "+is.getTTL());
                            System.out.println("Jenis Kelamin : "+is.getjenisKelamin());
                            System.out.println("Golongan Darah : "+is.getgolDarah());
                            System.out.println("Alamat : "+is.getAlamat());
                            System.out.println("Kelurahan : "+is.getKel());
                            System.out.println("RT : "+is.getRT());
                            System.out.println("Kota : "+is.getKota());
                            System.out.println("Agama : "+is.getagama());
                            System.out.println("Status : "+is.getstatus());
                            System.out.println("Pekerjaan : "+is.getpekerjaan());
                            System.out.println("Kewarganegaraan : "+is.getkewarganegaraan());
                        }
                    }
                    else if(r==4){
                        for(data is : RT4kel1){
                            System.out.println(" ");
                            System.out.println("NIK : "+is.getNIK());
                            System.out.println("Nama : "+is.getNama());
                            System.out.println("Tempat/Tgl Lahir : "+is.getTTL());
                            System.out.println("Jenis Kelamin : "+is.getjenisKelamin());
                            System.out.println("Golongan Darah : "+is.getgolDarah());
                            System.out.println("Alamat : "+is.getAlamat());
                            System.out.println("Kelurahan : "+is.getKel());
                            System.out.println("RT : "+is.getRT());
                            System.out.println("Kota : "+is.getKota());
                            System.out.println("Agama : "+is.getagama());
                            System.out.println("Status : "+is.getstatus());
                            System.out.println("Pekerjaan : "+is.getpekerjaan());
                            System.out.println("Kewarganegaraan : "+is.getkewarganegaraan());
                        }
                    }
                }
                else if(input==2){
                    System.out.println(" ");
                    System.out.println("Kelurahan Dua");
                    System.out.println("Pilih RT 1 sampai 4 : ");
                    int w = q.nextInt();
                    if(w==1){
                        for(data is : RT1kel2){
                            System.out.println(" ");
                            System.out.println("NIK : "+is.getNIK());
                            System.out.println("Nama : "+is.getNama());
                            System.out.println("Tempat/Tgl Lahir : "+is.getTTL());
                            System.out.println("Jenis Kelamin : "+is.getjenisKelamin());
                            System.out.println("Golongan Darah : "+is.getgolDarah());
                            System.out.println("Alamat : "+is.getAlamat());
                            System.out.println("Kelurahan : "+is.getKel());
                            System.out.println("RT : "+is.getRT());
                            System.out.println("Kota : "+is.getKota());
                            System.out.println("Agama : "+is.getagama());
                            System.out.println("Status : "+is.getstatus());
                            System.out.println("Pekerjaan : "+is.getpekerjaan());
                            System.out.println("Kewarganegaraan : "+is.getkewarganegaraan());
                        }
                    }
                    else if(w==2){
                        for(data is : RT2kel2){
                            System.out.println(" ");
                            System.out.println("NIK : "+is.getNIK());
                            System.out.println("Nama : "+is.getNama());
                            System.out.println("Tempat/Tgl Lahir : "+is.getTTL());
                            System.out.println("Jenis Kelamin : "+is.getjenisKelamin());
                            System.out.println("Alamat : "+is.getAlamat());
                            System.out.println("Golongan Darah : "+is.getgolDarah());
                            System.out.println("Kelurahan : "+is.getKel());
                            System.out.println("RT : "+is.getRT());
                            System.out.println("Kota : "+is.getKota());
                            System.out.println("Agama : "+is.getagama());
                            System.out.println("Status : "+is.getstatus());
                            System.out.println("Pekerjaan : "+is.getpekerjaan());
                            System.out.println("Kewarganegaraan : "+is.getkewarganegaraan());
                        }
                    }
                    else if(w==3){
                        for(data is : RT3kel2){
                            System.out.println(" ");
                            System.out.println("NIK : "+is.getNIK());
                            System.out.println("Nama : "+is.getNama());
                            System.out.println("Tempat/Tgl Lahir : "+is.getTTL());
                            System.out.println("Jenis Kelamin : "+is.getjenisKelamin());
                            System.out.println("Alamat : "+is.getAlamat());
                            System.out.println("Golongan Darah : "+is.getgolDarah());
                            System.out.println("Kelurahan : "+is.getKel());
                            System.out.println("RT : "+is.getRT());
                            System.out.println("Kota : "+is.getKota());
                            System.out.println("Agama : "+is.getagama());
                            System.out.println("Status : "+is.getstatus());
                            System.out.println("Pekerjaan : "+is.getpekerjaan());
                            System.out.println("Kewarganegaraan : "+is.getkewarganegaraan());
                        }
                    }
                    else if(w==4){
                        for(data is : RT4kel2){
                            System.out.println(" ");
                            System.out.println("NIK : "+is.getNIK());
                            System.out.println("Nama : "+is.getNama());
                            System.out.println("Tempat/Tgl Lahir : "+is.getTTL());
                            System.out.println("Jenis Kelamin : "+is.getjenisKelamin());
                            System.out.println("Alamat : "+is.getAlamat());
                            System.out.println("Golongan Darah : "+is.getgolDarah());
                            System.out.println("Kelurahan : "+is.getKel());
                            System.out.println("RT : "+is.getRT());
                            System.out.println("Kota : "+is.getKota());
                            System.out.println("Agama : "+is.getagama());
                            System.out.println("Status : "+is.getstatus());
                            System.out.println("Pekerjaan : "+is.getpekerjaan());
                            System.out.println("Kewarganegaraan : "+is.getkewarganegaraan());
                        }
                    }
                    
                }
            }else{
                System.out.println("Maaf, Pilihan hanya 1 dan 2 !!");
                Scanner aa=new Scanner(System.in);
            }
        
        }while(true);
   
    }
}
