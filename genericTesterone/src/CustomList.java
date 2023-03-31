import java.util.ArrayList;
import java.util.List;

class CustomList<E>{
private List<E> list=new ArrayList<E>();

public void addItem(E value){
    list.add(value);
}
public E getItem(int index){
    return list.get(index);
}
}
