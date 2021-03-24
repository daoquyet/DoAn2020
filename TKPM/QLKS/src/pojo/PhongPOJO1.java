
package pojo;

/**
 *
 * @author Sony
 */
public class PhongPOJO1 {
    public int maPhong;
    public  String loaiPhong;
    public int donGia;
    public String ghiChu;
    public  int tinhTrang;

    public PhongPOJO1() {
    }

    public PhongPOJO1(String loaiPhong) {
        this.loaiPhong = loaiPhong;
    }

    public PhongPOJO1(int maPhong) {
        this.maPhong = maPhong;
    }  
    
    
    public PhongPOJO1(int maPhong, String loaiPhong, int donGia) {
        this.maPhong = maPhong;
        this.loaiPhong = loaiPhong;
        this.donGia = donGia;
    }

    @Override
    public String toString() {
        return ""+loaiPhong;
    }
    
       
    public int getMaPhong() {
        return maPhong;
    }

    public String getLoaiPhong() {
        return loaiPhong;
    }

    public int getDonGia() {
        return donGia;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public int getTinhTrang() {
        return tinhTrang;
    }

    public void setMaPhong(int maPhong) {
        this.maPhong = maPhong;
    }

    public void setLoaiPhong(String loaiPhong) {
        this.loaiPhong = loaiPhong;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public void setTinhTrang(int tinhTrang) {
        this.tinhTrang = tinhTrang;
    }
    
}
