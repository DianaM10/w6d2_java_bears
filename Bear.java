import java.util.*;

public class Bear implements Killable{

  private String name;
  private ArrayList<Edible> belly;
  private int pawStrength;

  public Bear(String name){
    this.name = name;
    this.belly = new ArrayList<Edible>();
  }

  public String getName(){
    return this.name;
  }

  public int foodCount(){
    return this.belly.size();
  }

  public void eat(Edible food){
   this.belly.add(food);
 }

 // public boolean bellyFull(){
 //   return foodCount() == belly.length;
 // }

 public void sleep(){
  this.belly.clear();
}

public Edible throwUp(){
  if (foodCount() > 0){
    return belly.remove(0);
  }
  return null;
}

public int goodDiet(){
  int total = 0;
  for (Edible edible : belly) {
    total += edible.getNutritionValue();
  }
  return total;
}

}
