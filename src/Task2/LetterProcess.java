package Task2;

import java.util.Random;

public abstract class LetterProcess {
    private LetterProcess next;
    private LetterProcess previous;

    public void setNext(LetterProcess next) {
        this.next = next;
    }

    public void setPrevious(LetterProcess previous) {
        this.previous = previous;
    }

    public void doNext(StringA st){
        try{
            process(st);
            if(next != null){
                next.doNext(st);
            }

        }
        catch(RuntimeException e){
                doPrevious(st);
        }
    }

    public void doPrevious(StringA st){
        reverse(st);
        if (previous != null){
            previous.doPrevious(st);
        }

    }


    public abstract void process(StringA st);

    public abstract void reverse(StringA st);
}
