package com.epam.belote;

import com.epam.belote.bonus.Bonus;
import com.epam.belote.cards.Card;

import java.util.Set;

public interface IPlayer {
    /**
     * The first game phase is bidding when players bid on the trump for the current game.
     * If all players pass than the games does not take place.
     * The game starts when there have been three subsequent passes after a player has bid a trump suit, no trumps or all trumps
     */
    void bid(Bid bid);

    /**
     * After the bidding phase players declare bonuses if any. A player may declare multiple bonuses
     */
    Set<Bonus> declareBonus();

    /**
     * When the game starts each player plays a single card per turn. There are 32 cards and 4 players therefore a game consists of 8 turns
     */
    Card playCard();

    Team getTeam();
}
