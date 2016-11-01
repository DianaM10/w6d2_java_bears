public class Salmon implements Edible {

  private int nutritionValue;

    public Salmon() {
      this.nutritionValue = 8;
    }
 

  public String swim() {
    return "swim like a fish";
  }
  
  public int getNutritionValue() {
   return this.nutritionValue;
  }
}