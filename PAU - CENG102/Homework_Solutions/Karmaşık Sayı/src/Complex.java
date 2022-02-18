    public class Complex {

    private double reel;
    ı



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

    public Complex reciprocal()
    {
        double bölüm=reel*reel+imaginel*imaginel;
        return new Complex(reel/bölüm,-imaginel/bölüm);
    }

    public Complex add(Complex newnumber)
    {
        double x=reel+newnumber.reel;
        double y=imaginel+newnumber.imaginel;

        return new Complex(x,y);
    }

    //subtract operation

    public Complex subtract(Complex newnumber)
    {
        double sub=reel-newnumber.reel;
        double sub2=imaginel-newnumber.imaginel;
        return new Complex(sub,sub2);
    }

    //multiply operation

    public Complex multiply(Complex newnumber)
    {
        double op1=imaginel*newnumber.reel+reel*newnumber.imaginel;
        double mul2=imaginel*newnumber.imaginel*-1;
        double mul=newnumber.reel*reel+mul2;
        return new Complex(mul,op1);
    }


}
