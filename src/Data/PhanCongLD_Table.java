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
public class PhanCongLD_Table extends AbstractTableModel {
    private String Name[] = {"Thời gian","Tòa nhà","Tầng" ,"Đội phụ trách"};
    
    private Class classess[]  = {String.class,String.class,String.class,String.class};
    
    ArrayList<PhanCongLD> dspc = new ArrayList<PhanCongLD>();
    
    public PhanCongLD_Table(ArrayList<PhanCongLD> pc){
        dspc = pc;
    }
    
    @Override
    public int getRowCount() {
        return dspc.size();
    }
    
    @Override
    public int getColumnCount() {
        return Name.length;
    }
     @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0: return dspc.get(rowIndex).getNgay();
            
            case 1: return dspc.get(rowIndex).getToa();
            
            case 2: return dspc.get(rowIndex).getTang();
             
            case 3: return dspc.get(rowIndex).getDoiVS();
            
            
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
