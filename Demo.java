import java.util.ArrayList;
public class Demo{
  public static void main(String[] args){
  NoNullArrayList<Integer> a = new NoNullArrayList<Integer>();
  Integer N = null;

  System.out.println(a.add(5));
  a.add(1,2);
  System.out.println(a.add(55));
  System.out.println(a.set(1, N));
  }
}
