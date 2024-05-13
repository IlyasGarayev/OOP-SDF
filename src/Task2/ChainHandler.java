package Task2;

public class ChainHandler {
    LetterProcess letterProcess;

    public ChainHandler(){
        letterProcess = new LetterA();

        LetterB letterB = new LetterB();
        letterProcess.setNext(letterB);
        letterB.setPrevious(letterProcess);

        LetterC letterC = new LetterC();
        letterB.setNext(letterC);
        letterC.setPrevious(letterB);
    }
    public void startTask(StringA st){
        letterProcess.doNext(st);
    }
}
