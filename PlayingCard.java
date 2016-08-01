package CardGame;

/********************************************************************
*  PlayingCard.java       
*
*  Program designed to play a simple Hi-Lo game with a deck of cards
*
*  @Author: Allen Pagan
*
********************************************************************/

public class PlayingCard
{
	private int face;
	private int suit;

   //-------------------------------------------------------------------
   //  Sets up the playing card by drawing it initially.
   //-------------------------------------------------------------------
   public PlayingCard ()
   {
      drawCard();
   }

   //-------------------------------------------------------------------
   //  Draws the playing card by randomly choosing face and suit values.
   //-------------------------------------------------------------------
   public void drawCard ()
   {
      face = (int) (Math.random() * 13) + 2;
      suit = (int) (Math.random() * 4);
   }

   //-------------------------------------------------------------------
   //  Returns true if the current playing card is exactly the same as
   //  the card passed in as a parameter.
   //-------------------------------------------------------------------
   public boolean isEquals (PlayingCard c)
   {
      return ((this.face == c.getFace()) && (this.suit == c.getSuit()));
   }

   //-------------------------------------------------------------------
   //  Returns the face value of the current playing card.
   //-------------------------------------------------------------------
   public int getFace()
   {  
      return face;
   }

   //-------------------------------------------------------------------
   //  Returns the suit value of the current playing card.
   //-------------------------------------------------------------------
   public int getSuit()
   {  
      return suit;
   }

   //-------------------------------------------------------------------
   //  Returns the current playing card as a string.
   //-------------------------------------------------------------------
   public String toString()
   {
      String cardName = null;

      switch (face)
      {
         case 2:   cardName = "Two";
                   break;
         case 3:   cardName = "Three";
                   break;
         case 4:   cardName = "Four";
                   break;
         case 5:   cardName = "Five";
                   break;
         case 6:   cardName = "Six";
                   break;
         case 7:   cardName = "Seven";
                   break;
         case 8:   cardName = "Eight";
                   break;
         case 9:   cardName = "Nine";
                   break;
         case 10:  cardName = "Ten";
                   break;
         case 11:  cardName = "Jack";
                   break;
         case 12:  cardName = "Queen";
                   break;
         case 13:  cardName = "King";
                   break;
         case 14:  cardName = "Ace";
      }

      switch (suit)
      {
         case 0:   cardName += " of Clubs";
                   break;
         case 1:   cardName += " of Spades";
                   break;
         case 2:   cardName += " of Hearts";
                   break;
         case 3:   cardName += " of Diamonds";
                   break;
      }

      return cardName;
   }

}
