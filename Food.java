public class Food{

  /**
   * If we're going camping, we have to make s'mores!
   * Let's check to make sure that it's possible.
   * We need 2 crackers, 1 marshmallow, and 1 bar of chocolate
   * for each person, as well as the campfire to be lit.
   * @param numCampers      number of campers
   * @param numCrackers     number of crackers
   * @param numMarshmallows number of marshmallows
   * @param numChocolates   number of chocolates
   * @param isCampfireLit   checks campfire
   * @return  true if we can make s'mores
   */
  public static boolean canMakeSmores(
    int numCampers,
    int numCrackers,
    int numMarshmallows,
    int numChocolates,
    boolean isCampfireLit){
	boolean ratioCr = numCrackers / numCampers >= 2;
	boolean ratioM = numMarshmallows / numCampers>= 1;
	boolean ratioC = numChocolates / numCampers >=1;
	return (ratioCr && ratioM && ratioC && isCampfireLit);
  }

  /**
   * We want our potatoes to be just right. They are rated
   * from 1-20, where 20 is the most cooked. When we compare two
   * potatoes, we want to take the more cooked one, but only if
   * it's rated between 13..18. Otherwise, it's overcooked and we
   * don't want it. Return the rating of the jacket we want,
   * and 0 if we don't want any.
   * @param rating1 rating of first potato
   * @param rating2 rating of second potato
   * @return  rating of potato we take, 0 if no potato
   */
  public static int checkPotatoes(int rating1, int rating2){
	boolean isInPotato1Range = ((rating1 <= 18) && (rating1 >= 13));
	boolean isInPotato2Range = ((rating2 <= 18) && (rating2 >= 13));
	if (isInPotato1Range && !isInPotato2Range){
		return rating1;
	}
	if (!isInPotato1Range && isInPotato2Range){
		return rating2;
	}
	if (!isInPotato1Range && !isInPotato2Range){
	return 0;
  }
  if (rating1 >= rating2){
  	return rating1;
  }
  else {
  	return rating2;
  }

  }

  /**
   * As a treat, we'll bring some bags of candy with us.
   * Two students get to say how much candy they want, and
   * we'll take the smaller number. However, if they both
   * say the same number, then we'll take the sum!
   * @param c1  first student reply
   * @param c2  second student reply
   * @return    how many bags of candy to bring
   */
  public static int countCandy(int c1, int c2){
if (c1 == c2){
	return (c1 + c2);
}

if(c2> c1){
	return c1;
}
return c2;
  }

  /**
   * We can never have too many marshmallows! Somehow, they
   * keep multiplying... We start with n marshmallows, but
   * they double in number t times! How many marshmallows
   * do we end up with?
   * @param n starting number of marshmallows
   * @param t number of times they double
   * @return  final number of marshmallows
   */
  public static int countMarshmallows(int n, int t){
	int q = n;
	for (int x = 0; x <t; x++){
		q = q*2;
	}
	return q;
  }

  /**
   * We have some picky students who refuse to go camping
   * if they have to eat food that they really don't like.
   * However, if the planned food is "Surf and turf", then
   * the student has no choice and they have to come.
   * @param dislikedFood  the food the student doesn't like
   * @param plannedFood   the food that we are going to eat
   * @return    true if the student will come camping
   */
  public static boolean willStudentCome(String dislikedFood, String plannedFood){
if(plannedFood.equals("Surf and turf")){
	return true;
}
else{
	return dislikedFood.equals(plannedFood);
}
  }

  /**
   * We want our food to taste good. Our meals are rated from 1-10,
   * with 10 being the most delicious. If any meal is rated 8+,
   * then it is good enough to make up for the other meals, EXCEPT:
   * If any meal is rated 2 or below, then the food is unbearable.
   * Otherwise, the food is tolerable.
   * Use the following encoding for the return value:
   * 0: food is unbearable
   * 1: food is tolerable
   * 2: food is good
   * @param breakfastRating
   * @param lunchRating
   * @param dinnerRating
   * @return  0, 1, or 2 corresponding to description
   */
  public static int isFoodOk(
     int breakfastRating, int lunchRating, int dinnerRating){
if (breakfastRating <=2 || lunchRating <=2 || dinnerRating <=2){
	return 0;
}
if (breakfastRating>=8 || lunchRating >=8 || dinnerRating >=8){
	return 2;
}
return 1;
  }

  /**
   * Let's make sure we have enough sandwiches for everyone.
   * Each sandwich is labeled with an ID starting from 1.
   * Every 9th sandwich is a little moldy and can't be eaten.
   * Announce the IDs of each sandwich we check, and let us know
   * if the sandwich is moldy by appending ":moldy!" to the ID.
   * Make sure everyone gets a non-moldy sandwich!
   * Return how many sandwiches we need to check before everyone
   * gets a sandwich.
   * @param numCampers  number of campers
   * @return            number of checked sandwiches
   */
  public static int countSandwiches(int numCampers){
if(numCampers<9){
	return numCampers;
}
int toCheck = numCampers % 9;
int toCheck2 = numCampers - toCheck;
int toCheck3 = toCheck2 / 9;
int checkedSandwiches = numCampers + toCheck3; 
for (int x =  1; x <= checkedSandwiches; x++){
	if(x % 9 == 0){
		System.out.println(x + " :moldy!");
	}
	else{
	System.out.println(x);
	}
}
return checkedSandwiches;
  }
  
  
 

  public static void main(String[] args) {
	boolean ben = canMakeSmores(20, 40, 40, 40, true);
	System.out.println(ben);
	int benman = checkPotatoes(14, 17);
	System.out.println(benman);
	int benman2 = countCandy(6,5);
	System.out.println(benman2);
	int benman1 = countMarshmallows(8, 3);
	System.out.println(benman1);
	int ben2 = SandwichCheck(48);
	System.out.println(ben2);
	countSandwiches(60);
  }
}