public class Complex
{
  private int real;
  private int img;
  private int diff;
  private double undiff;

  public Complex(int r, int i)
  {
    real = r;
    img = i;
    diff = r - i;
    undiff = -diff + 2;
  }

  int getReal()
  {
    return real;
  }

  int getImg()
  {
    return img;
  }
  
  int getDiff()
  {
	  return diff;
  }
  
}
