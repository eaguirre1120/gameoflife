package org.tdd.gameoflife;

public class Cell {
    private boolean state = false;
    private boolean nextStage = false;

    public boolean getState()
    {
        return this.state;
    }

    public void changeState()
    {
        this.state = !this.state;
    }

    public boolean getNextState()
    {
        return this.nextStage;
    }

    public void nextState(int i)
    {
        if(i == 2 || i == 3){
            this.nextStage = true;
        } else {
            this.nextStage = false;
        }
    }
}
