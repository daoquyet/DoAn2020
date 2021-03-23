package pojo;

/**
 *
 * @author Sony
 */
public class PhongBanPOJO {
    public int maPhongBan;
    public  String tenPhongBan;

    public PhongBanPOJO(int maPhongBan, String tenPhongBan) {
        this.maPhongBan = maPhongBan;
        this.tenPhongBan = tenPhongBan;
    }

    public int getMaPhongBan() {
        return maPhongBan;
    }

    public void setMaPhongBan(int maPhongBan) {
        this.maPhongBan = maPhongBan;
    }

    public String getTenPhongBan() {
        return tenPhongBan;
    }

    public void setTenPhongBan(String tenPhongBan) {
        this.tenPhongBan = tenPhongBan;
    }
    @Override 
    public String toString(){
        return  this.tenPhongBan;
    }

    public PhongBanPOJO() {
    }
    
}
