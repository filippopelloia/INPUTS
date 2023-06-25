import java.util.Arrays;

public class Array {
    public static void main(String[] args){
        int box[] = {55, 11, 44, 22, 33};

        box[2] = 100;

        int lunghezza = box.length;

        Arrays.sort(box);

        System.out.println(Arrays.toString(box));
        System.out.printf("l\'array è lungo: %d", lunghezza);

    }
}
