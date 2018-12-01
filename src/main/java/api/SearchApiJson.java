package api;

import api.schema.Item;
import io.restassured.path.json.JsonPath;
import io.restassured.path.json.exception.JsonPathException;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class SearchApiJson {

    private String json;

    public SearchApiJson(String json) {
        this.json = json;
    }

    private List<Item> getItems() {
        try {
            return JsonPath.from(json).getList("items", Item.class);
        } catch (JsonPathException ex) {
            return Collections.EMPTY_LIST;
        }
    }

    public Set<String> getNames() {
        return getItems().stream().map(Item::getName)
                .collect(Collectors.toCollection(LinkedHashSet::new));
    }

    public Set<Double> getPrices() {
        return getItems().stream().map(Item::getSalePrice)
                .collect(Collectors.toCollection(LinkedHashSet::new));
    }
}
