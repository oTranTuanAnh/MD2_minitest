package test;

import src.NhanVien;
import src.NhanVienFulltime;
import src.NhanVienParttime;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        NhanVien[] nhanViens = new NhanVien[10];
        nhanViens[0] = new NhanVienFulltime("1123", "Nguyen Van A", 20, "0918273645", "a@gmail.com",100000,0,300000);
        nhanViens[1] = new NhanVienFulltime("2356", "Le Thi B", 22, "0942213544", "bb@gmail.com",500000,250000,300000);
        nhanViens[2] = new NhanVienFulltime("2431", "Tran Van C", 25, "0936523647", "c@gmail.com",0,300000,500000);
        nhanViens[3] = new NhanVienFulltime("1365", "Nguyen Van D", 30, "0845716388", "dddd@gmail.com",1000000,500000,200000);
        nhanViens[4] = new NhanVienFulltime("6820", "Pham Thu E", 27, "0635298679", "e1e2@gmail.com",350000,70000,400000);
        nhanViens[5] = new NhanVienParttime("5124", "Nguyen Van F", 20, "0923142555", "ff@gmail.com", 160);
        nhanViens[6] = new NhanVienParttime("5365", "Phan Van G", 25, "0936521364", "g@gmail.com", 175);
        nhanViens[7] = new NhanVienParttime("5432", "Le Van H", 32, "0896956417", "h1@gmail.com", 170);
        nhanViens[8] = new NhanVienParttime("5115", "Nguyen Thi K", 25, "096638899", "kkk@gmail.com", 170);
        nhanViens[9] = new NhanVienParttime("5263", "Nguyen Thi K", 20, "0836984477", "tvb@gmail.com", 160);


        int choice = -1;
        Scanner sc = new Scanner(System.in);
        while (choice!=0){
            System.out.println("MENU");
            System.out.println("1.Tinh luong trung binh nhan vien ca cong ty");
            System.out.println("2.Tinh luong trung binh nhan vien fulltime");
            System.out.println("3.Tinh luong trung binh nhan vien parttime");
            System.out.println("4.Tong luong phai tra cho nhan vien parttime");
            System.out.println("5.So luong nhan vien co muc luong cao hon luong trung binh ca cong ty");
            System.out.println("6.So luong nhan vien parttime theo ten");
            System.out.println("0.Exit");
            System.out.print("NHAP LUA CHON CUA BAN: ");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.print("Luong trung binh ca cong ty la: ");
                    System.out.printf("%.3f \n",luongTBcty(nhanViens));
                    break;
                case 2:
                    System.out.print("Luong trung binh nhan vien fulltime la: ");
                    System.out.printf("%.3f \n",luongTBfulltime(nhanViens));
                    break;
                case 3:
                    System.out.print("Luong trung binh nhan vien parttime la: ");
                    System.out.printf("%.3f \n",luongTBparttime(nhanViens));
                    break;
                case 4:
                    System.out.print("Tong luong phai tra cho nhan vien parttime la: ");
                    System.out.printf("%.3f \n",tongLuongParttime(nhanViens));
                    break;
                case 5:
                    int count = getSoluongNVLuongCaoHonTB(nhanViens);
                    System.out.println("So luong nhan vien co luong cao hon luong trung binh cua cong ty la: "+count);
                    break;
                case 6:
                    System.out.print("Nhap ten nhan vien parttime can tim: ");
                    Scanner inputName = new Scanner(System.in);
                    String tenNV = inputName.nextLine();
                    int soLuong = demNVParttimeTheoTen(nhanViens, tenNV);
                    System.out.println("Co " + soLuong + " nhan vien parttime ten la "+ tenNV);
                    break;
                case 0:
                    System.exit(0);
            }
        }
    }

    private static int demNVParttimeTheoTen(NhanVien[] nhanViens, String tenNV) {
        int count = 0;
        for (NhanVien nv: nhanViens){
            if (nv instanceof NhanVienParttime && nv.getHoTen().equals(tenNV)){
                count++;
            }
        }
        return count;
    }

    private static int getSoluongNVLuongCaoHonTB(NhanVien[] nhanViens) {
        int count = 0;
        double luongTB = luongTBcty(nhanViens);
        for (NhanVien nv: nhanViens){
            if (nv.luongThucLinh() > luongTB){
                count ++;
            }
        }
        return count;
    }

    private static double tongLuongParttime(NhanVien[] nhanViens) {
        double tongLuong = 0;
        for (NhanVien nv: nhanViens) {
            if (nv instanceof NhanVienParttime){
                tongLuong += nv.luongThucLinh();
            }
        }
       return tongLuong;
    }

    private static double luongTBparttime(NhanVien[] nhanViens) {
        double tongLuong = 0;
        int count = 0;
        for (NhanVien nv: nhanViens){
            if (nv instanceof NhanVienParttime){
                tongLuong += nv.luongThucLinh();
                count++;
            }
        }
        return tongLuong/count;
    }

    private static double luongTBfulltime(NhanVien[] nhanViens) {
        double tongLuong = 0;
        int count = 0;
        for (NhanVien nv: nhanViens){
            if (nv instanceof NhanVienFulltime){
                tongLuong += nv.luongThucLinh();
                count++;
            }
        }
        return tongLuong/count;
    }

    private static double luongTBcty(NhanVien[] nhanViens) {
        double tongLuong = 0;
        for (NhanVien nv: nhanViens){
            tongLuong += nv.luongThucLinh();
        }
        return tongLuong/nhanViens.length;
    }

}
