package my.lambdas;

// Пример класса ожидающего передачи в методы экземпляра
// функционального интерфейса

import java.util.ArrayList;
import java.util.List;

public class IntegerCollectionManager1 {

    public List<Integer> transform(List<Integer> data, TransformInteger action) {
        List<Integer> results = new ArrayList<Integer>();
        for (int x:data){
            results.add(action.doTransform(x));
        }
        return results;
    }
}
