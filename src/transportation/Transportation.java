package transportation;

public abstract class Transportation {

    String number;
    String model;
    String admin;

    public Transportation(){
        super();
    }
    public Transportation(String number, String model, String admin){
        this.number = number;
        this.model = model;
        this.admin = admin;
    }

    public String getNumber() {
        return number;
    }

    public String getModel() {
        return model;
    }

    public String getAdmin() {
        return admin;
    }
}
