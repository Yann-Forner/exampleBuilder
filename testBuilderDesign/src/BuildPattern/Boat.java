package BuildPattern;

public class Boat {
    public void setSize(int size) {
        this.size = size;
    }

    private int size;
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void show(){
        System.out.println(size);
        System.out.println(name);
    }


     static class BoatBuilder {
        Integer size;
        String name="";

        BoatBuilder withSize(int size) {
            this.size = size;
            return this;
        }
        BoatBuilder withName(String name){
            this.name = name;
            return this;
        }
        Boat build(){
            Boat temp =  new Boat();
            if(name != null)temp.setName(name);
            if(size != null) temp.setSize(size);
            return temp;
        }

    }
}
