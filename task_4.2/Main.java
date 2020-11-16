public class Main {
    public static void main(String[] args) {
        Dog puppy = new Dog("Бобик",3); //не понимаю почему ошибка
        puppy.getInfo();
    }
}
            class Dog {
            private String name;
            private int age;
            
            public String getName() {
                return name;
            }
            public String setName(String name) {
                this.name = name;
            }
                public int getAge() {
                return age;
            }
            public int setAge(int age) {
                this.age = age;
            }    
             public void getInfo(){
             System.out.println(this.name);    
            }
        }
