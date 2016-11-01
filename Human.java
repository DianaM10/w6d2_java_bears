public class Human implements Edible {

private int nutritionValue;

  public Human() {
    this.nutritionValue = 10;
  }

  public String speak() {
    return "speaking";
  }
  public String swim(){
    return "swimming";
  }

  public int getNutritionValue() {
   return this.nutritionValue;
  }
  
}