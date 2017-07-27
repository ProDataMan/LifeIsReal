package lir.acceptance.tests;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestVotes {

	@Test
	public void testAddVote() {
		lir.BusinessFacade.VoteSystem vs = new lir.BusinessFacade.VoteSystem();
		int userId = 1;
		int choiceId = 1;
		boolean results = vs.Add(userId, choiceId); // date time added by data storage
		assertTrue(results);	
	}
}
