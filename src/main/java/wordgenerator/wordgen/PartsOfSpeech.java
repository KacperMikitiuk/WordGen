package wordgenerator.wordgen;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class PartsOfSpeech {

    private List<String> subject;
    private List<String> predicate;
    private List<String> object;

    public PartsOfSpeech(){
        subject = new ArrayList<>();
        subject.add("Wielki dąb");
        subject.add("Goryl");
        subject.add("Mój samochód");
        subject.add("Młody programista");
        subject.add("Dumny człowiek");
        subject.add("Kotopies");
        subject.add("Wieśniak");
        subject.add("Głodny wilk");
        subject.add("Kubuś puchatek");
        subject.add("Romek");
        subject.add("Adolf");
        predicate = new ArrayList<>();
        predicate.add("powiedział");
        predicate.add("kupił sobie");
        predicate.add("został");
        predicate.add("rozrewolweryzował");
        predicate.add("zjadł");
        predicate.add("poszedł");
        predicate.add("oszalał");
        predicate.add("zabił");
        predicate.add("nie wyspał się");
        predicate.add("powiedział");
        object = new ArrayList<>();
        object.add("bo siedział.");
        object.add("małego kotka.");
        object.add("uzbrojonego zająca.");
        object.add("szalony dzik.");
        object.add("tralala");
        object.add("rumpumpum.");
        object.add("jachce drachce");
        object.add("jachce drachce drachcedroni");
        object.add("cepke drepke");
        object.add("dziadowy rok");
    }

    public String getRandomObject(){
        return object.get(ThreadLocalRandom.current().nextInt(1, object.size()));
    }
    public String getRandomSubject(){
        return subject.get(ThreadLocalRandom.current().nextInt(1, subject.size()));
    }
    public String getRandomPredicate(){
        return predicate.get(ThreadLocalRandom.current().nextInt(1, predicate.size()));
    }

    public List<String> getSubject() {
        return subject;
    }

    public void setSubject(List<String> subject) {
        this.subject = subject;
    }

    public List<String> getPredicate() {
        return predicate;
    }

    public void setPredicate(List<String> predicate) {
        this.predicate = predicate;
    }

    public List<String> getObject() {
        return object;
    }

    public void setObject(List<String> object) {
        this.object = object;
    }
}
