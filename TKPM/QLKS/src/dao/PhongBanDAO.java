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
public class PhongBanDAO {
    public static ArrayList<PhongBanPOJO> layDanhSachPhongBan(){
        ArrayList<PhongBanPOJO> ds=new ArrayList<PhongBanPOJO>();
        try {
            String sql="select * from phongban";
            MySqlDataAccessHelper helper=new MySqlDataAccessHelper();
            helper.open();
            ResultSet rs=helper.executeQuery(sql);
            while(rs.next()){
                PhongBanPOJO pb=new PhongBanPOJO();
                pb.setMaPhongBan(rs.getInt("MaPhongBan"));
                pb.setTenPhongBan(rs.getString("TenPhongBan"));
                ds.add(pb);
            }
            helper.close();
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        return ds;
    }
    /* Tim Kiem*/
    
    public static ArrayList<PhongBanPOJO> timPhongBan(String ten){
        ArrayList<PhongBanPOJO> ds=new ArrayList<PhongBanPOJO>();
        try {
            String sql="select * from phongban where TenPhongBan like '%"+ten+"%'";
            MySqlDataAccessHelper helper=new MySqlDataAccessHelper();
            helper.open();
            ResultSet rs=helper.executeQuery(sql);
            while(rs.next()){
                PhongBanPOJO pb=new PhongBanPOJO();
                pb.setMaPhongBan(rs.getInt("MaPhongBan"));
                pb.setTenPhongBan(rs.getString("TenPhongBan"));
                ds.add(pb);
            }
            helper.close();
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        return ds;
    }
}
