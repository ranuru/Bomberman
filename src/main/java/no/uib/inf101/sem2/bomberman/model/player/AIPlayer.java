package no.uib.inf101.sem2.bomberman.model.player;

import no.uib.inf101.sem2.grid.CellPosition;

/**
 * A class for representing an AI player
 * 
 */
public class AIPlayer extends Player {

  private CellPosition pos;

  /**
   * Creates an AI Player with a given position and symbol
   * 
   * @param pos    the position of the player
   * @param symbol the symbol of the player
   */
  public AIPlayer(CellPosition pos, Character symbol) {
    super(pos);
    this.symbol = symbol;
  }

  /**
   * Get the symbol of the player
   * 
   * @return the symbol of the player
   */
  public char getSymbol() {
    return this.symbol;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = super.hashCode();
    result = prime * result + ((pos == null) ? 0 : pos.hashCode());
    result = prime * result + ((symbol == null) ? 0 : symbol.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (!super.equals(obj))
      return false;
    if (getClass() != obj.getClass())
      return false;
    AIPlayer other = (AIPlayer) obj;
    if (pos == null) {
      if (other.pos != null)
        return false;
    } else if (!pos.equals(other.pos))
      return false;
    if (symbol == null) {
      if (other.symbol != null)
        return false;
    } else if (!symbol.equals(other.symbol))
      return false;
    return true;
  }

}
