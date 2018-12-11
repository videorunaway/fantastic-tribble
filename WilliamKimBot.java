
public class WilliamKimBot implements Bot {
	public String getName() {
        return getClass().getName();
    }
	
	public String move(int row, int col, int coins, int arenaLen, int[][] botInfo, int[][] coinLocs) {
        int choice = (int)(Math.random()*5);
        switch(choice) {
            case 0: return "north";
            case 1: return "east";
            case 2: return "south";
            case 3: return "west";
            default: return "none";
        }
    }
	
	public void died(int moves, int coins, String reason) {
	    
    }
	
	public void won(int moves, int coins) {
	    
    }
	
	public void newSimulation() {
	    
    }
}
