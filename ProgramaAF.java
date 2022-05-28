public class ProgramaAF {

    public static void main(String[] args) {
        int []input={1,0,1,0,0};
        String inicio="q0";
        String fin="q4";
        String actual=inicio;
        boolean terminar=false;
        int contador=0;
        
        while(terminar==false){
			if(contador>input.length-1){
              System.out.println("Validacion de la cadena terminada");
              terminar=true;
              break;
          } 
//ESTADO Q0          
   		 	  if(actual=="q0"){  
   		 	  	if(input[contador]==1 ){
   		 	  		actual="q1";
                    System.out.println("Cambio de Q0 a Q1 con "+input[contador]);
   		 	  	}
   		 	  	contador++;
   		 	  	continue;
   		 	  }
//ESTADO Q1   		 	  
   		 	 if(actual=="q1"){  
   		 	  	if(input[contador]==0 ){
   		 	  		actual="q2";
                    System.out.println("Cambio de Q1 a Q2 con "+input[contador]);
   		 	  	}
   		 	  	contador++;
   		 	  	continue;
   		 	  }
//ESTADO Q2 
   		 	 if(actual=="q2"){  
   		 	  	if(input[contador]==1 ){
   		 	  		actual="q3";
                    System.out.println("Cambio de Q2 a Q3 con "+input[contador]);
   		 	  	}
   		 	  	contador++;
   		 	  	continue;
   		 	  }
//ESTADO Q3
   		 	 if(actual=="q3"){  
   		 	  	if(input[contador]==0 ){
   		 	  		actual="q4";
                    System.out.println("Cambio de Q3 a Q4 con "+input[contador]);
   		 	  	}
   		 	  	contador++;
   		 	  	continue;
   		 	  }
//ESTADO Q4
   		 	  if(input[contador]==0 && contador==input.length-1){
   		 	  		actual="q4";
                    System.out.println("Cambio de Q4 a Q4 con "+input[contador]);
                    break;
                    }if(input[contador]==0){
                         actual="q4";
                         System.out.println("Cambio de Q4 a Q4 con "+input[contador]);
						 }else{
                               System.out.println("Cadena NO valida");
                               break;
                               }
                               contador++;
                               continue;   		 	    		 	                	            	
        }
if(actual==fin){
   System.out.println("Cadena VALIDA");
   }else{
   		 System.out.println("Cadena INVALIDA");
   		 }        
   
	}
}