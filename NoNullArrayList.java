import java.util.ArrayList;
public class NoNullArrayList<T> extends ArrayList<T>{

  public boolean add(T element){
    if(element == null){
      throw new IllegalArgumentException("No Nulls!");
    }
    else return super.add(element);
  }

  public void add(int index, T element){
    if(element == null){
      throw new IllegalArgumentException("No Nulls!");
    }
    else super.add(index, element);
  }

  public T set(int index, T element){
    if(element == null){
      throw new IllegalArgumentException("No Nulls!");
    }
    else return super.set(index, element);
  }

  public NoNullArrayList(){
    super();
  }

  public NoNullArrayList(int startingCapacity){
    super(startingCapacity);
  }

}
//: ]
