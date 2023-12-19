package Controller;

import Service.StoreService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("order")
@RestController
public class StoreController {

    private final StoreService storeService;

    public StoreController(StoreService storeService) {
        this.storeService = storeService;
    }

    @GetMapping("add")
    public List<Integer> add(@RequestParam("ids") List<Integer> ids) {
        return storeService.add(ids);
    }

    @GetMapping("get")
    public List<Integer> get() {
        return storeService.get();
    }
}