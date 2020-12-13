public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>{

  public boolean add(T element){
    int ind = 0;
    super.add(element);
    super.remove(this.size() - 1);
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
    if(index > this.size()){
      throw new IndexOutOfBoundsException("Index larger than size of the Ordered Array List");
    }
    super.add(index, element);
    super.remove(index);
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
    if(index > this.size()){
      throw new IndexOutOfBoundsException("Index larger than size of the Ordered Array List");
    }
    super.add(element);
    super.remove(this.size() - 1);
    int ind = 0;
    for(int i = 0; i < this.size(); i++){
      if(this.get(i).compareTo(element) >= 0){
        i = this.size();
      }
      else ind++;
    }
    T ans = super.get(index);
    super.remove(index);
    this.add(ind,element);
    return ans;
  }

  public OrderedArrayList(){
    super();
  }

  public OrderedArrayList(int startingCapacity){
    super(startingCapacity);
  }
}

//:]
