public class pendivide {
    public static void main(String[] args){
        
        int pens = 14;
        int rd = pens%3;
        int rpens = (pens-rd)/3;

        System.out.printf("The Pen Per Student is "+rpens+" and the remaining pen not distributed is "+rd);
    }
}
