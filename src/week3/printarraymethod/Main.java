package week3.printarraymethod;

public class Main {

    public static void main(String[] args) {

        // Generic metot olan printArray girdileri

        String[] elements = {"Sigarayı","acilen","bırakmalısın", "." , "Eğer","bırakmaszsan","................"};

        Integer[] numbers = {1,1,2,3,5,8,13,21,34,55,89};

        Boolean[] trueOrFalse = {true,false,true};

        Double[] perfectNumbers = {Math.PI,1/ Math.PI ,Math.E,1 / Math.E, Math.TAU,1 / Math.TAU , Math.log10(12),1/Math.log10(12)};


        // Metotun uygulanması ve satır atlama

        printArray(elements);

        System.out.println();

        printArray(numbers);

        System.out.println();

        printArray(trueOrFalse);

        System.out.println();

        printArray(perfectNumbers);

    }

    // Array türünden aldığı her tipte elemanları boşluklu yazdırma metotu

        public static <U> void printArray(U[] array){

            for (U elements : array) {
                System.out.print(elements + " " );
            }

    }
}


