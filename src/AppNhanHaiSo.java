import java.util.Scanner;

public class AppNhanHaiSo {
	
	public static void main(String[] args) {//begin
		//gọi hàm
		nhapXuatDuLieu();
	}//end
	
	static void nhapXuatDuLieu() 
	{
		//khai báo 
		Scanner keyboardInput;
		float number1;
		float number2;
		float result;
		//
		keyboardInput = new Scanner(System.in);
		System.out.print("[NHAP VAO SO THU NHAT]:");
		number1 = keyboardInput.nextFloat();
		System.out.print("[NHAP VAO SO THU HAI]:");
		number2 = keyboardInput.nextFloat();
		//lời gọi hàm tinhTich2So()
		result = tinhTich2So(number1, number2);
		
		//in kết quả
		System.out.println("Ket qua tich 2 so: " + result);
		return;
	}//end hàm
	
	static float tinhTich2So(float a, float b)
	{
		float result = 0;
		result = a * b;
		
		return result;
	}//end hàm

}
