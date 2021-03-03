public class Komplex {
   public double re;
   public double im;

   public Komplex(double rik, double hitt) {
      this.re = rik;
      this.im = hitt;
   }

   @Override
   public String toString() {
      return re + "+" + im + "i"; //skriv ut talet
   }

   public Komplex add(Komplex out) {
      double real = re + out.im;
      double fake = re + out.im;
      return new (real, fake);
   }
}
