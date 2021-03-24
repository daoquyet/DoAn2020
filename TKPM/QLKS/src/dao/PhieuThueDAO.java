/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import java.sql.ResultSet;
import pojo.*;

import java.util.ArrayList;

/**
 *
 * @author Sony
 */
public class PhieuThueDAO {
    public static ArrayList<PhieuThuePOJO> layDanhSachPhieuThue(){
        ArrayList<PhieuThuePOJO> ds=new ArrayList<PhieuThuePOJO>();
        try {
            String sql="select * from phieuthue";
            MySqlDataAccessHelper helper=new MySqlDataAccessHelper();
            helper.open();
            ResultSet rs=helper.executeQuery(sql);
            while(rs.next()){
                PhieuThuePOJO pt=new PhieuThuePOJO();
                pt.setMaKhachHang(rs.getInt("MaKhachHang"));
                pt.setTenKhachHang(rs.getString("TenKhachHang"));
                pt.setLoaiKhachHang(rs.getString("LoaiKhachHang"));
                pt.setCmnd(rs.getInt("CMND"));
                pt.setDiaChi(rs.getString("DiaChi"));
                pt.setMaPhong(rs.getInt("MaPhong"));
                ds.add(pt);
            }
            helper.close();
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        return ds;
    }
    /* Tim Kiem*/
    
    public static ArrayList<PhieuThuePOJO> timPhongBan(String ten){
        ArrayList<PhieuThuePOJO> ds=new ArrayList<PhieuThuePOJO>();
        try {
            String sql="select * from phieuthue where TenKhachHang like '%"+ten+"%'";
            MySqlDataAccessHelper helper=new MySqlDataAccessHelper();
            helper.open();
            ResultSet rs=helper.executeQuery(sql);
            while(rs.next()){
                PhieuThuePOJO pt=new PhieuThuePOJO();
                pt.setMaKhachHang(rs.getInt("MaKhachHang"));
                pt.setTenKhachHang(rs.getString("TenKhachHang"));
                pt.setLoaiKhachHang(rs.getString("LoaiKhachHang"));
                pt.setCmnd(rs.getInt("CMND"));
                pt.setDiaChi(rs.getString("DiaChi"));
                pt.setMaPhong(rs.getInt("MaPhong"));
                ds.add(pt);
            }
            helper.close();
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        return ds;
    }
    public static boolean themPhieuThue(String tenKhachHang,String loaiKhachHang,String cmnd,String diaChi,String maPhong){
        boolean kq=false;
        String sql="insert into phieuthue(TenKhachHang,LoaiKhachHang,CMND,DiaChi,MaPhong) values('"+tenKhachHang+"'"
                +",'"+loaiKhachHang+"',"+cmnd+",'"+diaChi+"',"+maPhong+")";
        MySqlDataAccessHelper helper=new MySqlDataAccessHelper();
        helper.open();
        int n=helper.executeUpdate(sql);
        if(n==1){
            kq=true;
        }
        helper.close();
        return kq;
    }
    public static boolean xoaPhieuThue(int maKhachHang){
        boolean kq=false;
        String sql=String.format("delete from PhieuThue where MaKhachHang=%d",maKhachHang);
        MySqlDataAccessHelper helper=new MySqlDataAccessHelper();
        helper.open();
        int n=helper.executeUpdate(sql);
        if(n==1){
            kq=true;
        }
        helper.close();
        return kq;
    }
    public static boolean capNhapPhongBan(int maKhachHang,String tenKhachHang, String loaiKhachHang,int cmnd,String diaChi,int maPhong){
        boolean kq=false;
        String sql=String.format("update phieuthue set TenKhachHang='"+tenKhachHang+"'"+
              ",LoaiKhachHang='"+loaiKhachHang+"'"+
              ",CMND="+cmnd+""+
              ",DiaChi='"+diaChi+"'"+
              ",MaPhong="+maPhong+""+
              "  where MaKhachHang=%d" ,maKhachHang) ;
        MySqlDataAccessHelper helper=new MySqlDataAccessHelper();
        helper.open();
        int n=helper.executeUpdate(sql);
        if(n==1){
            kq=true;
        }
        helper.close();
        return kq;
    }
}
