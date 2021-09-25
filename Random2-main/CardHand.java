import java.util.ArrayList;
public class CardHand {
    private boolean cond;
    private ArrayList<Card> hand;

    public CardHand(){
        hand=new ArrayList<Card>();
    }
    public void addCardToHand(Card card){
        hand.add(card);
    }
    
    public boolean haveToUseCard(){
        cond = false;
        if(hand.size() >=5){
            cond = true;
        }
        return cond;
    }

    public ArrayList<Card> getHand(){
        return hand;
    }
}
