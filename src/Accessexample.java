//class Applform{
//
//    private String Name;
//    int age;
//
//    public void display()
//    {
//        System.out.println(Name);
//        System.out.println(age);
//    }
//
//    public void setName(String name) {
//        Name = name;
//    }
//
//    public String getName() {
//        return Name;
//    }
//}
//
//
//
//public class Accessexample {
//    public static void main(String[] args) {
//        Applform obj = new Applform();
//        obj.setName("Arun");
//
//        String name= obj.getName();
//        System.out.println(name);
//
//    }
//}

//class Applform {
//
//    private String Name;
//    private int age;  // Made private for better encapsulation
//
//    public void display() {
//        System.out.println("Name: " + Name);
//        System.out.println("Age: " + age);
//    }
//
//    public void setName(String name) {
//        Name = name;
//    }
//
//    public String getName() {
//        return Name;
//    }
//
//    public void setAge(int age) {  // Setter for age
//        this.age = age;
//    }
//
//    public int getAge() {  // Getter for age
//        return age;
//    }
//}
//
//public class Accessexample {
//    public static void main(String[] args) {
//        Applform obj = new Applform();
//        obj.setName("Arun");
//        obj.setAge(25);  // Setting age
//
//        String name = obj.getName();
//        int age = obj.getAge();
//
//        System.out.println(name);
//        System.out.println(age);
//
//        obj.display();  // Now prints name and age properly
//    }
//}
