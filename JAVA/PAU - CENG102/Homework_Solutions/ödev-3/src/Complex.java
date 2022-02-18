
public class Complex {

    private double reel;
    private double imaginel;


    public Complex(double reel,double imaginel)
    {
        this.reel=reel;
        this.imaginel=imaginel;
    }

    public double getReal()
    {
        return this.reel;
    }

    public double getImaginary()
    {
        return this.reel;
    }

    public void setReel(double reel) {
        this.reel = reel;
    }

    public void setImaginel(double imaginel) {
        this.imaginel = imaginel;
    }

    public Complex zeta()
    {
        double bolum=reel*reel+imaginel*imaginel;
        return new Complex(reel/bolum,-imaginel/bolum);
    }

    // toplama fonksiyonu

    public Complex add(Complex newnumber)
    {
        double x=reel+newnumber.reel;
        double y=imaginel+newnumber.imaginel;

        return new Complex(x,y);
    }

    //çıkarma fonksiyonu

    public Complex subtract(Complex newnumber)
    {
        double sub=reel-newnumber.reel;
        double sub2=imaginel-newnumber.imaginel;
        return new Complex(sub,sub2);
    }

    //çarpma fonksiyonu

    public Complex multiply(Complex newnumber)
    {
        double op1=imaginel*newnumber.reel+reel*newnumber.imaginel;
        double mul2=imaginel*newnumber.imaginel*-1;
        double mul=newnumber.reel*reel+mul2;
        return new Complex(mul,op1);
    }

}

