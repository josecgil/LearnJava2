

public class Stack {
    // 3 1 5
    //push(7) ok
    // 7 3 1 5
    //7<-pop() ?
    // 3 1 5
    //3<-init()
    //3 1 5
    //5<-end()
    //3 1 5

    private int[] numbers=new int[10];
    private int nextIndex=0;



    //10 20 30 40 50 60
    public static void main(String[] args) {



        Stack s=new Stack();
        s.Push(10);
        s.Push(20);
        s.Push(30);
        s.Push(40);
        int firstNumber=s.Pop();
        System.out.println(firstNumber); //40
        System.out.println(s.asString()); // 30 20 10
    }

    public int Pop() {
        int popNumber=numbers[nextIndex-1];
        nextIndex--;
        return popNumber;
    }

    public String asString() {
        String numberAsStr="";
        for (int i=nextIndex-1;i>=0;i--) {
            numberAsStr=numberAsStr+" "+numbers[i];
        }
        return numberAsStr;
    }

    public void Push(int i) {
        numbers[nextIndex]=i;
        nextIndex++;
    }
}

