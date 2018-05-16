/*
 *  Program:    Black Jack
 *  Date:       5/10/18
 *  Developer:  Garrett Wolfe
 *  Purpose:    Design a black jack game using javafx. 
 */
package pkgfinal.project.garrett.wolfe;
import javafx.scene.image.Image;

public class Card {
   private Suit suitValue;
   private Rank rankValue;
   private Image cardImage;

   public Card( Suit suit, Rank rank, Image cardFace ) {
      cardImage = cardFace;
      suitValue = suit;
      rankValue = rank;
   }

   public static String getFilename( Suit suit, Rank rank ) {
      return "file:resources/cards/"+rank.getSymbol() + suit.getSymbol() + ".gif";
   }

   public Suit getSuit() {
      return suitValue;
   }

   public Rank getRank() {
      return rankValue;
   }
   
   public int getValue() {
       String rank = rankValue.getSymbol();  
       try{
           return Integer.parseInt(rank);  
       } catch (Exception ex){
           if(rank.equals("a")){
               return 11; 
           } else {
               return 10; 
           }
       }
   }

   public Image getCardImage() {
      return cardImage;
   }

   @Override
   public String toString() {
      return rankValue.toString() + " of " + suitValue.toString();
   }

   public String rankToString() {
      return rankValue.toString();
   }

   public String suitToString() {
      return suitValue.toString();
   }
}