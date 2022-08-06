public class Passanger {
    private String FirstName;
    private String SecondName;
    private String VehcleNum;
    private int NumofLiters;



    public Passanger(){
        this.FirstName=null;
        this.SecondName=null;
        this.VehcleNum=null;
        this.NumofLiters=0;

    }
    //assigning the variables
    public void setName(String FirstName,String SecondName,String VehcleNum,int NumofLiters){
        this.FirstName=FirstName;
        this.SecondName=SecondName;
        this.VehcleNum=VehcleNum;
        this.NumofLiters=NumofLiters;
    }


    public String getName() {
        return this.FirstName+" "+this.SecondName+" "+this.VehcleNum+" "+this.NumofLiters;
    }

}
