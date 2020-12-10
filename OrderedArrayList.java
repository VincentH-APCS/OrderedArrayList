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
    this.add(element);
    return this.remove(ind);
  }

  public OrderedArrayList(){
    super();
  }

  public OrderedArrayList(int startingCapacity){
    super(startingCapacity);
  }

}
