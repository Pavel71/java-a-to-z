//опробую передать пармаетры между 2я методами

class Test{

	void meth(int i, int j){

		i = 2;
		j = 4;
	}
}

class PeredachaParam2 {

 public static void main(String args[]){

 	Test ob = new Test ();

    int a = 10, b = 15;

    System.out.println("Do peredachi" + a + "" + b);

 // код передающий определенные данные другому методу

     ob.meth(a, b);

     System.out.println("Teper ob peredat a,b metode meth" + a + "" + b);

 }

}