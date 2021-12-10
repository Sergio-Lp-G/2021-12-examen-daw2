/**
 * 
 * @autor Angel profesor
 * 
 * 
 * 
 */

public class Combinatoria
{
//	Las combinaciones de n elementos tomados de m en m es el número de posibles muestras sin orden de m elementos distintos que se pueden extraer de un conjunto de n elementos. Debe cumplirse que n sea mayor o igual que m. Csub(n)super(m)=n!/(m!·(n-m)!)
	public static long combinaciones(int n, int m){}
	
	
//	Las combinaciones con repetición de n elementos tomados de m en m es el número de posibles muestras no ordenadas de m elementos no necesariamente distintos que se pueden extraer de un conjunto de n elementos. En este caso m puede ser mayor que n. CRsub(n)super(m)=(n+m-1)!/(m!·(n-1)!)
	public static long combinacionesRepeticion(int n, int m){}
	
	
//	Calcula el factorial pero ya no se usa porque se vio que que el máximo de n es 12. Da error si no se recoge una excepción aritmética.
	public static int factorial(int n){}
	
	
//	El factorial de n se define como el producto de todos los números enteros positivos desde 1 hasta n. Por convenio 0!=1. n!=n·(n-1)·(n-2)· · · 3·2·1
	public static long factorial(int n){}
	
	
//	Son las posibles ordenaciones de un conjunto de n elementos distintos. Psub(n)=n!=n·(n-1)·(n-2)· · · 3·2·1
	public static long permutaciones(int n){}
	
	
//	Son las posibles ordenaciones de una secuencia de n elementos entre los que hay algunos repetidos (uno se repite a veces, el siguiente b veces, otro c veces...). Psub(n)super(a,b,c,...)=n!/(a!·b!·c!·...)
	public static long permutacionesRepeticion(int n, int[] m){}
	
	
//	Las variaciones de n elementos tomados de m en m es el número de posibles muestras ordenadas de m elementos distintos que se pueden extraer de un conjunto de n elementos. m debe ser menor o igual a n. Vsub(n)super(m)=n·(n-1)·(n-2)· · ·(n-m+1). Si n=m se tiene Vsub(n)super(n)=Psub(n)=n!
	public static long variaciones(int n, int m){}
	
	
//	Las variaciones con repetición de n elementos tomados de m en m es el número de posibles muestras ordenadas de m elementos no necesariamente distintos que se pueden extraer de un conjunto de n elementos. m puede ser mayor que n. VRsub(n)super(m)=n^m
	public static long variacionesRepeticion(int n, int m){}
}