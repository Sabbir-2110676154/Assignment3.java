import java.util.Scanner;

public class ArrayWithTenRandomInteger {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int ArraySize = 10;
        int[] Array = new int[ArraySize];
        for(int i = 0; i < Array.length;i++){
            Array[i] = in.nextInt();
        }

        EvenIndex evenIndex = new EvenIndex(Array);
        EvenElement evenElement = new EvenElement(Array);
        ArrayRev arrayRev = new ArrayRev(Array);
        Element element = new Element(Array);
    }
}
class EvenIndex {
    public EvenIndex(int[] Array) {
        System.out.println("Printing every element at an even index:");
        for (int i = 1; i < Array.length; i += 2) {
            System.out.printf(Array[i] + "  ");
        }
        System.out.println();
    }
}



###2




public class RandomNumberArray {
    public static void main(String[] args) {
        final int LENGTH=10;
        int[] array = new  int[LENGTH];
        for(int i=0;i<LENGTH;i++)
        {
            array[i]=(int)(10*Math.random());
        }
        for(int i=1;i<LENGTH;i=i+2)
        {
            System.out.print(array[i]+" ");


        }
        System.out.println();
        for (int i=0;i<LENGTH;i++)
        {
            if(array[i]%2==0)
            {
                System.out.print(array[i]+" ");
            }


        }
        System.out.println();
        for (int i=LENGTH-1;i>=0;i--)
        {
            System.out.print(array[i]+" ");



        }
        System.out.println();
        System.out.println(array[0] +" "+array[(array.length-1)]);




    }
}

class EvenElement {
    public EvenElement(int[] Array){
        System.out.println("Printing every even element:");
        for(int it : Array){
            if(it%2==0)
                System.out.printf(it+"  ");
        }
        System.out.println();
    }
}

class ArrayRev{
    public ArrayRev(int[] Array){
        System.out.println("All elements in reverse order:");
        for(int i = Array.length - 1; i >=0;i--){
            System.out.printf(Array[i]+"  ");
        }
        System.out.println();
    }
}

class Element{
    public Element(int[] Array){
        System.out.println("Only the first and last element");
        System.out.println(Array[0]+"   "+Array[Array.length-1]);
    }
}


###3



public class Sum {
    int small;
    int sum=0;
    public Sum(int[] array) {
        int l=array.length;
        small=array[0];
        for(int i=0;i<l;i++)
        {
            sum=sum+array[i];
            if(array[i]<small)
            {
                small=array[i];
            }
        }
    }
    public int getSum()
    {
        return  sum=sum-small;
    }
    public int getDiference()
    {
        return sum-small;
    }

}


####4


        import java.util.*;
public class SumWithoutSmallest {
    public static void main(String[] args) {

        int[] array =new int[10];
        System.out.println("Enter 10 number :");
        Scanner in=new Scanner(System.in);
        for(int i=0;i<10;i++)
        {
            array[i]=in.nextInt();


        }
        Sum s=new Sum(array);

        System.out.println("Sum of the array without smallest element is:\n"+s.getSum()+"\nDeference between sum and smallest element is :\n"+s.getDiference());


    }
}