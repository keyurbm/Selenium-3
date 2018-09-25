package Interface;

public interface ExtendHockey extends ExtendSport {
	   public void homeGoalScored();
	   public void visitingGoalScored();
	   public void endOfPeriod(int period);
	   public void overtimePeriod(int ot);
}
