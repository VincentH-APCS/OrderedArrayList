public class NoNullArrayList<T> extends ArrayList<T>{

  public boolean add(E e){
    if(e == null){
      throw new IllegalargumentExcecption("No Nulls!")
    }
    else super.add(e);
  }
}
