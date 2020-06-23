package SDAShadulerClassExample.Model;

import java.time.LocalDate;

public class Trainer extends Person {

    private boolean isAuthorised;

    public Trainer (){

    }


    public Trainer(String firstName, String lastName, LocalDate dateOfBirth, boolean isAuthorised) {
        super(firstName, lastName, dateOfBirth);
        this.isAuthorised = isAuthorised;
    }

    public boolean isAuthorised() {
        return isAuthorised;
    }

    public void setAuthorised(boolean authorised) {
        isAuthorised = authorised;
    }

    @Override
    public String toString() {
        return "Trainer{" + super.toString()+
                "isAuthorised=" + isAuthorised +
                '}';
    }
}
