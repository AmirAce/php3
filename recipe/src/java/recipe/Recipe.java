/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recipe;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author aamir
 */
public class Recipe implements Serializable {
   private ArrayList<Ingredients> Items = new ArrayList<>();
   private String instructions;

    public Recipe() {
    }

    public Recipe(ArrayList<Ingredients> ingredient) {
        this.Items = ingredient;
    }

    public ArrayList<Ingredients> getIngredient() {
        return Items;
    }

    public void setIngredient(ArrayList<Ingredients> ingredient) {
        this.Items = ingredient;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }
    public void multiplyByQuarter(){
        Ingredients Banana = new Ingredients("Banana","0.5",1);
    Items.add(Banana);
}
    public void multiplyByHalf(){
        Ingredients Banana = new Ingredients("Banana","1",2);
    Items.add(Banana);
}
    public void multiplyBytwo(){
        Ingredients Banana = new Ingredients("Banana","4",8);
    Items.add(Banana);
}
        public void multiplyByone(){
        Ingredients Banana = new Ingredients("Banana","2",4);
    Items.add(Banana);
}
        public void multiplyBythree(){
        Ingredients Banana = new Ingredients("Banana","6",12);
    Items.add(Banana);
}
 
            public void multiplyByfour(){
        Ingredients Banana = new Ingredients("Banana","8",16);
    Items.add(Banana);
}
 
    
    public void addIngredient(Ingredients food){
        
    Items.add(food);
}
   
}
