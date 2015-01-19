
package examencod;

public class ExamenCOD {

    public static void main(String[] args) {
 int iN = 11;
            	if (metodoMio(iN))
System.out.println("Es numero primo");
else
 System.out.println("NO es numero primo");           	 
          	 
for (int x=2;x<1000;x++) {
if (metodoMio(x))
System.out.print(x + " ");                         	 
}         	 
	}
    //1-al finalizar el metodoMIo la variable=16 j=3 y la aux=false
    //2-al finalizar el metodoMio la variable=22 y j=22 y la aux=true
public static boolean metodoMio(int variable){
int j = 2;
boolean aux=true;
while ((aux) && (j!=variable)){
if (variable % j == 0)
aux = false;
j++;
}
return aux;
  } 	 
    
}
