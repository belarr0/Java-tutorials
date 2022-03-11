import javax.swing.text.Style;

public class Cow extends Animals{

    public Cow(String say, int teeth) {
        setSay(say);
        setTeeth(teeth);
    }

    /*
    public String getSay(){ //перезапись значения getSay
        String say = super.getSay();
        return say + " New ! ";
    }
     */

    void mu(){
        System.out.println(getSay() + " во все " + getTeeth() + " зуба");
    }

}
