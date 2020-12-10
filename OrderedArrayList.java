public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>{

  public boolean add(T element){
    int ind = 0;
    for(int i = 0; i < this.size(); i++){
      if(this.get(i).compareTo(element) == 0){
        i = this.size();
      }
      else if(this.get(i).compareTo(element) > 0){
        ind++;
      }
      else this.add(ind, element);
    }
   return true;
  }

  public void add(int index, T element){
    int ind = 0;
    for(int i = 0; i < this.size(); i++){
      if(this.get(i).compareTo(element) == 0){
        i = this.size();
      }
      else if(this.get(i).compareTo(element) > 0){
        ind++;
      }
      else super.add(ind, element);
    }
  }

  public T set(int index, T element){
    int ind = 0;
    for(int i = 0; i < this.size(); i++){
      if(this.get(i).compareTo(element) == 0){
        i = this.size();
      }
      else if(this.get(i).compareTo(element) > 0){
        ind++;
      }
      else return super.set(ind, element);
    }
    return super.set(ind, element);
  }

  public OrderedArrayList(){
    super();
  }

  public OrderedArrayList(int startingCapacity){
    super(startingCapacity);
  }

}
