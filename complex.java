public class Complex
{
  private int real;
  private int img;
  private int diff;

  public Complex(int r, int i)
  {
    real = r;
    img = i;
    diff = r - i;
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
