
package utilidades.Table;

import java.util.List;
import java.util.function.Function;
import javax.swing.table.AbstractTableModel;


public class GeneralTableModel<T> extends AbstractTableModel {
   
    private List<T> data;
    private String[] columnNames;
    private Function<T, Object[]> mapper;

    public GeneralTableModel(List<T> data, String[] columnNames, Function<T, Object[]> mapper) {
        this.data = data;
        this.columnNames = columnNames;
        this.mapper = mapper;
    }

    @Override
    public int getRowCount() {
        return data.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Object[] rowData = mapper.apply(data.get(rowIndex));
        return rowData[columnIndex];
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }

    // Método para obtener el objeto T completo
    public T getObjectAt(int rowIndex) {
        return data.get(rowIndex);
    }
     
}
