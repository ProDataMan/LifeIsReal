package lir.BusinessRules;

public class Vote {

	public boolean Add(int userId, int choiceId) {
		// TODO Auto-generated method stub
		lir.DataAccess.Votes v = new lir.DataAccess.Votes();
		boolean results = v.Add(userId, choiceId);
		
		return results;
	}

}
