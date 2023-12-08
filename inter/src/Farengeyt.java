public class Farengeyt implements BaseConverter{
    @Override
    public void convert(double a) {

        double F=a*(9/5) +32;
        System.out.println("Farengeyt="+F);
    }

    public static void main(String[] args) {
        Selsiy selsiy=new Selsiy();
        Farengeyt farengeyt=new Farengeyt();

        farengeyt.convert(selsiy.give());
    }
}
