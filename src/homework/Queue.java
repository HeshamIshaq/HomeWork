/**
 * Created by HESHAM Mohammed on 3/15/2021.
 */
public interface Queue<E>  {
    boolean isEmpty();
    int size();
    E first();
    void enqueue(E element);
    E dequeue();


}
