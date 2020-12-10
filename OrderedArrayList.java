public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>{

  public boolean add(T element){
    int ind = 0;
    for(int i = 0; i < this.size(); i++){
      if(this.get(i).compareTo(element) >= 0){
        i = this.size();
      }
      else ind++;
    }
    super.add(ind, element);
    return true;
  }

  public void add(int index, T element){
    int ind = 0;
    for(int i = 0; i < this.size(); i++){
      if(this.get(i).compareTo(element) >= 0){
        i = this.size();
      }
      else ind++;
    }
     super.add(ind, element);
  }

  public T set(int index, T element){
    int ind = 0;
    for(int i = 0; i < this.size(); i++){
      if(this.get(i).compareTo(element) >= 0){
        i = this.size();
      }
      else ind++;
    }
    super.add(ind, element);
    if(ind < index){
      return this.remove(index + 1)
    }
    else return this.remove(index);

  }

  public OrderedArrayList(){
    super();
  }

  public OrderedArrayList(int startingCapacity){
    super(startingCapacity);
  }

}
