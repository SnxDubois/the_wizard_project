package fr.wildcodeschool.thewizardproject.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("dumbledore")
public class Dumbledore implements WizardInterface {


    private DressInterface dress;

    @Autowired
    public Dumbledore(@Qualifier("dress") DressInterface dressInterface) {
        this.dress = dressInterface;
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
