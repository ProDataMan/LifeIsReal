package lir.BusinessFacade;

public class VoteSystem {

	public boolean Add(int userId, int choiceId) {
		// TODO Auto-generated method stub
		lir.BusinessRules.Vote v = new lir.BusinessRules.Vote();
		boolean result = v.Add(userId, choiceId);
		return result;
	}

}
