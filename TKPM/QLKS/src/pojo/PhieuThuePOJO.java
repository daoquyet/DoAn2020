package pojo;

import java.util.logging.Logger;

/**
 *
 * @author Sony
 */
public class PhieuThuePOJO {
    public int maKhachHang;
    public String tenKhachHang;
    public String loaiKhachHang;
    public  int cmnd;
    public String diaChi;
    public int maPhong;

    public PhieuThuePOJO() {
    }

    public PhieuThuePOJO(int maKhachHang, String tenKhachHang, String loaiKhachHang, int cmnd, String diaChi, int maPhong) {
        this.maKhachHang = maKhachHang;
        this.tenKhachHang = tenKhachHang;
        this.loaiKhachHang = loaiKhachHang;
        this.cmnd = cmnd;
        this.diaChi = diaChi;
        this.maPhong = maPhong;
    }
       
    @Override
    public String toString() {
        return "PhieuThuePOJO{" + "maKhachHang=" + maKhachHang + ", tenKhachHang=" + tenKhachHang + ", loaiKhachHang=" + loaiKhachHang + ", cmnd=" + cmnd + ", diaChi=" + diaChi + ", maPhong=" + maPhong + '}';
    }

    public void setMaKhachHang(int maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
    }

    public void setLoaiKhachHang( String loaiKhachHang) {
        this.loaiKhachHang = loaiKhachHang;
    }

    public void setCmnd(int cmnd) {
        this.cmnd = cmnd;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void setMaPhong(int maPhong) {
        this.maPhong = maPhong;
    }

    public int getMaKhachHang() {
        return maKhachHang;
    }

    public String getTenKhachHang() {
        return tenKhachHang;
    }

    public  String getLoaiKhachHang() {
        return loaiKhachHang;
    }

    public int getCmnd() {
        return cmnd;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public int getMaPhong() {
        return maPhong;
    }
    
    
}
