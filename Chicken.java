public class Chicken implements Edible{

  private int nutritionValue;

  public Chicken() {
    this.nutritionValue = 5;
  }
  public String cluck() {
    return "clucking";
  }
  public String swim() {
    return "drowning";
  }
 
 public int getNutritionValue() {
  return this.nutritionValue;
 }

}