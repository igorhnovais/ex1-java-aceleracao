public class Holidayzer {
	//Parâmetros
    private String data;
	private String name;


    //Construtor
    public Holidayzer(String data, String name) {
		this.SetName(name);
		this.SetData(data);
	}


    //Getters and Setters
    public String GetData(){
        return this.data;
    }

    public void SetData(String data){
        this.data = data;
    }

    public String GetName(){
        return this.name;
    }

    public void SetName(String name){
        this.name = name;
    }


    @Override
    public String toString(){
        return this.GetData() + " => " + this.GetName();
    }
}
