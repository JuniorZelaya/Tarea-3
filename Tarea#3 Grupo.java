public class ejercicio
{
	// estos Ejercicios los hicimos en grupo 
	//janio Quiroz,Junior Zelaya,Roberto Chong , Maynor cruz
	//devuelve la suma de x y y
	//La variable int sumar, la utilizamos para declarar la suma
	static int sumar(int x, int y)
	{
		return x+y; // creamos return para que devuelva la suma 
	}
	
	//devuelve la resta de x y y
	static int restar(int x, int y)
	//La variable int restar, la utilizamos para declarar una resta
	{
		return x-y; //creamos return para que devuelva la resta
	}
	//devuelve la multiplicacion de x y y
	//La variable int multiplicar, la utilizamos para declarar una multiplicacion 
	static int multiplicar(int x, int y)
	{
		return x*y; //Se crea el return para que devuelva una multiplicacion 
	
	//devuelve el residuo de x y y 
	//El residuo es el resultado de la division de X y Y
	static int residuo(int x, int y)
	{
		return x%y;
	}
	
	//devuelve true si x es par, de lo cotrario devuelve false
	//Hay que ver que x sea divisible entre dos para que se cumpla la funcion, y en este caso si lo es.
	static boolean esPar(int x)
	{
		return x % 2 == 0;
	}
	
	//devuelve true si x es multiplo de 3, de lo cotrario devuelve false
	//X es multiplo de 3 por que es dividible entre ese numero 
	static boolean esMultiploDe3(int x)
	{
		return x % 3 == 0;
	}
	
	//devuelve el numero mayor (x o y)
	//se tiene que cumplir cualquiera de las condiciones para que retorne el valor
	static int getMayor(int x,int y)
	{
		if (x > y)
		    return x;
		else
			return y;
	}
	
	//devuelve true si la edad es mayor o igual a 18
	static boolean esMayorDeEdad(int edad)
	{
		return edad >=18;//Si la edad que ingresamos es mayor o igual a 18 se cumple la condicion y retorna true
	
	}
	
	//devuelve true si x, y y z son pares
	//https://github.com/MikeSabillon/PrograRepo/blob/master/Progra1Tarea3/src/Ejercicios.java 
	///si X Y y Z son dividibles entre dos devuelve true
	static boolean sonPares(int x, int y, int z)
	{
		{
			if( (x % 2) ==0 && (y % 2) == 0 && (z % 2) == 0 )
			{
				return true;
			}
			return false;
		}
	}
	
	//Devuelve el numero mayor entre x, y y z
	
	static int getMayorDe3(int x, int y, int z)
	// si se cumple la condicion x es mayor que Y y Z devuelve x
		if ((x>y)&&(x>z))
		{
		return x;
	}else if ((y>x)&&(y>z))
	{
		return y;
	}else if ((z>x)&&(z>y))
	{
		return z;
	}
	return x;
	}
	
	public static void main(String[] args)
	{
		
	}

}
