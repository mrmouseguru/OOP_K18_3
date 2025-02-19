
public class NhanHaiSo {
	
	//khai báo biến
	float number1;
	float number2;
	//hàm
	
	NhanHaiSo(float _number1, float _number2)
	{
		number1 = _number1;
		number2 = _number2;
	}
	
	float tinhTich2So() {
		float tich;
		tich = number1 * number2;
		
		return tich;
	}

}
