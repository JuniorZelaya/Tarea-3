public class ejercicio
{
	// estos Ejercicios los hicimos en grupo 
	//janio Quiroz,Junior Zelaya,Roberto Chong , Maynor cruz
	//devuelve la suma de x y y
	//Bueno aqui creamos un static int para sumar las 2 variables
	static int sumar(int x, int y)
	{
		return x+y; // creamos return para que devuelva la suma 
	}
	
	//devuelve la resta de x y y
	static int restar(int x, int y)
	//Eyyy aqui creamos el static int para declarar
	{
		return x-y; //creamos return para que devuelva la resta
	}
	//devuelve la multiplicacion de x y y
	static int multiplicar(int x, int y)
	{
		return x*y; ////creamos return para que devuelva la multiplicacion
	}
	
	//devuelve el residuo de x y y 
	static int residuo(int x, int y)
	{
		return x%y;
	}
	
	//devuelve true si x es par, de lo cotrario devuelve false
	static boolean esPar(int x)
	{
		return x % 2 == 0;
	}
	
	//devuelve true si x es multiplo de 3, de lo cotrario devuelve false
	static boolean esMultiploDe3(int x)
	{
		return x % 3 == 0;
	}
	
	//devuelve el numero mayor (x o y)
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
		return edad >=18;
	}
	
	//devuelve true si x, y y z son pares
	//https://github.com/MikeSabillon/PrograRepo/blob/master/Progra1Tarea3/src/Ejercicios.java 
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
	//https://github.com/MikeSabillon/PrograRepo/blob/master/Progra1Tarea3/src/Ejercicios.java
	{
		if( x > y && x > z)
		{
			return x;
		}
		else if( y > x && y > z)
		{
			return y;
		}
		else if( z > x && z > y)
		{
			return z;
		}
		else
		{
			System.out.println("todos los numeros son iguales");
			return x;
		}
	}
	
	public static void main(String[] args)
	{
		
	}

}
