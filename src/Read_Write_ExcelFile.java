
public class Read_Write_ExcelFile {

	public static void main(String[] args) {

		
		Xls_Reader d = new Xls_Reader("C:\\Testing\\NikulTest.xlsx");
		
		System.out.println(d.getCellData("Data1","Name", 3));
		System.out.println(d.getCellData("Data1", 1, 2));
		
		String email = d.getCellData("Data1", 1, 2);
		System.out.println(email);
		
		System.out.println(d.getRowCount("Data1"));
		
		System.out.println(d.getColumnCount("Data1"));
		
		d.setCellData("Data1", "Name", 11, "testing");
		System.out.println(d.getRowCount("Data1"));
		
		
	}

}
