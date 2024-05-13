package Task2;

import java.util.Random;

public class LetterB extends LetterProcess{

    @Override
    public void process(StringA st) {
        st.st += "B";


        int ex = new Random().nextInt();
        if(ex % 4 == 0){
            throw new RuntimeException();
        }
//        System.out.println("B " + st.st);
    }

    @Override
    public void reverse(StringA st) {
        st.st = st.st.substring(0, st.st.length() - 1);

    }
}
