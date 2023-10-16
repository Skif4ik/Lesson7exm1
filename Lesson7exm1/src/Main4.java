public class Main4 {
    public static void main(String[] args) {

        //-128...127

        Integer i1 = new Integer(5);//упаковка
        Integer i2 = 7;//автоупаковка
        int p1 =i1.intValue();//распаковка
        int p2 = i2;//автораспаковка

        i1++;


        Integer i3 = 128;
        Integer i4 = 128;
        System.out.println(i3 == i4);

        Integer i5 = 5;
        Integer i6 = 5;
        System.out.println(i5 == i6);




    }
}
