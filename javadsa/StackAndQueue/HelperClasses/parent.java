package javadsa.StackAndQueue.HelperClasses;

public class parent {
    public int arr[] = new int[100];
    public int size;
    public static int head = -1;

    public  void StackCode(){
        String s ="""
                
         public void push(int arr[], int size) {
        if (head == size - 1) {
            System.out.println("full the size");
        } else {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the value");
            int value = sc.nextInt();
            head++;
            arr[head] = value;
        }
    }

    public void pop(int arr[], int size) {
        if (head == -1) {
            System.out.println("empty the stack");
        } else {
            int value = arr[head];
            arr[head] = 0;
            head--;
            System.out.println("value popped " + value);
        }
    }

    public void peek(int arr[], int size) {
        if (head == -1) {
            System.out.println("empty the stack");
        } else {
            System.out.println("top element is " + arr[head]);
        }
    }

    public void display(int arr[], int size) {
        if (head == -1) {
            System.out.println("empty the stack");
        } else {
            for (int i = head; i >= 0; i--) {
                System.out.println(arr[i]);
            }
        }
    }
                """;
                System.out.println(s);
        
    }


    public void CodeQueue(){
        String s ="""
   // Add element to queue
    public void add() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value to add");
        int value = sc.nextInt();
        if (rear == capacity - 1) {
            System.out.println("Queue is Full");
            return;
        }

        elements[++rear] = value;
    }

    // Remove element from queue
    public void sub() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
          
        }

        int removedValue = elements[front];

        // Shift elements only if needed
        for (int i = front; i < rear; i++) {
            elements[i] = elements[i + 1];
        }
        rear--;
        System.out.println("Removed value: " + removedValue);
    }

    // View front element
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        System.out.println("Front element is: " + elements[front]);
        return elements[front];
    }

    // Check if queue is empty
    private boolean isEmpty() {
        return rear < front;
    }
""";
                System.out.println(s);
    }
        


  public void CodeCircularQueue(){
    String s="""
    int arr[];
    int F=-1;
    int R=-1;
    int capacity;
    public void enqueue(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the vlaue :");
        int value =sc.nextInt();
        if(F==(R+1)%capacity){
            System.out.println("Queue are full");
            return;
        }
        if((F==-1)){
            F=0;
        }
        R=(R+1)%capacity;
        arr[R]=value;
       
    }

    public int dequeue(){
        if(F==-1){
            System.out.println("Queue are Empty !");
            return -1;
        }
        int value =arr[F];
        arr[F]=0;

        if(F==R){
            F=-1;
            R=-1;
        }else{
            F=(F+1)%capacity;
        }
      
        return value;
    }

    public int peak(){
        if(F==-1){
            System.out.println("Queue are Empty !");
            return -1;
        }
        int value =arr[F];
        return value;
    }

    public void display(){
        if(F==-1){
            System.out.println("Queue are Empty !");
        }
        for (int i = F; ; i = (i + 1) % capacity) {
            System.out.print(arr[i] + " ");
            if (i == R) {
                break;
            }
        }
    }
            """;
    System.out.println(s);
  }  
}
