package Arrays_ED_Colections;

public class EqualsXHashcode {
	public class Usuario{
		String nome;
		public boolean equals(Object obj) {
			// TODO Auto-generated method stub
			return super.equals(obj);
		}
	}
	public static void main(String[] args) {
	      String X="0.9";
	      X.equals(X);//metodo mais lento que verifica se o endereço de memoria é igual 
	      X.hashCode();// separa os elementos q n sao iguais e os podem ser iguais 
	      
	}
}
