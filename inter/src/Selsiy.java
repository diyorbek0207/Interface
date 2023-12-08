
public class Selsiy implements BaseConverter{

    private double gradus=45;
    @Override
    public void convert(double a) {
        System.out.println("selsiy="+a);
    }



    public double give(){
        //System.out.println(gradus);
        return gradus;
    }

    public static void main(String[] args) {
        Selsiy selsiy=new Selsiy();
        selsiy.convert(selsiy.gradus);
        selsiy.give();

    }
}
