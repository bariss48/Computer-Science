
package iskambil_iki;
import java.util.Random;
import java.util.Arrays;
/**
 *
 * @author tee
 */
public class Iskambil_iki {
static Random random = new Random ();

    static int [] coupons;
    static int [] counts;
    static int couponCount;

    static void add (int index,int increment) {
	int newCount = counts [index] + increment;
	if (counts [index] == 0 && newCount != 0)
	    couponCount++;
	else if (counts [index] != 0 && newCount == 0)
	    couponCount--;
	counts [index] = newCount;
    }

    public static void main (String [] args) {
	final int ntrials = Integer.parseInt (args [1]);
	final double alpha = Double.parseDouble (args [2]);

	for (int N = 10;;N *= 2) {
	    int M = (int) Math.round (alpha * N * Math.log (N));

	    coupons = new int [M];
	    counts = new int [N];

	    long total = 0;
	    
	    for (int n = 0;n < ntrials;n++) {
		Arrays.fill (coupons,-1);
		Arrays.fill (counts,0);
		couponCount = 0;
		int pos = 0;
		for (int i = 1;;i++) {
		    int newCoupon = random.nextInt (N);
		    if (coupons [pos] != -1)
			add (coupons [pos],-1);
		    coupons [pos] = newCoupon;
		    add (coupons [pos],1);
		    if (couponCount == N) {
			total += i;
			break;
		    }
		    if (++pos == M)
			pos = 0;
		}
	    }

	    double mu = total / (double) ntrials - M;
	    double x = Math.pow (N,alpha - 1);
	    double asym = Math.pow (N,alpha) * Math.exp (1 / x);
	    double corr = asym * (1 + x);
            System.out.printf("%d & %d & %d & %d & %d & %.4f & %.4f\\\\\n",N,M,Math.round (mu),Math.round (asym),Math.round (corr),mu / asym,mu / corr);
        }
    }
}