package fundamentos;

public class Wrappers {
		public static void main(String[] args) {
			
			//wrappers sao "variaveis" com metodos !!
			// sao declaradas com a Letra inicial maiuscula 
			Byte b = 100;
			Short s =1000;
			Integer i = 10000;
			Long l = 100000L;
			Double d =1092.00;
			Float f = 93020.390F;
		  
			f.doubleValue();
			d.floatValue();
			 // podemos convertar dados usando os wrappers
			l.intValue();
			
			System.out.println(b.byteValue());
			System.out.println(s.toString() + " ola mundo isso eh uma string ");
			System.out.println(i.floatValue()/7);
			System.out.println(l);
			
			//CASTING é uma pratica de comverção entre tipos primitivos 
			//ela consiste em exlicitar a converção logo depois do valor da variavel 
			// EX : int d = 9;
			//System.out.println((float)d);
			
		}
}
