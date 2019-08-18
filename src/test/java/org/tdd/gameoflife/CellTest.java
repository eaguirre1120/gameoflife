package org.tdd.gameoflife;

import org.junit.Assert;
import org.junit.Test;

public class CellTest {

    @Test
    public void testCellHasStateDead()
    {
        Cell cell = new Cell();
        boolean expected = false;
        Assert.assertEquals(expected, cell.getState());
    }

    @Test
    public void testCellStateCanChange()
    {
        Cell changeCellAlive = new Cell();
        changeCellAlive.changeState();
        Assert.assertEquals( true, changeCellAlive.getState());
    }

    @Test
    public void testCellStateCanChangeAliveToDead()
    {
        Cell cellAlive = new Cell();
        cellAlive.changeState();
        Cell cellDead = new Cell();
        cellDead.changeState();
        cellDead.changeState();
        Assert.assertEquals(true, cellAlive.getState());
        Assert.assertEquals(false, cellDead.getState());
    }

    @Test
    public void testCanLiveOnToNextStage()
    {
        Cell cell = new Cell();
        Cell cell2 = new Cell();

        cell.nextState(3);
        cell2.nextState(2);
        Assert.assertEquals(true, cell.getNextState());
        Assert.assertEquals(true, cell2.getNextState());
    }

    @Test
    public void testWillDieOfUnderpopulation()
    {
        Cell noNeighbourCell = new Cell();
        Cell oneNeighbourCell = new Cell();
        noNeighbourCell.nextState(3);
        noNeighbourCell.nextState(0);
        oneNeighbourCell.nextState(3);
        oneNeighbourCell.nextState(1);
        Assert.assertEquals(noNeighbourCell.getNextState(), false);
        Assert.assertEquals(oneNeighbourCell.getNextState(), false);
    }
}
