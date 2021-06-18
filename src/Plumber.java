public class Plumber {

    private int sum;
    private int pricePipe = 300;
    private int priceToilet = 500;
    private String Hello = "Hello! I am plumber. I know how to fix toilets and pipes. ";
    private String Question = "What do you want me to do? Type \"fix pipe\" or \"fix toilet\" ";
    private String Final = "You owe me ";
    private String DontKnow = "Sorry, I don't know how to fix it :( ";
    private String Declined = "I wish I could help you :( May be next time! ";
    private String DontUnderstand = "Sorry, I don't understand you :( ";
    private String HelloBoss = "Oh, Boss! I haven't recognised you. What do you want me to do? ";
    private String NewPrice = "Ok. I will change my price for it. Type new price. ";
    private String More = "Do you want me to do something else? Type \"yes\" or \"no\". ";
    private String YesOrNoOnly = "I said type yes or no, idiot";
    private String ItCosts = "It will cost you ";
    private String AreYouSure = "Are you sure you want me to fix it? Type \"yes\" and I will start. ";

    String speak(String phrase) {
        return switch (phrase) {
            case ("Hello") -> this.Hello;
            case ("Question") -> this.Question;
            case ("Final") -> this.Final;
            case ("DontKnow") -> this.DontKnow;
            case ("Declined") -> this.Declined;
            case ("HelloBoss") -> this.HelloBoss;
            case ("More") -> this.More;
            case ("YesOrNoOnly") -> this.YesOrNoOnly;
            case ("AreYouSure") -> this.AreYouSure;
            case ("NewPrice") -> this.NewPrice;
            default -> this.DontUnderstand;
        };
    }
    void setSpeak(String phrase, String phraseText) {
        switch (phrase) {
            case ("Hello") -> this.Hello = phraseText;
            case ("Question") -> this.Question = phraseText;
            case ("Final") -> this.Final = phraseText;
            case ("DontKnow") -> this.DontKnow = phraseText;
            case ("Declined") -> this.Declined = phraseText;
            case ("HelloBoss") -> this.HelloBoss = phraseText;
            case ("More") -> this.More = phraseText;
            case ("YesOrNoOnly") -> this.YesOrNoOnly = phraseText;
            case ("DontUnderstand") -> this.DontUnderstand = phraseText;
            case ("AreYouSure") -> this.AreYouSure = phraseText;
            case ("ItCosts") -> this.ItCosts = phraseText;
        };
    }
    String fix(String phrase) {
        return switch (phrase) {
            case ("pipe") -> "Pipe fixed!";
            case ("toilet") -> "Toilet fixed";
            default -> this.DontKnow;
        };
    }
    int getPrice(String objectToFix) {
        return switch (objectToFix) {
            case ("pipe") -> this.pricePipe;
            case ("toilet") -> this.priceToilet;
            default -> 0;
        };
    }
    String getCost(String objectToFix) {
        return switch (objectToFix) {
            case ("pipe") -> this.ItCosts + this.pricePipe + "$";
            case ("toilet") -> this.ItCosts + this.priceToilet + "$";
            default -> this.DontKnow;
        };
    }
    void setPrice(String objectToFix, int price) {
        switch (objectToFix) {
            case ("pipe") -> this.pricePipe = price;
            case ("toilet") -> this.priceToilet = price;
        }
    }
    void sumPrice(int price) {
        this.sum += price;
    }
    public int getSum() {
        return sum;
    }
}
