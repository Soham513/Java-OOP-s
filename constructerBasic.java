//constructer overload means multiple constructer in a class which can be identified by diff parameter list

public class constructerBasic {
    public static void main(String[] args) {
        Car car1 = new Car("RX","Nisan",2002);
       
            Car car2 = new Car("V24" , "Kazumi");
            Car car3 = new Car();
            



    System.out.println("this is car 1  :"+car1.name);
    System.out.println("this is car 2  : " + car2.name);
    //car3.name = "Supra";
    System.out.println("This is car 3 constructer chaining :"  + car3.name +"   "+ car3.model+ "    " + car3.year);
    }
}
class Car{
    String model;
    String name;
    int year;

        //constructer
       public Car(String model,String name,int year){
            this.model = model;
            this.name = name;
            this.year = year;
            
        }
            //non parameterised constructer
            public Car(String model  ,String name){
                this.model = model;
                this.name = name;

            }
              /*   public Car(){
                    this.model = "excel";
                    this.name = "maruti";
                    this.year = 1999;
                }*/
                        //constructer chaining 
                        //Rule -- you cannot have 2 cons without args in one class
                        public Car(){
                            //this is how you call a constructer from another constructer
                            this ("Mitsubshi" , "revoke" , 2003);
                        }
                        

}
