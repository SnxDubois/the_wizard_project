package fr.wildcodeschool.thewizardproject.models;

public class Gandalf implements WizardInterface {

    private DressInterface dress;

    public Gandalf(DressInterface dressInterface) {
        this.dress = dressInterface;
    }


    public String giveAdvice() {
        return "Tu peux réussir cette quête !";
    }

    public String changeDress() {
        return this.dress.changeDress();
    }

}
