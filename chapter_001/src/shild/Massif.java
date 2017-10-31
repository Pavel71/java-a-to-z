public class Massif{

public static void main (String args[]){

//Массивы данных типа столбцов

int month_days[];

month_days = new int [12];

/*Тоже самое

int month_days[] =new int [12];

*/

month_days[0] = 31;
month_days[1] = 28;
month_days[2] = 31;
month_days[3] = 30;
month_days[4] = 31;
month_days[5] = 30;
month_days[6] = 29;
month_days[7] = 31;
month_days[8] = 30;
month_days[9] = 31;
month_days[10] = 31;
month_days[11] = 30;
System.out.println("In Month mart" + month_days[3] + "days");

/*
Таже самая программа только в укороченном варианте
class Massif{

	public static void main(String args[]){
	int month_days = {31,28,31,30,31,31,30,29,30,31,29,30};
	System.out.println("In Month mart" + month_days[3] + "days");
	}
}

*/
}

}