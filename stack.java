public class stack{
    private static final int default_size=5;
    private int[] arr;
    private int top=-1;
    private int size=0;
    public stack(int size){
        this.arr=new int[size];
    }
    public stack(){
        this(default_size);
    }
    public void push(int n){
        if(isFull()){
            int[] temp=new int[arr.length*2];
            for(int i=0;i<arr.length;i++){
                temp[i]=arr[i];
            }
            arr=temp;
        }
        arr[++top]=n;
        size++;
    }

    private boolean isFull() {
        return (top==size-1);
    }

    public int pop() throws Exception {
        if(isEmpty()){
            throw new Exception("empty stack! no iem can't be popped out");
        }
        int temp=arr[top];
        top--;
        size--;
        return temp;
    }
    private boolean isEmpty() {
        return (top==-1);
    }
    public void display() {
        if(isEmpty()){
            System.out.println("your stack is empty!");
            return;
        }
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

