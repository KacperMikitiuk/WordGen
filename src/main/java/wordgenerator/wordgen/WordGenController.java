package wordgenerator.wordgen;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WordGenController {

    @GetMapping("/hello")
    public String generateWord(ModelMap map){
        WordGen wordGen = new WordGen();
        map.put("sentence", wordGen.generate());
        return "wordgenerate";
    }
}
