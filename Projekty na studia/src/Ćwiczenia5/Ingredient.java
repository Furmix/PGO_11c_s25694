package Ćwiczenia5;

public class Ingredient {


    protected String name;
    protected int baseReagent;


    public Ingredient(String name, int baseReagent) {
        this.name = name;
        this.baseReagent = baseReagent;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new RuntimeException("Name cant be empty or null");
        }
        this.name = name;
    }

    public int getBaseReagent() {
        return baseReagent;
    }

    public void setBaseReagent(int baseReagent) {
        if (name == null || name.isEmpty()) {
            throw new RuntimeException("Base reagent cant be empty or null");
        }
        this.baseReagent = baseReagent;
    }
    public int getReagent() {     //tu zmieniłem na getreagent  wczenisje w kole było getbasereagent
        return baseReagent;
    }

}
class Liquid extends Ingredient {

    protected int dissolubility;

    public Liquid(String name, int baseReagent, int dissolubility ) {
        super(name, baseReagent);
        setDiss(dissolubility);

    }
    public int getDiss() {
        return dissolubility;
    }
    public void setDiss(int dissolubility) {
        if (dissolubility < 0 || dissolubility > 100) {
            throw new RuntimeException("Cannot be lower than 0 and more than 100");
        }
        this.dissolubility = dissolubility;
    }
    @Override
    public int getReagent(){    // o tutjan zmienione zostałe
        return dissolubility;
    }
}


class Water extends Liquid {

    protected boolean distilated;

    public Water(String name, int baseReagent, int dissolubility, boolean distilated) {
        super(name, baseReagent, dissolubility);
        setDistilated(distilated);
    }

    public boolean getDistilated() {
        return distilated;
    }

    public void setDistilated(boolean distilated) {
        this.distilated = distilated;
    }

    @Override
    public int getReagent() {
        if (getDistilated()) {
            return super.getReagent();
        }
        else{
            return super.getReagent()/2;
        }
    }
}
class Alkohol extends Liquid{
    protected  int percent;


    public Alkohol(String name, int baseReagent, int dissolubility, int percent) {
        super(name, baseReagent, dissolubility);
        setPercent(percent);
    }
    public int getPercent(){
        return percent;
    }

    public void setPercent(int percent) {
        if (dissolubility < 0 || dissolubility > 100) {
            throw new RuntimeException("Cannot be lower than 0 and more than 100");
        }
        this.percent= percent;
    }

    @Override
    public int getReagent(){
        return super.getReagent()-getPercent();
    }
}
class Mineral extends Ingredient{

    protected int power;

    public Mineral(String name, int baseReagent, int power) {
        super(name, baseReagent);
        setPower(power);
    }
    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
    @Override
    public int getReagent(){
        return super.baseReagent+power;
    }
}
class Ore extends Mineral {

    protected boolean Metalic;

    public Ore(String name, int baseReagent, int power, boolean Metalic) {
        super(name, baseReagent, power);
        isMetalic(Metalic);
    }

    public boolean isMetalic() {
        return Metalic;
    }

    public void isMetalic(boolean metalic) {
        this.Metalic = metalic;
    }

    @Override
    public int getReagent() {
        if (isMetalic()) {
            return super.getReagent(); }
        else {
            return super.baseReagent / 2;
        }
    }
}
class Crystal extends Mineral {

    protected int magicPower;

    public Crystal(String name, int baseReagent, int power, int magicPower) {
        super(name, baseReagent, power);
        setMagicPower(magicPower);
    }
    public int getMagicPower() {
        return magicPower;
    }
    public void setMagicPower(int magicPower) {
        this.magicPower=magicPower;
    }
    @Override
    public int getReagent() {
        return super.getReagent()+magicPower;
    }
}
class Plants extends Ingredient{
    protected int toxity;

    public Plants(String name, int baseReagent,int toxity) {
        super(name, baseReagent);
        setToxity(toxity);
    }
    public int getToxity(){
        return toxity;
    }

    public void setToxity(int toxity) {
        this.toxity=toxity;
    }
    @Override
    public int getReagent() {
        return super.baseReagent*toxity;
    }
}
class Flower extends Plants {

    public Flower(String name, int baseReagent, int toxity) {
        super(name, baseReagent, toxity);
    }
    @Override
    public int getReagent() {
        return super.getReagent()*2;
    }
}
class Root extends Plants{

    public Root(String name, int baseReagent, int toxity) {
        super(name, baseReagent, toxity);
    }
    @Override
    public int getReagent() {
        return super.getReagent()/2;
    }
}
