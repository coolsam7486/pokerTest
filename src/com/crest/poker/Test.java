package com.crest.poker;

import java.util.HashSet;
import java.util.Set;

/**
 * 
 * 
 * @since Oct 11, 2015 9:56:04 AM IST
 * @author Somnath Sarode
 */
public class Test {

	/**
	 * 
	 * Method Description : Main
	 * 
	 * @param args
	 *            -
	 * @since Oct 11, 2015 9:56:35 AM IST
	 * @author Somnath Sarode
	 */
	public static void main(String[] args) {

		Set<Card> cards = new HashSet<Card>();

		for (String s : args)

		{
			/*
			 * Removes starting [ and ending ]
			 */
			if (s.contains("[") || s.contains("]")) {
				if (s.contains("[")) {
					s = s.replace("[", "");
				} else

				{
					s = s.replace("]", "");
				}
			}

			/*
			 * Following switch block Creates set of cards for hand
			 */
			switch (s) {
			/*
			 * Heart Suite
			 */
			case "HA":
				cards.add(Card.ACE_HEARTS);
				break;

			case "HK":
				cards.add(Card.KING_HEARTS);
				break;

			case "HQ":
				cards.add(Card.QUEEN_HEARTS);
				break;

			case "HJ":
				cards.add(Card.JACK_HEARTS);
				break;

			case "HT":
				cards.add(Card.TEN_HEARTS);
				break;

			case "H9":
				cards.add(Card.NINE_HEARTS);
				break;

			case "H8":
				cards.add(Card.EIGHT_HEARTS);
				break;

			case "H7":
				cards.add(Card.SEVEN_HEARTS);
				break;

			case "H6":
				cards.add(Card.SIX_HEARTS);
				break;

			case "H5":
				cards.add(Card.FIVE_HEARTS);
				break;

			case "H4":
				cards.add(Card.FOUR_HEARTS);
				break;

			case "H3":
				cards.add(Card.THREE_HEARTS);
				break;

			case "H2":
				cards.add(Card.TWO_HEARTS);
				break;

			/*
			 * Diamonds Suite
			 */

			case "DA":
				cards.add(Card.ACE_DIAMONDS);
				break;

			case "DK":
				cards.add(Card.KING_DIAMONDS);
				break;

			case "DQ":
				cards.add(Card.QUEEN_DIAMONDS);
				break;

			case "DJ":
				cards.add(Card.JACK_DIAMONDS);
				break;

			case "DT":
				cards.add(Card.TEN_DIAMONDS);
				break;

			case "D9":
				cards.add(Card.NINE_DIAMONDS);
				break;

			case "D8":
				cards.add(Card.EIGHT_DIAMONDS);
				break;

			case "D7":
				cards.add(Card.SEVEN_DIAMONDS);
				break;

			case "D6":
				cards.add(Card.SIX_DIAMONDS);
				break;

			case "D5":
				cards.add(Card.FIVE_DIAMONDS);
				break;

			case "D4":
				cards.add(Card.FOUR_DIAMONDS);
				break;

			case "D3":
				cards.add(Card.THREE_DIAMONDS);
				break;

			case "D2":
				cards.add(Card.TWO_DIAMONDS);
				break;

			/*
			 * Spades Suite
			 */

			case "SA":
				cards.add(Card.ACE_SPADES);
				break;

			case "SK":
				cards.add(Card.KING_SPADES);
				break;

			case "SQ":
				cards.add(Card.QUEEN_SPADES);
				break;

			case "SJ":
				cards.add(Card.JACK_SPADES);
				break;

			case "ST":
				cards.add(Card.TEN_SPADES);
				break;

			case "S9":
				cards.add(Card.NINE_SPADES);
				break;

			case "S8":
				cards.add(Card.EIGHT_SPADES);
				break;

			case "S7":
				cards.add(Card.SEVEN_SPADES);
				break;

			case "S6":
				cards.add(Card.SIX_SPADES);
				break;

			case "S5":
				cards.add(Card.FIVE_SPADES);
				break;

			case "S4":
				cards.add(Card.FOUR_SPADES);
				break;

			case "S3":
				cards.add(Card.THREE_SPADES);
				break;

			case "S2":
				cards.add(Card.TWO_SPADES);
				break;

			/*
			 * Clubs Suite
			 */
			case "CA":
				cards.add(Card.ACE_CLUBS);
				break;

			case "CK":
				cards.add(Card.KING_CLUBS);
				break;

			case "CQ":
				cards.add(Card.QUEEN_CLUBS);
				break;

			case "CJ":
				cards.add(Card.JACK_CLUBS);
				break;

			case "CT":
				cards.add(Card.TEN_CLUBS);
				break;

			case "C9":
				cards.add(Card.NINE_CLUBS);
				break;

			case "C8":
				cards.add(Card.EIGHT_CLUBS);
				break;

			case "C7":
				cards.add(Card.SEVEN_CLUBS);
				break;

			case "C6":
				cards.add(Card.SIX_CLUBS);
				break;

			case "C5":
				cards.add(Card.FIVE_CLUBS);
				break;

			case "C4":
				cards.add(Card.FOUR_CLUBS);
				break;

			case "C3":
				cards.add(Card.THREE_CLUBS);
				break;

			case "C2":
				cards.add(Card.TWO_CLUBS);
				break;
			}

		}
		Hand hand = new Hand(cards);
		System.out.println(hand.category);

	}
}
