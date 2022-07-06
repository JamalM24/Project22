public class Sentence {

    private String Sentence;

    public Sentence(String s){
     Sentence=s;

    }

    public String getSentence() {
        return Sentence;
    }

    public boolean equal(Sentence s){
        if(this.getSentence()== s.getSentence()){
            return true;
        }
        else return false;
    }


}
