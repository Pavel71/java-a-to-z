//Условныйй оператор If

class IfSample {

 public static void main(String args[]){

 	int x,y;

 	x = 10;
 	y = 20;

 	if (x < y) System.out.println ("X<Y");

 	x = x * 2;

 	if (x == y) System.out.println ("X = Y");

 	x = x * 2;

 	if (x > y) System.out.println ("X > Y");

 	//Условие не выполняется т.к Х=10

 	if (x == y) System.out.println ("X = Y");
 }

}