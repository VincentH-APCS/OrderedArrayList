import java.util.ArrayList;
public class Demo{
  public static void main(String[] args){
  OrderedArrayList<String> a = new OrderedArrayList<String>();
  Integer N = null;

  a.add(0, "aaa");
  System.out.println(a.add("bbb"));
  System.out.println(a.add("yyy"));
  System.out.println(a.add("rrd"));
  System.out.println(a.add("mml"));
  System.out.println(a.add("5pp"));
  System.out.print(a.get(0));
  System.out.print(a.get(1));
  System.out.print(a.get(2));
  System.out.print(a.get(3));
  System.out.print(a.get(4));
  System.out.print(a.get(5));
  System.out.println();
  System.out.println(a.set(0, "Konami"));
  System.out.print(a.get(0));
  System.out.print(a.get(1));
  System.out.print(a.get(2));
  System.out.print(a.get(3));
  System.out.print(a.get(4));
  System.out.print(a.get(5));
  //System.out.println(a.set(4, N));
  }
}
