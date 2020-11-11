package sk.uteg;

import com.codesnippets4all.json.parsers.JSONParser;
import com.codesnippets4all.json.parsers.JsonParserFactory;

import java.nio.charset.StandardCharsets;
import java.util.Map;

public class CountryNames {
    public static String getCountryName(String countryCode, String languageCode) {
        JsonParserFactory factory = JsonParserFactory.getInstance();
        JSONParser parser = factory.newJsonParser();
        Map<String, Map<String, String>> jsonData = parser.parseJson(CountryNames.class.getResourceAsStream("/langs/" + languageCode.toLowerCase() + ".json"), StandardCharsets.UTF_8.displayName());
        return jsonData.get("countries").get(countryCode);
    }
}
