public class ex7_ordeminversa {

    public static void main(String[] args) {

    int[] vetor = { -5, 15, 50, 8, 4};

        //System.out.println(vetor.length);//

        int count = 0;
        while(count < (vetor.length)){

            System.out.print(vetor[count] + "  ");
            count++;
        }

        System.out.println("Vetor: ");
        for( int i =(vetor.length -1); i >= 0 ; i--){

            System.out.print(vetor[i] + "  ");

        }
    }
}
