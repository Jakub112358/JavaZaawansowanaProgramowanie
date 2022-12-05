package zad5;

import java.io.Serializable;
import java.util.*;

//Zadanie 5.
//
//Zaimplementuj klasę SDAHashSet , która będzie implementować logikę HashSet. W tym celu zaimplementuj obsługę metod:
//• add
//• remove
//• size
//• contains
//• clear
public class SDAHashSet<E> extends AbstractSet<E> implements Set<E>, Serializable {
    private HashMap<E, Object> map;
    private static final Object OBJECT = new Object();

    public SDAHashSet() {
        this.map = new HashMap<>();
    }

    @Override
    public Iterator<E> iterator() {
        return map.keySet().iterator();
    }

    @Override
    public int size() {
        return map.size();
    }

    public boolean add(E element) {
        return map.put(element, OBJECT) == null;
    }

    public boolean remove(Object element) {
        return map.remove(element) != null;
    }

    public boolean contains(Object element) {
        return map.containsKey(element);
    }

    public void clear() {
        map.clear();
    }

}
