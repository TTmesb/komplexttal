public class Komplex {
    public double re;                       //re: 3.0
    public double im;                      //im: 2.0

    public Komplex(double rik, double hitt) {
        this.re = rik;
        this.im = hitt;
    }

    @Override
    public String toString() {
        return re + "+" + im + "i";
    }         //skriv ut talet 

    public Komplex add(Komplex out) {       //out: "4.0+1.0i"
        double real = this.re + out.re;     // real: 7.0 re:3.0
        double fake = this.im + out.im;     // fake: 3.0 im: 2.0 out: "4.0+1.01"
        Komplex svar = new Komplex(real, fake); // c: "7.0+3.0i" real:7.0 fake:3.0
        return svar;                           //c: "7.0+3.0i"
    }


    public Komplex multiply(Komplex out) {
        double real = this.re * out.re - (this.im * out.im); // (3.0,2.0i)*(4.0,1.0i)= 10 = 12+3i+8i-2 = 10+11i
        double fake = this.im * out.re + this.re;// (3.0,2.0i)*(4.0,1.0i)= 11i
        Komplex c = new Komplex(real, fake);
        return c;
    }

    public double arg() {
     return a;
    }
}