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

}
