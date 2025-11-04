import com.smxweb.model.BeerExpert;

import java.util.List;

public class ModelTest {

    public static void main(String[] args) {
        BeerExpert beerExpert = new BeerExpert();
        List<String> brands = beerExpert.getBrands("");
        System.out.println(brands);
    }
}
