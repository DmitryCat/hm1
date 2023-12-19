package Service;

import java.util.List;

public interface StoreService {
    List<Integer> add(List<Integer> ids);
    List<Integer> get();
}