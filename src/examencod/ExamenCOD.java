package examencod;

public class ExamenCOD {

    public static void main(String[] args) {
        int iN = 11;
        if (metodoTuyo(iN)) {
            System.out.println("Es numero primo");
        } else {
            System.out.println("NO es numero primo");
        }

        for (int x = 2; x < 1000; x++) {
            if (metodoTuyo(x)) {
                System.out.print(x + " ");
            }
        }
    }

    public static boolean metodoTuyo(int variable) {
        int k = 2;
        boolean aux = true;
        while ((aux) && (k != variable)) {
            if (variable % k == 0) {
                aux = false;
            }
            k++;
        }
        return aux;
    }

}
