package restassured.restassured;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

//import org.testng.annotations.Test;

import org.junit.Test;
import org.junit.Test;


public class automation 
{

  @Test
  public void test_numbers()
  {
	  
	  given().
	  when().
	  get("http://ergast.com/api/f1/2017/circuits.json").
	  then().
	  assertThat().
	  body("MRData.CircuitTable.Circuits.circuitId",hasSize(20));
	 
	  
  }//	public void readXLSXFile() {
  //
  //
//  	InputStream XlsxFileToRead = null;
//  	XSSFWorkbook workbook = null;
//  	String fileName="/Users/lovekesh.madaan/Desktop/datadriventesting.xlsx";
//  	try {
//  		XlsxFileToRead = new FileInputStream(fileName);
//  		
//  		//Getting the workbook instance for xlsx file
//  		workbook = new XSSFWorkbook(XlsxFileToRead);
//  	} catch (FileNotFoundException e) {
//  		e.printStackTrace();
//  	} catch (IOException e) {
//  		e.printStackTrace();
//  	}
  //
//  	//getting the first sheet from the workbook using sheet name. 
//  	// We can also pass the index of the sheet which starts from '0'.
//  	XSSFSheet sheet = workbook.getSheet("Sheet1");
//  	XSSFRow row;
//  	XSSFCell cell;	
//  	int rows =sheet.getFirstRowNum();
//      	 int rowe= sheet.getLastRowNum();
//      	 for (int i=rows+1;i<=rowe;i++)
//      	 {   
//      		 Row r=sheet.getRow(i);
//      		 String expres;
//               
//      		
  //   String url=r.getCell(2).getStringCellValue();
  //   System.out.print(" url is  "+ url);
  //   expres=r.getCell(3).getStringCellValue();
//  	System.out.print("expected code is "+expres);         
  //   Response res=RestAssured.get(url);
//       		int code =res.getStatusCode();
//       		System.out.print("code is "+code);  		
//       		Assert.assertEquals(code,expres);
//       
//      	 }
//      	 
//      	 
//      	 
//      }
//       
//       
//       


}

