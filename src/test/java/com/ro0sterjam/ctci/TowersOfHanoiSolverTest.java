package com.ro0sterjam.ctci;

import org.junit.Test;

import static com.ro0sterjam.ctci.TowersOfHanoiSolver.solve;
import static org.junit.Assert.assertTrue;

/**
 * Created by kenwang on 2016-04-02.
 */
public class TowersOfHanoiSolverTest {

    @Test
    public void testSolve_emptyTower() {
        TowersOfHanoi game = new TowersOfHanoi(0);
        solve(game);
        assertTrue(game.isSolved());
    }

    @Test
    public void testSolve_towerWithHeight1() {
        TowersOfHanoi game = new TowersOfHanoi(1);
        solve(game);
        assertTrue(game.isSolved());
    }

    @Test
    public void testSolve_towerWithHeight2() {
        TowersOfHanoi game = new TowersOfHanoi(2);
        solve(game);
        assertTrue(game.isSolved());
    }

    @Test
    public void testSolve_towerWithHeight3() {
        TowersOfHanoi game = new TowersOfHanoi(3);
        solve(game);
        assertTrue(game.isSolved());
    }

    @Test
    public void testSolve_towerWithHeight10() {
        TowersOfHanoi game = new TowersOfHanoi(10);
        solve(game);
        assertTrue(game.isSolved());
    }

    @Test
    public void testSolve_towerWithHeight11() {
        TowersOfHanoi game = new TowersOfHanoi(11);
        solve(game);
        assertTrue(game.isSolved());
    }
}