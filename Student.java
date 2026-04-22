package studPrac01;
public class Student {
    private String name;
    private String gender;
    private int age;

    // Setter
    public void setName(String name){
        if(name.equals("\\d+")){
            throw new IllegalArgumentException("Name must not be consist only number.");
        }
        if(name.equals("[\\p{L}\\s'\\-\\.]+")){
            throw new IllegalArgumentException("Name contain invalid characters. Only letters, space, ', -, . are allowed:");
        }
        this.name = name;
    }
    public void setGender(String gender){
        if("male".equalsIgnoreCase(gender) || "m".equalsIgnoreCase(gender)){
            this.gender = gender;
        }
        if("female".equalsIgnoreCase(gender) || "f".equalsIgnoreCase(gender)){
            this.gender = gender;
        }
        this.gender = null;
    }
    public void setAge(int age){
        if(age > 0){
            this.age = age;
        }
    }

    // Getter
    public String getName(){
        return name;
    }
    public String getGender(){
        return gender;
    }
    public int getAge(){
        return age;
    }
}

