/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Data;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author PhamThang

 */
public class QLNhanVien_Table extends AbstractTableModel {
    private String Name[] = {"Họ tên","Năm sinh ","Giới tính" ,"Vị trí","SĐT","Quê quán","CCCD"};
    
    private Class classess[]  = {String.class,String.class,String.class,String.class,String.class,String.class,String.class};
    
    ArrayList<NhanVien> dsNhanVien = new ArrayList<NhanVien>();
    
    public QLNhanVien_Table(ArrayList<NhanVien> nv){
        dsNhanVien = nv;
    }
    @Override
    public int getRowCount() {
        return dsNhanVien.size();
    }
    
    @Override
    public int getColumnCount() {
        return Name.length;
    }
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0: return dsNhanVien.get(rowIndex).getHoTen();
            
            case 1: return dsNhanVien.get(rowIndex).getNamSinh();
            
            case 2: return dsNhanVien.get(rowIndex).getGioiTinh();
             
            case 3: return dsNhanVien.get(rowIndex).getViTri();
            
            case 4: return dsNhanVien.get(rowIndex).getQueQuan();
            
            case 5: return dsNhanVien.get(rowIndex).getsDT();
            
            case 6: return dsNhanVien.get(rowIndex).getCccd();
            
            
            default : return null;
        }
    }
    
    public Class getColumnClass( int columnIndex){
        return classess[columnIndex];
    }
     public String getColumnName(int column){
        return Name[column];
    }
}
