package classwork;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class MyJSONParser {

    ObjectMapper objectMapper = new ObjectMapper();

    public static void main(String[] args) throws IOException {
        MyJSONParser myJSONParser = new MyJSONParser();
        myJSONParser.fromJson();
        myJSONParser.toJson();
    }

    public void fromJson() throws IOException {
        Recipe recipe = objectMapper
                .readValue(new File("src/test/resources/recipe.json"), Recipe.class);
        System.out.println(recipe);
    }

    public void toJson() throws IOException {

        Recipe recipe = new Recipe("Salad",
                Arrays.asList(
                        new Ingredient("Tomato", 2),
                        new Ingredient("Cucumber", 1)),
                3);

        objectMapper.writerWithDefaultPrettyPrinter()
                .writeValue(new File("src/test/resources/recipe2.json"), recipe);

    }
}
