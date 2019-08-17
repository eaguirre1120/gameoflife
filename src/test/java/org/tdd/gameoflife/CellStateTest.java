package org.tdd.gameoflife;

import org.junit.Assert;
import org.junit.Test;

public class CellStateTest {

    @Test
    public void testCellHasStateAlive()
    {
        CellState cellState = new CellState();

        int input  = 1;
        int expected = 1;
        Assert.assertEquals( expected, cellState.ALIVE);
    }

    @Test
    public void testCellHasStateDead()
    {
        CellState cellState = new CellState();

        Assert.assertEquals(0, cellState.DEAD);
    }
}
