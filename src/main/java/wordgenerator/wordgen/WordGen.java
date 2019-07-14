package wordgenerator.wordgen;

import java.util.Random;

public class WordGen {

    private PartsOfSpeech partsOfSpeech;

    public int getRandomNo(int i){
        Random random = new Random();
        int number = random.nextInt(i);
        return number;
    }
    public String generate(){
        String subject, predicate, object;
        partsOfSpeech = new PartsOfSpeech();
        object = partsOfSpeech.getRandomObject();
        subject = partsOfSpeech.getRandomSubject();
        predicate = partsOfSpeech.getRandomPredicate();
        return subject+" "+predicate+" "+object;
    }
}
