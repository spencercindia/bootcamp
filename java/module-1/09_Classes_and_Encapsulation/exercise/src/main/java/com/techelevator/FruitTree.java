package com.techelevator;


public class FruitTree
{
    //Create a constructor for this class that accepts two parameters:
    // String typeOfFruit and int startingPiecesOfFruit. Use these parameters to set the instance variables of the class.
    private String typeOfFruit;
    private int startingPiecesOfFruit;
    public int piecesOfFruitLeft;

    public FruitTree(String typeOfFruit, int startingPiecesOfFruit)
    {
        this.typeOfFruit = typeOfFruit;
        this.startingPiecesOfFruit = startingPiecesOfFruit;
        this.piecesOfFruitLeft = startingPiecesOfFruit;
    }
//    Create a method called pickFruit that accepts an int called numberOfPiecesToRemove and returns a boolean.
//
//    If there are enough pieces left on the tree, it "picks" the fruit and updates piecesOfFruitLeft by subtracting numberOfPiecesToRemove from it.
//    The method returns true if there were enough pieces left to pick. It returns false if no fruit was picked—that is,
//    piecesOfFruitLeft was less than numberOfPiecesToRemove.

    public boolean pickFruit(int numberOfPiecesToRemove)
    {
        if (piecesOfFruitLeft>=numberOfPiecesToRemove)
        {
            piecesOfFruitLeft-=numberOfPiecesToRemove;
            return true;
        } else return false;
    }

    public int getPiecesOfFruitLeft() {
        return piecesOfFruitLeft;
    }

    public String getTypeOfFruit()
    {
        return typeOfFruit;
    }

    public int getStartingPiecesOfFruit()
    {
        return startingPiecesOfFruit;
    }
}
