package fr.wildcodeschool.thewizardproject.models;

public class Dumbledore implements WizardInterface {


    private DressInterface dress;

    public Dumbledore(DressInterface dress) {
        this.dress = dress;
    }


    @Override
    public String giveAdvice() {
        return "Tu peux réussir à la Wild si tu travailles dur !";
    }

    @Override
    public String changeDress() {
        return this.dress.changeDress();
    }
}
