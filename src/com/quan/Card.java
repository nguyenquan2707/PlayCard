package com.quan;

import static com.quan.Rank.*;
import static com.quan.Suit.*;
public enum Card {
	TWO_SPADES(TWO, SPADES),
	THREE_SPADES(THREE, SPADES),
	FOUR_SPADES(FOUR, SPADES),
	FIVE_SPADES(FIVE, SPADES),
	SIX_SPADES(SIX, SPADES),
	SEVEN_SPADES(SEVEN, SPADES),
	EIGHT_SPADES(EIGHT, SPADES),
	NINE_SPADES(NINE, SPADES),
	TEN_SPADES(TEN, SPADES),
	JACK_SPADES(JACK, SPADES),
	QUEEN_SPADES(QUEEN, SPADES),
	KING_SPADES(KING, SPADES),
	ACE_SPADES(ACE, SPADES),
	
	TWO_HEARTS(TWO, HEARTS),
	THREE_HEARTS(THREE, HEARTS),
	FOUR_HEARTS(FOUR, HEARTS),
	FIVE_HEARTS(FIVE, HEARTS),
	SIX_HEARTS(SIX, HEARTS),
	SEVEN_HEARTS(SEVEN, HEARTS),
	EIGHT_HEARTS(EIGHT, HEARTS),
	NINE_HEARTS(NINE, HEARTS),
	TEN_HEARTS(TEN, HEARTS),
	JACK_HEARTS(JACK, HEARTS),
	QUEEN_HEARTS(QUEEN, HEARTS),
	KING_HEARTS(KING, HEARTS),
	ACE_HEARTS(ACE, HEARTS),
	
	TWO_DIAMONDS(TWO, DIAMONDS),
	THREE_DIAMONDS(THREE, DIAMONDS),
	FOUR_DIAMONDS(FOUR, DIAMONDS),
	FIVE_DIAMONDS(FIVE, DIAMONDS),
	SIX_DIAMONDS(SIX, DIAMONDS),
	SEVEN_DIAMONDS(SEVEN, DIAMONDS),
	EIGHT_DIAMONDS(EIGHT, DIAMONDS),
	NINE_DIAMONDS(NINE, DIAMONDS),
	TEN_DIAMONDS(TEN, DIAMONDS),
	JACK_DIAMONDS(JACK, DIAMONDS),
	QUEEN_DIAMONDS(QUEEN, DIAMONDS),
	KING_DIAMONDS(KING, DIAMONDS),
	ACE_DIAMONDS(ACE, DIAMONDS),
	
	TWO_CLOVERS(TWO, CLOVERS),
	THREE_CLOVERS(THREE, CLOVERS),
	FOUR_CLOVERS(FOUR, CLOVERS),
	FIVE_CLOVERS(FIVE, CLOVERS),
	SIX_CLOVERS(SIX, CLOVERS),
	SEVEN_CLOVERS(SEVEN, CLOVERS),
	EIGHT_CLOVERS(EIGHT, CLOVERS),
	NINE_CLOVERS(NINE, CLOVERS),
	TEN_CLOVERS(TEN, CLOVERS),
	JACK_CLOVERS(JACK, CLOVERS),
	QUEEN_CLOVERS(QUEEN, CLOVERS),
	KING_CLOVERS(KING, CLOVERS),
	ACE_CLOVERS(ACE, CLOVERS);
	
	public final Rank rank;
	public final Suit suit;
	
	Card(Rank rank, Suit suit) {
		this.rank = rank;
		this.suit = suit;
	}

}
