//①10-41　×

public class Main {
    public static void main (String[] args){
        //insert code here
    }
} 

class Sample {
    void test() {
        System.out.println("AAAA");
    }
}

// ①解答
new Sample.test ( );



//②11-43
// 〇〇〇〇に入れても良い型はどれ？

public class Sample {
    public static void main(String[] args) {
        // 〇〇〇〇　num = 1;        
        switch (num) {
            case 1:
            System.out.println("AAA");
                break;

            default:
            System.out.println("BBB");
        }
    }
}

byte long short boolean int char double float
String Byte Long Short Boolean Integer Character Double Float

// ②解答
byte  short  int char double 
String Byte Short Integer Character 


//③10-28
// 出力されるのは？
public class Main {
    public static void main (String[] args) {
        int[] array = { 4,8,16,32,64 };
        int i = 1;
        do {
            System.out.println(array[i]));
            i ++;
        } while ( i < array.length - 1);
    }
} 
// ③解答
8,16,32

//④6-3
// 〇〇に使える型を２つ答えよ
public class Sample {
    float divide (int a, int b) {
        return (float) a / (float) b;
    }
}
public class Main {
    public static void main(String[] args) {  
        Sample s = new Sample();
        //〇〇　result = s.divide(10, 2);
        System.out.println(result);
    }
}

// ④解答
float double

//⑤10-19
// 何が出力されるか

public class Main {
    public static void main(String[] args) {  
        double a = 0;
        int b = 120;
        a = (b >= 120) ? 0.5 : (b > 80) ? 0.2 : 0;
        System.out.println(10 * a);
        b = b - 50
        System.out.println(10 * a);
    }
}

//⑤解答
5
0


//⑥10-23
public class Sample {
    String name;
    int num;
    public Sample(String name, int num) {
        this.name = name;
        this.num = num;
    }
}

public class SubSample extends Sample {
    int price;
    public SubSample(int price) {
        this.price = price;
    }
    public SubSample(String name, int price) {
        super(name, num);
        this(price);
    }
}

public class Main {
    public static void main(String[] args) {
        SubSample s1 = new SubSample(100);
        SubSample s2 = new SubSample("sample", 200, 100);
        System.out.println(s1.name + "," + s1.name + "," + s1.price);
        System.out.println(s2.name + "," + s2.name + "," + s2.price);
    }
}
//⑥解答



//10-
//解答

//10-
//解答
//10-
//解答
