public class Kelvin implements BaseConverter{
    @Override
    public void convert(double a) {
        double K=a + 273.15;
        System.out.println("Kelvin="+K);
    }

    public static void main(String[] args) {
        Selsiy selsiy=new Selsiy();
        Kelvin kelvin=new Kelvin();

        kelvin.convert(selsiy.give());
    }
}
