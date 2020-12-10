public class NoNullArrayList<T> extends ArrayList<T>{

  public boolean add(T element){
    if(element == null){
      throw new IllegalArgumentException("No Nulls!")
    }
    else super.add(element);
  }

  public boolean add(int index, T element){
    if(element == null){
      throw new IllegalArgumentException("No Nulls!")
    }
    else super.add(index, element);
  }

  public T set(int index, T element){
    if(element == null){
      throw new IllegalArgumentException("No Nulls!")
    }
    else super.set(index, element);
  }
}
