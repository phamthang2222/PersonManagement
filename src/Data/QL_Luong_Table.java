/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author tranq
 */
public class QL_Luong_Table extends AbstractTableModel {
    private String Name[] = {"Họ Tên","Vị Trí","SĐT" ,"Quê Quán","Lương"};
    
    private Class classess[]  = {String.class,String.class,String.class,String.class,Float.class};
    
    ArrayList<DanhSach_Luong> dsLuong = new ArrayList<DanhSach_Luong>();

    public QL_Luong_Table(ArrayList<DanhSach_Luong> Luong) {
        dsLuong = Luong;
    }
    @Override
    public int getRowCount() {
        return dsLuong.size();
    }

    @Override
    public int getColumnCount() {
        return Name.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0: return dsLuong.get(rowIndex).getHoTen();
            
            case 1: return dsLuong.get(rowIndex).getViTri();
            
            case 2: return dsLuong.get(rowIndex).getsDT();
             
            case 3: return dsLuong.get(rowIndex).getQueQuan();
            
            case 4: return dsLuong.get(rowIndex).getLuong();
            
            default : return null;
        }
    }
    
    public Class getColumnClass(int columnIndex){
        return classess[columnIndex];
    }
    
    public String getColumnName(int column){
        return Name[column];
    }
}
