package modul4;

import java.util.HashMap;
import java.util.Scanner;

public class Mahasiswa{
    String nama, kelas, matkulPraktikum;
    int nim;

    public Mahasiswa(String n, String k, String m, int i) {
        nama = n;
        kelas = k;
        matkulPraktikum = m;
        nim = i;
    }

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        HashMap<String, Mahasiswa> mhs = new HashMap<>();
        String input;
        Mahasiswa data;

        mhs.put("1", new Mahasiswa("Putri","3H", "Struktur Data", 2021000));
        mhs.put("2", new Mahasiswa("Fadhil", "3A", "Struktur data", 2021198));
        mhs.put("3", new Mahasiswa("Khi", "3D", "Kalkulus", 2021999));

        System.out.println("Masukkan ID : ");
        input = in.nextLine();
        data = mhs.get(input);
        if (data != null) {
            System.out.println("Data Mahasiswa : " + data.nama +
                    "\n" + "Kelas : " + data.kelas + "\n" + "Mata Kuliah : " +
                    data.matkulPraktikum + "\n" + "Nim : " + data.nim);
        }

    }
}
