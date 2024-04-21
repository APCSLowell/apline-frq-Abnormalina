public class APLine
{
  private int a1, b1, c1;
  public APLine(int a, int b, int c){
    a1 = a;
    b1 = b;
    c1 = c;
  }
  public double getSlope(){
    return -(double)a1/b1;
  }
  public boolean isOnline(int x, int y){
    if((a1*x + b1*x + c1)==0){
      return true;
    }
    return false;
  }
}
