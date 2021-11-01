
public class EnemyAI {

	public static void EnemyTactics(char[] showGameBoard, char initializeNewGame, char[] slot, char playerTag,
			char enemyTag) {

		for (int i = 0; i < slot.length; i++) {
			// enemy winning row 1
			if (slot[0] == enemyTag && slot[1] == enemyTag) {
				slot[2] = enemyTag;
			} else if (slot[0] == enemyTag && slot[2] == enemyTag) {
				slot[1] = enemyTag;
			} else if (slot[1] == enemyTag && slot[2] == enemyTag) {
				slot[0] = enemyTag;
			// enemy winning row 2
			} else if (slot[3] == enemyTag && slot[4] == enemyTag) {
				slot[5] = enemyTag;
			} else if (slot[3] == enemyTag && slot[5] == enemyTag) {
				slot[4] = enemyTag;
			} else if (slot[4] == enemyTag && slot[5] == enemyTag) {
				slot[3] = enemyTag;
			// enemy winning row 3
			} else if (slot[6] == enemyTag && slot[7] == enemyTag) {
				slot[8] = enemyTag;
			} else if (slot[6] == enemyTag && slot[8] == enemyTag) {
				slot[7] = enemyTag;
			} else if (slot[7] == enemyTag && slot[8] == enemyTag) {
				slot[6] = enemyTag;
				
			// enemy winning kolum 1
			} else if (slot[0] == enemyTag && slot[3] == enemyTag) {
		    	slot[6] = enemyTag;
			} else if (slot[0] == enemyTag && slot[6] == enemyTag) {
		    	slot[3] = enemyTag;
			} else if (slot[3] == enemyTag && slot[6] == enemyTag) {
		    	slot[0] = enemyTag;
		    // enemy winning kolum 2
			} else if (slot[1] == enemyTag && slot[4] == enemyTag) {
		    	slot[7] = enemyTag;
			} else if (slot[1] == enemyTag && slot[7] == enemyTag) {
		    	slot[4] = enemyTag;
			} else if (slot[4] == enemyTag && slot[7] == enemyTag) {
		    	slot[1] = enemyTag;
		    // enemy winning kolum 3
			} else if (slot[2] == enemyTag && slot[5] == enemyTag) {
		    	slot[8] = enemyTag;
			} else if (slot[2] == enemyTag && slot[8] == enemyTag) {
		    	slot[5] = enemyTag;
			} else if (slot[5] == enemyTag && slot[8] == enemyTag) {
		    	slot[2] = enemyTag;
		    	
		    // enemy winning diagonaly 1
			} else if (slot[0] == enemyTag && slot[4] == enemyTag) {
		    	slot[8] = enemyTag;
			} else if (slot[0] == enemyTag && slot[8] == enemyTag) {
		    	slot[4] = enemyTag;
			} else if (slot[4] == enemyTag && slot[8] == enemyTag) {
		    	slot[0] = enemyTag;
		    // enemy winning diagonaly 2
			} else if (slot[2] == enemyTag && slot[4] == enemyTag) {
		    	slot[6] = enemyTag;
			} else if (slot[2] == enemyTag && slot[6] == enemyTag) {
		    	slot[4] = enemyTag;
			} else if (slot[4] == enemyTag && slot[6] == enemyTag) {
		    	slot[2] = enemyTag;

			}else 
				Enemy.enemyTurn();
		}
	}
}