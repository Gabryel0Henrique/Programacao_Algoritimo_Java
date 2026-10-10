public class App {
    public static void main(String[] args) throws Exception {
        //Contagem Regressiva
        for(int i=10; i>-1; i--){
            if(i==0){
                System.out.println("Você morreu");
                continue;
                
            }
            if(i==1){
                 System.out.printf("Falta %d dia para você morrer\n",i);
                continue;
            }

            System.out.printf("Faltam %d dias para você morrer\n",i);
            
        }
    }
}