public class dog {

    String name;
    int age;
    String breed;

    public dog(String name,int age,String breed)
    {
        this.name=name;
        this.age=age;
        this.breed=breed;
    }
    public String getName(){
        return name;
    }
    public String getBreed(){
        return breed;
    }
    public int getAge(){
        return age;
    }
    @Override
    public String toString(){
        return "Dog's Name: "+name+'\n'+this.getName()+"'s "+"age: "+age+'\n'+this.getName()+"'s"+'\s'+"breed: "+breed;
    }
    public static void main(String[] args){
        dog Doggy1=new dog("Leo",2, "Labrador");
        System.out.println(Doggy1.toString());
    }
}
