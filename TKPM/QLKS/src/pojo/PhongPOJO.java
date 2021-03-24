
package pojo;

/**
 *
 * @author Sony
 */
public class PhongPOJO {
    public int maPhong;
    public  String loaiPhong;
    public int donGia;
    public String ghiChu;
    public  int tinhTrang;

    public PhongPOJO() {
    }

    public PhongPOJO(String loaiPhong) {
        this.loaiPhong = loaiPhong;
    }

    public PhongPOJO(int maPhong) {
        this.maPhong = maPhong;
    }  
    
    
    public PhongPOJO(int maPhong, String loaiPhong, int donGia) {
        this.maPhong = maPhong;
        this.loaiPhong = loaiPhong;
        this.donGia = donGia;
    }

    @Override
    public String toString() {
        return maPhong +"";
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
