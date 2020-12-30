package Chapter6;

public class Mystery {
    public static void main(String[] args) {
        System.out.println( "abs of 7.5 : "+Math.abs(7.5) +"\n"
                + " floor of 7.5 : "+Math.floor(7.5 ) +"\n"
               + " abs of 0.0 : "+Math.abs(0.0) +"\n"
                + " ceil 0f 0.0 : "+Math.ceil(0.0) +"\n"
                + " abs of -6.4 : "+Math.abs(-6.4 )  +"\n"
                + " ceil of -6.4 : "+ Math.ceil(-6.4) +"\n"
                + " ceil of abs of -8 + floor of -5.5 : "+Math.ceil(-Math.abs(-8 + Math.floor(-5.5))));
    }
}
